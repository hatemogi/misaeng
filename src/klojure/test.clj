(ns klojure.test
  (:require [clojure.test :refer :all]))

(defmacro 테스트함수
  "clojure.test/deftest. 테스트 함수."
  [심볼 & 본문]
  `(deftest ~심볼 ~@본문))

(defmacro 테스트
  "clojure.test/testing. 개별 테스트케이스."
  [설명 & 본문]
  `(testing ~설명 ~@본문))

(defmacro 확인
  "clojure.test/is. 해당 평가식이 참인지 확인."
  ([폼] `(is ~폼))
  ([폼 설명] `(is ~폼 ~설명)))
