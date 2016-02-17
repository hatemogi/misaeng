(ns 미생.예제.계승
  (:use [미생.기본]
        [미생.실험]))

(함수 자연수? [n]
  (논리곱 (정수? n)
          (논리합 (양? n) (영? n))))

(함수 계승
  "계승(factorial)을 구한다. 단순한 재귀호출 버전."
  [n]
  (만약 (<= n 1)
        1
        (*' n (계승 (감소 n)))))

(함수 계승'
  "계승(factorial) 구하기. 적용 함수 이용 버전."
  [n]
  (적용 *' (범위 2 (증가 n))))


(실험정의 계승실험
  (실험 "계승(factorial)"
    (확인* [x y] (= (계승 x) y)
           0 1
           1 1
           2 2
           3 6
           4 24
           5 120))
  (실험 "계승(factorial) 적용 함수 버전"
    (확인 (= (사상 계승 (범위 100))
             (사상 계승' (범위 100))))))
