(ns misaeng.example.fastsum-test
  (:use [misaeng.core]
        [misaeng.test]
        [misaeng.example.fastsum]))

(실험함수 총합실험
  (실험 "1부터 N까지 모든 수의 합"
    (확인* [x y] (= (적용총합 x) y)
           1 1
           2 3
           3 6
           4 10
           5 15
           10 55))
  (실험 "각 버전 같은 값인지 확인"
    (가정 [영역 (범위 1 (증가 10000))]
          (확인 (= (맵 적용총합 영역)
                   (맵 재귀총합 영역)
                   (맵 루프재귀총합 영역)
                   (맵 분할총합 영역))))))
