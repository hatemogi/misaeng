(ns klojure.example-test
  (:require [klojure.core :refer :all]
            [klojure.test :refer :all]
            [klojure.example :refer :all]))

(실험함수 예제실험
  (실험 "계승 결과값 확인"
    (확인* [n e] (= (계승 n) e)
           0 1
           1 1
           2 2
           3 6
           4 24
           5 120)))
