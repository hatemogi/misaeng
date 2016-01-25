(ns 미생.예제.쿼드트리
  (:use [미생.기본]
        [미생.실험])
  (:import [java.io StringReader]))

(함수 위아래반전
  "쿼드트리 압축표현 문자열을 받아서 흑백 반전한 결과를 돌려준다.
  알고리즘 문제 해결 전략 194p., 구종만 지음, 인사이트 출판"
  [^String s]
  (가정함 [(f [^StringReader sr]
              (가정 [첫자 (char (.read sr))]
                (만약 (or (= \b 첫자) (= \w 첫자))
                      (str 첫자)
                      (가정 [위왼 (f sr)
                             위오른 (f sr)
                             아래왼 (f sr)
                             아래오른 (f sr)]
                        (str "x" 아래왼 아래오른 위왼 위오른)))))]
    (f (StringReader. s))))

(실험정의 위아래반전실험
  (실험 "반전결과확인"
    (확인* [x y] (= y (위아래반전 x))
           "b" "b"
           "w" "w"
           "xbwwb" "xwbbw"
           "xbwxwbbwb" "xxbwwbbbw"
           "xxwwwbxwxwbbbwwxxxwwbbbwwwwbb" "xxwbxwwxbbwwbwbxwbwwxwwwxbbwb")))
