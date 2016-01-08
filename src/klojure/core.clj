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
  함 (fn* fn [&form &env & decl]
          (.withMeta ^clojure.lang.IObj (cons 'fn* decl)
                     (.meta ^clojure.lang.IMeta &form))))

(defmacro 매크로 [매크로명 인자 & 본문]
  `(defmacro ~매크로명 ~인자 ~@본문))

(매크로 매크로확장-1 [본문]
  `(macroexpand-1 ~본문))

(매크로 정의 [심볼 값]
  `(def ~심볼 ~값))

(매크로 함수 [함수명 인자 & 본문]
  `(defn ~함수명 ~인자 ~@본문))

(매크로 만약
  ([조건 참일때]
    `(if ~조건 ~참일때))
  ([조건 참일때 거짓일때]
    `(if ~조건 ~참일때 ~거짓일때)))

(정의 증가 inc)
(정의 감소 dec)
