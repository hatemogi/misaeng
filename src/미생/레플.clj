(ns 미생.레플
  (:use [미생.기본])
  (:require [clojure.repl]))

(매크로대응 설명 clojure.repl/doc)
(매크로대응 소스 clojure.repl/source)
(매크로대응 열람 clojure.repl/dir)
(매크로대응 설명찾기 clojure.repl/find-doc)
(매크로대응 정의현황 clojure.repl/apropos)
(정의* pst clojure.repl/pst
       demunge clojure.repl/demunge)
