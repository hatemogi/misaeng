(ns 미생.검사-검사
  (:use [미생.기본]
        [미생.검사]))

(검사정의 검사검사
  (검사 "예외발생? 검사"
    (확인 (예외발생? Exception (예외발생 (RuntimeException.))))))
