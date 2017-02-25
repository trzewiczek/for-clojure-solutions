(ns for-clojure.elementary-test
  (:require [clojure.test :refer :all]
            [clojure.set]
            [for-clojure.elementary :refer :all]))


(deftest elementary-tests

  ;; Problem 1
  (testing "Nothing but the Truth"
    (is (= nothing-but-the-truth true)))


  ;; Problem 2
  (testing "Simple Math"
    (is (= (- 10 (* 2 3)) simple-math)))


  ;; Problem 3
  (testing "Intro to Strings"
    (is (= intro-to-strings (.toUpperCase "hello world"))))


  ;; Problem 4
  (testing "Intro to Lists"
    (is (= intro-to-lists '(:a :b :c))))


  ;; Problem 5
  (testing "Lists: conj"
    (is (= lists-conj (conj '(2 3 4) 1)))
    (is (= lists-conj (conj '(3 4) 2 1))))


  ;; Problem 6
  (testing "Intro to Vectors"
    ;; TODO make it run like an original problem
    (is (= intro-to-vectors (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))))


  ;; Problem 7
  (testing "Vectors: conj"
    (is (= vectors-conj (conj [1 2 3] 4)))
    (is (= vectors-conj (conj [1 2] 3 4))))


  ;; Problem 8
  (testing "Intro to Sets"
    (is (= intro-to-sets (set '(:a :a :b :c :c :c :c :d :d))))
    (is (= intro-to-sets (clojure.set/union #{:a :b :c} #{:b :c :d}))))


  ;; Problem 9
  (testing "Sets: conj"
    (is (= #{1 2 3 4} (conj #{1 4 3} sets-conj))))


  ;; Problem 10
  (testing "Intro to Maps"
    (is (= intro-to-maps ((hash-map :a 10, :b 20, :c 30) :b))))


  ;; Problem 11
  (testing "Maps: conj"
    (is (= {:a 1, :b 2, :c 3} (conj {:a 1} maps-conj [:c 3]))))


  ;; Problem 12
  (testing "Intro to Sequences"
    (is (= intro-to-sequences (first '(3 2 1))))
    (is (= intro-to-sequences (second [2 3 4])))
    (is (= intro-to-sequences (last (list 1 2 3)))))


  ;; Problem 13
  (testing "Sequences: rest"
    (is (= sequences-rest (rest [10 20 30 40]))))


  ;; Problem 14
  (testing "Intro to Functions"
    (is (= intro-to-functions ((fn add-five [x] (+ x 5)) 3)))
    (is (= intro-to-functions ((fn [x] (+ x 5)) 3)))
    (is (= intro-to-functions (#(+ % 5) 3)))
    (is (= intro-to-functions ((partial + 5) 3))))


  ;; Problem 15
  (testing "Double Down"
    (is (= (double-down 2) 4))
    (is (= (double-down 3) 6))
    (is (= (double-down 11) 22))
    (is (= (double-down 7) 14)))


  ;; Problem 16
  (testing "Hello World"
    (is (= (hello-world "Dave") "Hello, Dave!"))
    (is (= (hello-world "Jenn") "Hello, Jenn!"))
    (is (= (hello-world "Rhea") "Hello, Rhea!")))


  ;; Problem 17
  (testing "Sequences: map"
    (is (= sequences-map (map #(+ % 5) '(1 2 3)))))


  ;; Problem 18
  (testing "Sequences: filter"
    (is (= sequences-filter (filter #(> % 5) '(3 4 5 6 7)))))


  ;; Problem 35
  (testing "Local binding"
    (is (= local-binding (let [x 5] (+ 2 x))))
    (is (= local-binding (let [x 3, y 10] (- y x))))
    (is (= local-binding (let [x 21] (let [y 3] (/ x y))))))


  ;; Problem 36
  (testing "Let it Be"
    (= 10 (let [x 7 y 3 z 1] (+ x y)))
    (= 4  (let [x 7 y 3 z 1] (+ y z)))
    (= 1  (let [x 7 y 3 z 1] z)))


  ;; Problem 37
  (testing "Regular Expressions"
    (is (= regular-expressions (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))))


  ;; Problem 52
  (testing "Intro to Destructuring"
    (is (= [2 4] (let [[a b c d e] [0 1 2 3 4]] [c e]))))


  ;; Problem 57
  (testing "Simple Recursion"
    (is (= simple-recursion
           ((fn foo [x]
              (when (> x 0)
                (conj (foo (dec x)) x))) 5))))


  ;; Problem 64
  (testing "Intro to Reduce"
    (is (= 15 (reduce intro-to-reduce [1 2 3 4 5])))
    (is (=  0 (reduce intro-to-reduce [])))
    (is (=  6 (reduce intro-to-reduce 1 [2 3]))))


  ;; Problem 68
  (testing "Recurring Theme"
    (is (= recurring-theme
           (loop [x 5
                  result []]
             (if (> x 0)
               (recur (dec x) (conj result (+ 2 x)))
               result)))))


  ;; Problem 71
  (testing "Rearranging Code: ->"
    (is (= (rearranging-code-> (sort (rest (reverse [2 5 4 1 3 6]))))
           (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (rearranging-code->))
           5)))


  ;; Problem 72
  (testing "Rearranging Code: ->>"
    (is (= (rearranging-code->> (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
   (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (rearranging-code->>))
   11)))


  ;; Problem 134
  (testing "A nil key"
    (is (true?  (a-nil-key :a {:a nil :b 2})))
    (is (false? (a-nil-key :b {:a nil :b 2})))
    (is (false? (a-nil-key :c {:a nil :b 2}))))



  ;; Problem 145
(testing "For the win"
  (is (= for-the-win (for [x (range 40)
                           :when (= 1 (rem x 4))]
                       x)))
  (is (= for-the-win (for [x (iterate #(+ 4 %) 0)
                           :let [z (inc x)]
                           :while (< z 40)]
                       z)))
  (is (= for-the-win (for [[x y] (partition 2 (range 20))]
                       (+ x y)))))


  ;; Problem 156
  (testing "Map Defaults"
    (is (= (map-defaults 0 [:a :b :c]) {:a 0 :b 0 :c 0}))
    (is (= (map-defaults "x" [1 2 3]) {1 "x" 2 "x" 3 "x"}))
    (is (= (map-defaults [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})))


  ;; Problem 161
  (testing "Subset and Superset"
    (is (clojure.set/superset? subset-and-superset #{2}))
    (is (clojure.set/subset? #{1} subset-and-superset))
    (is (clojure.set/superset? subset-and-superset #{1 2}))
    (is (clojure.set/subset? #{1 2} subset-and-superset)))


  ;; Problem 162
  (testing "Logical falsity and truth"
    (is (= logical-falsity-and-truth (if-not false 1 0)))
    (is (= logical-falsity-and-truth (if-not nil 1 0)))
    (is (= logical-falsity-and-truth (if true 1 0)))
    (is (= logical-falsity-and-truth (if [] 1 0)))
    (is (= logical-falsity-and-truth (if [0] 1 0)))
    (is (= logical-falsity-and-truth (if 0 1 0)))
    (is (= logical-falsity-and-truth (if 1 1 0))))

)


