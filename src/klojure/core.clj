(ns ^{:doc "클로저 한국어 확장"
      :author "김대현"}
    klojure.core)

(defmacro 대응
  "단순한 1:1 대응을 위한 매크로. 단순히 매크로로 치환한다."
  [한글명 심볼 & 설명]
  (list 'defmacro 한글명
        '[& 선언부]
        (list 'cons 심볼 '선언부)))

(대응 매크로 `defmacro)
(대응 매크로확장 `macroexpand)
(대응 매크로확장-1 `macroexpand-1)
(대응 인용 `quote)
(대응 가정 `let)
(대응 함 `fn)
(대응 정의 `def)
(대응 함수 `defn)
(대응 함수- `defn-)
(대응 만약 `if)
(대응 참이면 `when)
(대응 거짓이면 `when-not)
(대응 조건 `cond)
(대응 묶음 `do)
(대응 루프 `loop)
(대응 재귀 `recur)
(대응 예외발생 `throw)
(대응 필요 `require)
(대응 참조 `refer)
(대응 사용 `use)
(정의 리스트 list)
(정의 리스트* list*)
(정의 적용 apply)
(정의 증가 inc)
(정의 감소 dec)
(정의 맵 map)
(정의 참? true?)
(정의 거짓? false?)
(정의 심볼? symbol?)
(정의 키워드? keyword?)
(정의 맵? map?)
(정의 벡터? vector?)
(정의 최대 max)
(정의 최소 min)
(정의 양수? pos?)
(정의 음수? neg?)
(정의 영? zero?)
(정의 짝수? even?)
(정의 홀수? odd?)
