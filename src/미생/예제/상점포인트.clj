(ns ^{:doc "문제풀이 - https://code.google.com/codejam/contest/dashboard?c=351101"
      :author "김대현"}
    미생.예제.상점포인트
  (:use [미생.기본]
        [미생.검사])
  (:import [java.io BufferedReader BufferedWriter StringReader StringWriter]))

(함수 풀이 [인덱스 크레딧 값들]
  (가정 [기준값 (첫째 값들)
         후보 (잔여 값들)
         짝인덱스 (증가 (.indexOf 후보 (- 크레딧 기준값)))]
    (만약 (양? 짝인덱스)
      [인덱스 (+ 인덱스 짝인덱스)]
      (재귀 (증가 인덱스) 크레딧 후보))))

(함수- main []
  (누차 [n (read-string (read-line))]
    (가정 [[크레딧 _ 값들] (반복해서 3 read-line)
           값들 (사상 read-string (re-seq #"\d+" 값들))
           답 (풀이 1 (read-string 크레딧) 값들)]
      (println (str "Case #" (증가 n) ": " (첫째 답) " " (둘째 답))))))

(정의 예제입력 "3
100
3
5 75 25
200
7
150 24 79 50 88 345 3
8
8
2 1 9 4 4 56 90 3")

(정의 예제답안 "Case #1: 2 3
Case #2: 1 4
Case #3: 4 5
")

(검사정의 상점포인트검사
  (검사 "예제확인"
    (가정 [출력 (StringWriter.)]
      (바인딩 [*in* (BufferedReader. (StringReader. 예제입력))
               *out* (BufferedWriter. 출력)]
        (main))
      (확인 (= 예제답안 (.toString 출력))))))
