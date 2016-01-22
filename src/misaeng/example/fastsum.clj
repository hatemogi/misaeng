(ns misaeng.example.fastsum
  (:use [misaeng.core]))

(함수 적용총합 [n]
  "1부터 N까지의 모든 수를 더한다"
  (적용 + (범위 (증가 n))))

(함수 재귀총합 [n]
  "1부터 N까지의 모든 수를 더한다. 재귀호출 버전"
  (만약 (= n 1)
        1
        (+ n (재귀총합 (감소 n)))))

(함수 루프재귀총합 [n]
  "1부터 N까지의 모든 수를 더한다. 루프사용 재귀호출 버전"
  (루프 [n n
         s 1]
        (만약 (= n 1)
              s
              (재귀 (감소 n) (+ s n)))))

(함수 분할총합 [n]
  "1부터 N까지의 모든 수를 더한다. 분할정복 버전"
  (조건
   (= n 1) 1
   (홀수? n) (+ n (분할총합 (감소 n)))
   :짝수 (가정 [n' (/ n 2)]
               (+ (* 2 (분할총합 n'))
                  (* n' n')))))