(ns ^{:doc "클로저 한국어 확장"
      :author "김대현"}
    klojure.core)

(def
  ^{:arglists '([& 요소들])
    :doc "요소들을 담고 있는 리스트를 새로 만든다."
    :added "1.0"}
  리스트 (. clojure.lang.PersistentList creator))

(def
  ^{:macro true
    :added "1.0"}
  가정 (fn* 가정 [&form &env & decl] (cons 'let* decl)))

(def
  ^{:macro true
    :added "1.0"}
  루프 (fn* 루프 [&form &env & decl] (cons 'loop* decl)))

(def
  ^{:macro true
    :added "1.0"}
  함 (fn* 함 [&form &env & decl]
          (.withMeta ^clojure.lang.IObj (cons 'fn* decl)
                     (.meta ^clojure.lang.IMeta &form))))

(defmacro 매크로
  "defmacro를 그대로 사용"
  [& 선언부]
  (cons 'defmacro 선언부))

(매크로 대응
  "단순한 1:1 대응을 위한 매크로. 단순히 매크로로 치환된다."
  [한글명 심볼]
  (리스트 '매크로 한글명 '[& 선언부]
    (리스트 'cons (리스트 'quote 심볼) '선언부)))

(대응 매크로확장 macroexpand)
(대응 매크로확장-1 macroexpand-1)

(대응 정의 def)
(대응 함수 defn)
(대응 함수- defn-)
(대응 만약 if)

(정의 증가 inc)
(정의 감소 dec)
