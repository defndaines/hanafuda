(ns hanafuda.yaku
  "Yaku functions."
  (:require [clojure.set]))


(defn plains?
  "Ten or more cards which are all plain (カス) are worth one point apiece."
  [hand]
  (let [カス (filter #(= :カス (:点 %)) hand)]
    (when (<= 10 (count カス))
      (count カス))))

;; Bake-Fuda (Wild Card)
;; The sake cup can be used as a plain card.
;; If you have this, 9 plain cards and this card will be the Yaku of Kasu.

(def kasu? plains?)
(def カス? plains?)


(defn ribbons?
  "Five or more ribbons (短冊) are worth one point apiece."
  [hand]
  (let [短冊 (filter #(= :短冊 (:点 %)) hand)]
    (when (<= 5 (count 短冊))
      (count 短冊))))

(def tanzaku? ribbons?)
(def 短冊? ribbons?)

(defn red-poetry-ribbons?
  "All three red poetry ribbons are worth six points."
  [hand]
  (when (= 3
           (count (filter #(= :red-poetry-ribbon (:type %))
                          hand)))
    6))

(def akatan? red-poetry-ribbons?)
(def 赤短? red-poetry-ribbons?)

(defn blue-ribbons?
  "All three blue ribbons are worth six points."
  [hand]
  (when (= 3
           (count (filter #(= :blue-ribbon (:type %))
                          hand)))
    6))

(def aotan? blue-ribbons?)
(def 青短? blue-ribbons?)


(defn animals?
  "Five or more animals are worth one point apiece."
  [hand]
  (let [種 (filter #(= :種 (:点 %)) hand)]
    (when (<= 5 (count 種))
      (count 種))))

(def tane? animals?)
(def 種? animals?)


(defn boar-deer-butterfly?
  "The boar, deer, and butterfly cards together are worth five points."
  [hand]
  (when (clojure.set/subset?
            #{:boar :deer :butterflies}
            (set (map :type hand)))
      5))

(def ino-shika-cho? boar-deer-butterfly?)


(defn brights?
  "Handle scoring for brights.
  - Three brights without the Rainman is six points.
  - Four brights with the Rainman is eight points.
  - Four brights without the Rainman is ten points.
  - All brights are fifteen points."
  [hand]
  (let [brights (filter #(= :光 (:点 %)) hand)
        rainman? (seq (filter #(= :rainman (:type %)) brights))]
    (case (count brights)
      5 15 ; goko
      4 (if rainman? 8 10) ; ame-shiko - shiko
      3 (when-not rainman? 6)))) ; sanko


(defn tsuki-fuda?
  "All four cards in one month is four points."
  [hand]
  (->> (map :month hand)
       frequencies
       (filter (fn [[_ v]] (= 4 v)))
       count
       (* 4)))
