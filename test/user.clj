(ns user
  (:use [미생.기본]
        [미생.검사]
        [clojure.repl])
  (:require [clojure.tools.namespace.repl :refer [refresh]]
            [미생.기본-검사]
            [미생.검사-검사]
            [미생.예제.계승]
            [미생.예제.총합]
            [미생.예제.쿼드트리]
            [미생.예제.피보나치]))

(defn T [& namespaces]
  (적용 검사하기 (or namespaces
                         ['미생.기본-검사
                          '미생.검사-검사
                          '미생.예제.계승
                          '미생.예제.총합
                          '미생.예제.쿼드트리
                          '미생.예제.피보나치
                          ])))
