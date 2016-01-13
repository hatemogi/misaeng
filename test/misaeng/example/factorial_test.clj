(ns misaeng.example.factorial-test
  (:use [misaeng.core]
        [misaeng.test]
        [misaeng.example.factorial]))

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
             (맵 계승' (범위 100))))))
