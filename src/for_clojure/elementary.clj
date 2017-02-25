(ns for-clojure.elementary)


;; Problem 1
(def nothing-but-the-truth true)


;; Problem 2
(def simple-math 4)


;; Problem 3
(def intro-to-strings "HELLO WORLD")


;; Problem 4
(def intro-to-lists '(:a :b :c))


;; Problem 5
(def lists-conj '(1 2 3 4))


;; Problem 6
(def intro-to-vectors [:a :b :c])


;; Problem 7
(def vectors-conj [1 2 3 4])


;; Problem 8
(def intro-to-sets #{:a :b :c :d})


;; Problem 9
(def sets-conj 2)


;; Problem 10
(def intro-to-maps 20)


;; Problem 11
(def maps-conj [:b 2])


;; Problem 12
(def intro-to-sequences 3)


;; Problem 13
(def sequences-rest '(20 30 40))


;; Problem 14
(def intro-to-functions 8)


;; Problem 15
(defn double-down [number] (* number 2))


;; Problem 16
(defn hello-world [name] (str "Hello, " name "!"))


;; Problem 17
(def sequences-map '(6 7 8))


;; Problem 18
(def sequences-filter '(6 7))


;; Problem 35
(def local-binding 7)


;; Problem 36
;; It hardcoded in tests:
;; [x 7 y 3 z 1]


;; Problem 37
(def regular-expressions "ABC")


;; Problem 52
;; It hardcoded in tests:
;; [c e]


;; Problem 57
(def simple-recursion '(5 4 3 2 1))


;; Problem 64
(def intro-to-reduce +)


;; Problem 68
(def recurring-theme [7 6 5 4 3])


;; Problem 71
(def rearranging-code-> last)


;; Problem 72
(def rearranging-code->> #(apply + %))


;; Problem 134
(defn a-nil-key [k m] (and (contains? m k)
                           (nil? (k m))))


;; Problem 145
(def for-the-win '(1 5 9 13 17 21 25 29 33 37))


;; Problem 156
(defn map-defaults [v ks] (zipmap ks (repeat v)))


;; Problem 161
(def subset-and-superset #{1 2})


;; Problem 162
(def logical-falsity-and-truth 1)
