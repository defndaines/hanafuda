(ns hanafuda.cards
  "Hanafuda deck.")

(def deck
  "A full deck of hanafuda cards."
  [{:month :january
    :hana :matsu :花 :松 :flower :pine
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-01c.png"}
   {:month :january
    :hana :matsu :花 :松 :flower :pine
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-01d.png"}
   {:month :january
    :hana :matsu :花 :松 :flower :pine
    :points 5 :点 :短冊
    :type :red-poetry-ribbon
    :image "kintengu-01h.png"}
   {:month :january
    :hana :matsu :花 :松 :flower :pine
    :points 20 :点 :光
    :type :crane
    :image "kintengu-01s.png"}
   {:month :february
    :hana :ume :花 :梅 :flower :plum-blossom
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-02c.png"}
   {:month :february
    :hana :ume :花 :梅 :flower :plum-blossom
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-02d.png"}
   {:month :february
    :hana :ume :花 :梅 :flower :plum-blossom
    :points 5 :点 :短冊
    :type :red-poetry-ribbon
    :image "kintengu-02h.png"}
   {:month :february
    :hana :ume :花 :梅 :flower :plum-blossom
    :points 10 :点 :種
    :type :bush-warbler
    :image "kintengu-02s.png"}
   {:month :march
    :hana :sakura :花 :桜 :flower :cherry-blossom
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-03c.png"}
   {:month :march
    :hana :sakura :花 :桜 :flower :cherry-blossom
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-03d.png"}
   {:month :march
    :hana :sakura :花 :桜 :flower :cherry-blossom
    :points 5 :点 :短冊
    :type :red-poetry-ribbon
    :image "kintengu-03h.png"}
   {:month :march
    :hana :sakura :花 :桜 :flower :cherry-blossom
    :points 20 :点 :光
    :type :camp-curtain
    :image "kintengu-03s.png"}
   {:month :april
    :hana :fuji :花 :藤 :flower :wisteria
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-04c.png"}
   {:month :april
    :hana :fuji :花 :藤 :flower :wisteria
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-04d.png"}
   {:month :april
    :hana :fuji :花 :藤 :flower :wisteria
    :points 5 :点 :短冊
    :type :red-ribbon
    :image "kintengu-04h.png"}
   {:month :april
    :hana :fuji :花 :藤 :flower :wisteria
    :points 10 :点 :種
    :type :cuckoo
    :image "kintengu-04s.png"}
   {:month :may
    :hana :ayame :花 :菖蒲 :flower :iris
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-05c.png"}
   {:month :may
    :hana :ayame :花 :菖蒲 :flower :iris
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-05d.png"}
   {:month :may
    :hana :ayame :花 :菖蒲 :flower :iris
    :points 5 :点 :短冊
    :type :red-ribbon
    :image "kintengu-05h.png"}
   {:month :may
    :hana :ayame :花 :菖蒲 :flower :iris
    :points 10 :点 :種
    :type :eight-plank-bridge
    :image "kintengu-05s.png"}
   {:month :june
    :hana :botan :花 :牡丹 :flower :peony
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-06c.png"}
   {:month :june
    :hana :botan :花 :牡丹 :flower :peony
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-06d.png"}
   {:month :june
    :hana :botan :花 :牡丹 :flower :peony
    :points 5 :点 :短冊
    :type :blue-ribbon
    :image "kintengu-06h.png"}
   {:month :june
    :hana :botan :花 :牡丹 :flower :peony
    :points 10 :点 :種
    :type :butterflies
    :image "kintengu-06s.png"}
   {:month :july
    :hana :hagi :花 :萩 :flower :bush-clover
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-07c.png"}
   {:month :july
    :hana :hagi :花 :萩 :flower :bush-clover
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-07d.png"}
   {:month :july
    :hana :hagi :花 :萩 :flower :bush-clover
    :points 5 :点 :短冊
    :type :red-ribbon
    :image "kintengu-07h.png"}
   {:month :july
    :hana :hagi :花 :萩 :flower :bush-clover
    :points 10 :点 :種
    :type :boar
    :image "kintengu-07s.png"}
   {:month :august
    :hana :susuki :花 :薄 :flower :susuki-grass
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-08c.png"}
   {:month :august
    :hana :susuki :花 :薄 :flower :susuki-grass
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-08d.png"}
   {:month :august
    :hana :susuki :花 :薄 :flower :susuki-grass
    :points 10 :点 :種
    :type :geese
    :image "kintengu-08h.png"}
   {:month :august
    :hana :susuki :花 :薄 :flower :susuki-grass
    :points 20 :点 :光
    :type :moon
    :image "kintengu-08s.png"}
   {:month :september
    :hana :kiku :花 :菊 :flower :chrysanthemum
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-09c.png"}
   {:month :september
    :hana :kiku :花 :菊 :flower :chrysanthemum
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-09d.png"}
   {:month :september
    :hana :kiku :花 :菊 :flower :chrysanthemum
    :points 5 :点 :短冊
    :type :blue-ribbon
    :image "kintengu-09h.png"}
   {:month :september
    :hana :kiku :花 :菊 :flower :chrysanthemum
    :points 10 :点 :種
    :type :sake-cup
    :image "kintengu-09s.png"}
   {:month :october
    :hana :momiji :花 :紅葉 :flower :maple
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-10c.png"}
   {:month :october
    :hana :momiji :花 :紅葉 :flower :maple
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-10d.png"}
   {:month :october
    :hana :momiji :花 :紅葉 :flower :maple
    :points 5 :点 :短冊
    :type :blue-ribbon
    :image "kintengu-10h.png"}
   {:month :october
    :hana :momiji :花 :紅葉 :flower :maple
    :points 10 :点 :種
    :type :deer
    :image "kintengu-10s.png"}
   {:month :november
    :hana :yanagi :花 :柳 :flower :willow
    :points 5 :点 :短冊
    :type :red-ribbon
    :image "kintengu-11d.png"}
   {:month :november
    :hana :yanagi :花 :柳 :flower :willow
    :points 1 :点 :カス
    :type :lightning
    :image "kintengu-11c.png"}
   {:month :november
    :hana :yanagi :花 :柳 :flower :willow
    :points 10 :点 :種
    :type :swallow
    :image "kintengu-11h.png"}
   {:month :november
    :hana :yanagi :花 :柳 :flower :willow
    :points 20 :点 :光
    :type :rainman
    :image "kintengu-11s.png"}
   {:month :december
    :hana :kiri :花 :桐 :flower :paulownia
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-12c.png"}
   {:month :december
    :hana :kiri :花 :桐 :flower :paulownia
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-12d.png"}
   {:month :december
    :hana :kiri :花 :桐 :flower :paulownia
    :points 1 :点 :カス
    :type :normal
    :image "kintengu-12h.png"}
   {:month :december
    :hana :kiri :花 :桐 :flower :paulownia
    :points 20 :点 :光
    :type :phoenix
    :image "kintengu-12s.png"}])


(def months-in-order
  "Vector of the months in order."
  [:january :february :march :april :may :june :july :august :september
   :october :november :december])

(defn month-index
  "Month index of a card. January is 0, December is 11."
  [card]
  (.indexOf months-in-order (:month card)))

(defn earliest
  "Return the earliest card of two, or :same if they are from the same month."
  [card-one card-two]
  (let [month-one (month-index card-one)
        month-two (month-index card-two)]
    (cond
      (< month-one month-two) card-one
      (< month-two month-one) card-two
      :else :same)))


(def types-in-order
  "Vector of the types (:点) in order (for determining who goes first)."
  [:光 :種 :短冊 :カス])

(defn type-index
  "Type index of a card. Brights are 0, normals are 3."
  [card]
  (.indexOf types-in-order (:点 card)))

(defn higher-type-card
  "Return the higher typed card of two, or :undefined if they are of the same
  type."
  [card-one card-two]
  (let [type-one (type-index card-one)
        type-two (type-index card-two)]
    (cond
      (< type-one type-two) card-one
      (< type-two type-one) card-two
      :else :same)))


(defn who-goes-first
  "Given two cards, one from each player, determine who starts play.  If the
  cards are of different months, then the card closest to January goes first.
  If both cards are of the same month, then the priority is brights, animals,
  ribbons, kasu. If a winner cannot be determined, returns :same and both
  players should submit a new card. This should only be necessary when
  starting play; for subsequent rounds, the previous winner goes first."
  [card-one card-two]
  (let [earliest-card (earliest card-one card-two)]
    (if (= :same earliest-card)
      (higher-type-card card-one card-two)
      earliest-card)))
