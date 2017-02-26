(ns for-clojure.easy-test
  (:require [clojure.test :refer :all]
            [for-clojure.easy :refer :all]))


(deftest easy-tests

  ;; Problem 19
  (testing "Last Element"
    (is (= (last-element [1 2 3 4 5]) 5))
    (is (= (last-element '(5 4 3)) 3))
    (is (= (last-element ["b" "c" "d"]) "d")))


  ;; Problem 20
  (testing "Penultimate Element"
    (is (= (penulimate-element (list 1 2 3 4 5)) 4))
    (is (= (penulimate-element ["a" "b" "c"]) "b"))
    (is (= (penulimate-element [[1 2] [3 4]]) [1 2])))


  ;; Problem 21
  (testing "Nth Element"
    (is (= (nth-element '(4 5 6 7) 2) 6))
    (is (= (nth-element [:a :b :c] 0) :a))
    (is (= (nth-element [1 2 3 4] 1) 2))
    (is (= (nth-element '([1 2] [3 4] [5 6]) 2) [5 6])))


  ;; Problem 22
  (testing "Count a Sequence"
    (is (= (count-a-sequence '(1 2 3 3 1)) 5))
    (is (= (count-a-sequence "Hello World") 11))
    (is (= (count-a-sequence [[1 2] [3 4] [5 6]]) 3))
    (is (= (count-a-sequence '(13)) 1))
    (is (= (count-a-sequence '(:a :b :c)) 3)))


  ;; Problem 23
  (testing "Reverse a Sequence"
    (is (= (reverse-a-sequence [1 2 3 4 5]) [5 4 3 2 1]))
    (is (= (reverse-a-sequence (sorted-set 5 7 2 7)) '(7 5 2)))
    (is (= (reverse-a-sequence [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])))


  ;; Problem 24
  (testing "Sum It All Up"
    (is (= (sum-it-all-up [1 2 3]) 6))
    (is (= (sum-it-all-up (list 0 -2 5 5)) 8))
    (is (= (sum-it-all-up #{4 2 1}) 7))
    (is (= (sum-it-all-up '(0 0 -1)) -1))
    (is (= (sum-it-all-up '(1 10 3)) 14)))


  ;; Problem 25
  (testing "Find the odd numbers"
    (is (= (find-the-odd-numbers #{1 2 3 4 5}) '(1 3 5)))
    (is (= (find-the-odd-numbers [4 2 1 6]) '(1)))
    (is (= (find-the-odd-numbers [2 2 4 6]) '()))
    (is (= (find-the-odd-numbers [1 1 1 3]) '(1 1 1 3))))


  ;; Problem 26
  (testing "Fibonacci Sequence"
    (is (= (fibonacci-sequence 3) '(1 1 2)))
    (is (= (fibonacci-sequence 6) '(1 1 2 3 5 8)))
    (is (= (fibonacci-sequence 8) '(1 1 2 3 5 8 13 21))))


  ;; Problem 27
  (testing "Palindrome Detector"
    (is (false? (palindrome-detector '(1 2 3 4 5))))
    (is (true? (palindrome-detector "racecar")))
    (is (true? (palindrome-detector [:foo :bar :foo])))
    (is (true? (palindrome-detector '(1 1 3 3 1 1))))
    (is (false? (palindrome-detector '(:a :b :c)))))


  ;; Problem 28
  (testing "Flatten a Sequence"
    (is (= (flatten-a-sequence '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
    (is (= (flatten-a-sequence ["a" ["b"] "c"]) '("a" "b" "c")))
    (is (= (flatten-a-sequence '((((:a))))) '(:a))))


  ;; Problem 29
  (testing "Get the Caps"
    (is (= (get-the-caps "HeLlO, WoRlD!") "HLOWRD"))
    (is (empty? (get-the-caps "nothing")))
    (is (= (get-the-caps "$#A(*&987Zf") "AZ")))


  ;; Problem 30
  (testing "Compress a Sequence"
    (is (= (apply str (compress-a-sequence "Leeeeeerrroyyy")) "Leroy"))
    (is (= (compress-a-sequence [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
    (is (= (compress-a-sequence [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))))


  ;; Problem 31
  (testing "Pack a Sequence"
    (is (= (pack-a-sequence [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))
    (is (= (pack-a-sequence [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))
    (is (= (pack-a-sequence [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))))


  ;; Problem 32
  (testing "Duplicate a Sequence"
    (is (= (duplicate-a-sequence [1 2 3]) '(1 1 2 2 3 3)))
    (is (= (duplicate-a-sequence [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))
    (is (= (duplicate-a-sequence [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))
    (is (= (duplicate-a-sequence [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))))



  ;; Problem 33
  (testing "Replicate a Sequence"
    (is (= (replicate-a-sequence [1 2 3] 2) '(1 1 2 2 3 3)))
    (is (= (replicate-a-sequence [:a :b] 4) '(:a :a :a :a :b :b :b :b)))
    (is (= (replicate-a-sequence [4 5 6] 1) '(4 5 6)))
    (is (= (replicate-a-sequence [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4])))
    (is (= (replicate-a-sequence [44 33] 2) [44 44 33 33])))
)


