(ns klojure.example
  (:require [klojure.core :refer :all]))

(함수 계승
  "계승(factorial)을 구한다."
  [n]
  (만약 (<= n 1)
       1
       (* n (계승 (감소 n)))))
