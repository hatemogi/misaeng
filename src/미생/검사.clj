(ns 미생.검사
  (:use [clojure.test]
        [미생.기본]))

(매크로대응 검사정의 clojure.test/deftest)
(매크로대응 검사정의- clojure.test/deftest-)
(매크로대응 검사 clojure.test/testing)
(매크로대응 확인 clojure.test/is)
(매크로대응 확인* clojure.test/are)
(매크로대응 검사포함 clojure.test/with-test)
(매크로대응 검사설정 clojure.test/use-fixtures)

(메소드정의 assert-expr '예외발생? [msg form]
  (assert-expr msg (cons 'thrown? (rest form))))

(정의* 함수? function?
       검사하기 run-tests
       모든검사하기 run-all-tests)
