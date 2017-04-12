(ns 미생.집합
  (:use [clojure.set]
        [미생.기본]))

(정의*
  합집합 union
  차집합 difference
  교집합 intersection
  부분집합? subset?
  확대집합? superset?)
