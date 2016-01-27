(ns 미생.예제.피보나치
  (:use [미생.기본]
        [미생.실험]))

(함수 피보나치
  "피보나치 수 단순 재귀호출."
  [n]
  (조건p = n
         0 0
         1 1
         (+ (피보나치 (감소 n))
            (피보나치 (- n 2)))))

(정의 ^{:doc "피보나치 수 메모이제이션 활용버전"}
  피보나치m
  (memoize (fn [n]
             (조건p = n
                    0 0
                    1 1
                    (+ (피보나치m (감소 n))
                       (피보나치m (- n 2)))))))

(함수 피보나치수열
  ([] (피보나치수열 1 1))
  ([a b] (지연-열 (cons a (피보나치수열 b (+ a b))))))

(함수 피보나치l
  "피보나치수 지연평가 버전"
  [n]
  (nth (피보나치수열) (감소 n)))

(실험정의 피보나치실험
  (실험 "결과확인"
    (확인* [n r] (= (피보나치 n) r)
           0 0
           1 1
           2 1
           3 2
           4 3
           5 5))
  (실험 "버전간 값 확인"
    (확인 (= (맵 피보나치 (range 1 31))
             (맵 피보나치m (range 1 31))
             (take 30 (피보나치수열)))))

  (실험 "시간비교"
    (시간 (피보나치 30))
    (시간 (피보나치m 30))
    (시간 (피보나치l 30))))
