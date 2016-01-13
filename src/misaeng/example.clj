(ns misaeng.example
  (:require [misaeng.core :refer :all]))

(함수 자연수? [n]
  (논리곱 (정수? n)
          (논리합 (양수? n) (영? n))))

(함수 계승
  "계승(factorial)을 구한다. 단순한 재귀호출 버전."
  [n] {:pre [(자연수? n)]}
  (만약 (<= n 1)
        1
        (*' n (계승 (감소 n)))))

(함수 계승-적용
  "계승(factorial) 구하기. 적용 함수 이용 버전."
  [n] {:pre [(자연수? n)]}
  (적용 *' (범위 2 (증가 n))))
