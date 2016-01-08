(ns ^{:doc "클로저 한국어 확장"
      :author "김대현"}
    klojure.core)

(defmacro 대응
  "단순한 1:1 대응을 위한 매크로. 단순히 매크로로 치환한다."
  [한글명 심볼]
  (list 'defmacro 한글명
        (select-keys (meta (var defmacro)) [:doc])
        '[& 선언부]
        (list 'cons (list 'quote 심볼) '선언부)))

(대응 매크로 defmacro)
(대응 매크로확장 macroexpand)
(대응 매크로확장-1 macroexpand-1)
(대응 인용 quote)
(대응 가정 let)
(대응 함 fn)
(대응 정의 def)
(대응 함수 defn)
(대응 함수- defn-)
(대응 만약 if)

(대응 루프 loop)
(대응 재귀 recur)

(정의 리스트 list)
(정의 증가 inc)
(정의 감소 dec)
(정의 맵 map)
