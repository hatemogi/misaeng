(ns 미생.실험
  (:use [clojure.test]
        [미생.기본]))

(매크로대응 실험정의 clojure.test/deftest)
(매크로대응 실험정의- clojure.test/deftest-)
(매크로대응 실험 clojure.test/testing)
(매크로대응 확인 clojure.test/is)
(매크로대응 확인* clojure.test/are)
(매크로대응 실험포함 clojure.test/with-test)
(매크로대응 실험설정 clojure.test/use-fixtures)

(메소드정의 assert-expr '예외발생? [msg form]
  (assert-expr msg (cons 'thrown? (rest form))))

(정의 함수? function?)
(정의 실험시행 run-tests)
(정의 모든실험시행 run-all-tests)
