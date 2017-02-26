(ns for-clojure.easy)


;; Problem 19
(defn last-element [xs]
  (-> xs reverse first))


;; Problem 20
(defn penulimate-element [xs]
  (-> xs reverse second))


;; Problem 21
(defn nth-element [xs n]
  (first (drop n xs)))

;; Problem 22
(defn count-a-sequence [xs]
  (reduce (fn [c _] (inc c)) 0 xs))


;; Problem 23
(defn reverse-a-sequence [xs]
  (reduce #(cons %2 %1) '() xs))


;; Problem 24
(defn sum-it-all-up [xs]
  (reduce + xs))


;; Problem 25
(defn find-the-odd-numbers [xs]
  (filter odd? xs))


;; Problem 26
(defn fibonacci-sequence [n]
  (let [fib-seq ((fn fib [a b] (lazy-seq (cons b (fib b (+ a b))))) 0 1)]
    (take n fib-seq)))


;; Problem 27
(defn palindrome-detector [s]
  (= (seq s) (reverse s)))


;; Problem 28
(defn flatten-a-sequence [xs]
  (when-let [[head & tail] (seq xs)]
    (if (coll? head)
      (concat (flatten-a-sequence head)
              (flatten-a-sequence tail))
      (cons head (flatten-a-sequence tail)))))


;; Problem 29
(defn get-the-caps [s]
  (apply str (re-seq #"[A-Z]" s)))


;; Problem 30
(defn compress-a-sequence [xs]
  (when-let [[head & tail] (seq xs)]
    (if (not= head (first tail))
      (cons head (compress-a-sequence tail))
      (compress-a-sequence tail))))


;; Problem 31
(defn pack-a-sequence [xs]
  (partition-by identity xs))
