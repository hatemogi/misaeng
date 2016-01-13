(ns misaeng.example-test
  (:require [misaeng.core :refer :all]
            [misaeng.test :refer :all]
            [misaeng.example :refer :all]))

(실험함수 예제실험
  (실험 "계승(factorial)"
    (확인* [x y] (= (계승 x) y)
           0 1
           1 1
           2 2
           3 6
           4 24
           5 120))
  (실험 "계승(factorial) 적용 함수 버전"
    (확인 (= (맵 계승 (범위 100))
             (맵 계승-적용 (범위 100))))))
