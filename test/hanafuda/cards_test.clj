(ns hanafuda.cards-test
  (:require [clojure.test :refer [deftest testing is]]
            [hanafuda.cards :as cards]))

(deftest earliest-test
  (testing "determining which card is the earliest."
    (let [earlier (nth cards/deck 5)
          later (nth cards/deck 23)]
      (is (= earlier
             (cards/earliest earlier later)))
      (is (= earlier
             (cards/earliest later earlier)))
      (is (= :same
             (cards/earliest earlier (nth cards/deck 7)))))))


(deftest higher-type-card-test
  (testing "determine which card has the higher type."
    (let [bright (first (filter #(= :光 (:点 %)) cards/deck))
          ribbon (first (filter #(= :短冊 (:点 %)) cards/deck))
          animal (first (filter #(= :種 (:点 %)) cards/deck))
          kasu-one (first (filter #(= :カス (:点 %)) cards/deck))
          kasu-two (second (filter #(= :カス (:点 %)) cards/deck))]
      (is (= bright
             (cards/higher-type-card bright ribbon)))
      (is (= bright
             (cards/higher-type-card bright animal)))
      (is (= bright
             (cards/higher-type-card bright kasu-one)))
      (is (= bright
             (cards/higher-type-card bright kasu-two)))

      (is (= animal
             (cards/higher-type-card animal ribbon)))
      (is (= animal
             (cards/higher-type-card animal kasu-one)))
      (is (= animal
             (cards/higher-type-card animal kasu-two)))

      (is (= ribbon
             (cards/higher-type-card ribbon kasu-one)))
      (is (= ribbon
             (cards/higher-type-card ribbon kasu-two)))

      (is (= :same
             (cards/higher-type-card kasu-one kasu-two))))))
