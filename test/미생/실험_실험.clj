(ns 미생.실험-실험
  (:use [미생.기본]
        [미생.실험]))

(실험정의 실험실험
  (실험 "예외발생? 실험"
    (확인 (예외발생? Exception (예외발생 (RuntimeException.))))))
