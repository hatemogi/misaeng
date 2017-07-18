(ns ^{:doc "미생: 클로저 한국어 확장"
      :author "김대현"}
    미생.기본)

(defmacro 매크로대응
  "단순한 1:1 대응을 위한 매크로. 단순히 매크로로 치환한다."
  [한글명 심볼 & 설명]
  (list 'do
        (list 'defmacro 한글명
              '[& 선언부]
              (list 'cons (list 'quote 심볼) '선언부))
        (list 'alter-meta! (list 'var 한글명)
              'assoc :doc (list :doc (list 'meta (list 'var 심볼))))
        (list 'alter-meta! (list 'var 한글명)
              'assoc :arglists (list :arglists (list 'meta (list 'var 심볼))))))

(defmacro 특별대응
  "특별식(special-form) 한글 대응을 위한 매크로"
  ([한글명 특별식]
   `(특별대응 ~한글명 ~특별식 "매개변수 설명 없음" "설명이 아직 없습니다."))
  ([한글명 특별식 매개변수 설명]
   (list 'defmacro 한글명
         {:doc 설명 :arglists (list 'quote 매개변수)
          :대응 (list 'quote 특별식) :대상 '(quote 특별식)}
         '[& 선언부]
         (list 'cons (list 'quote 특별식) '선언부))))

(특별대응 만약 if ([조건식 참식 거짓식?])
  "'조건식'을 계산한 결과가 공(nil)이나 거짓(false)이 아니면
  '참식'를 계산하고 그 결과를 돌려준다. '조건식' 계산 결과가 공 또는 거짓이면,
  '거짓식?'를 계산하고 돌려준다. '거짓식?'를 생략했다면 공(nil)을 반환한다.

  참조: http://misaeng-lang.org/특별식#만약")

(특별대응 함 fn ([함 이름? [매개변수*] 표현*])
  "함수를 정의.

  참조: http://misaeng-lang.org/특별식#함")

(특별대응 가정 let ([가정 [바인딩*] 표현*])
  "바인딩 => 바인딩기호 대응값

  바인딩기호를 각 값에 대응한 문맥에서 여러 표현을 계산한다.

  참조: http://misaeng-lang.org/특별식#가정")

(특별대응 인용 quote ([표현])
  "표현을 계산하지 않고 그대로 반환.

  참조: http://misaeng-lang.org/특별식#인용")

(특별대응 정의 def ([기호 설명문자열? 초기값?])
  "현재 이름공간 (*ns*)에 이름이 '기호'인 전역 변수를 새로 만들거나
  그 이름으로 이미 있는 변수를 찾는다. '초기값?'를 지정한 경우,
  그것을 계산해서 최상위 바인딩에 지정한다. 지정하지 않은 경우...

  참조: http://misaeng-lang.org/특별식#정의")

(특별대응 작용 do ([표현*]) "부수효과를 포함하는 표현식 묶음")
(특별대응 루프 loop)
(특별대응 재귀 recur ([표현*]) "재귀호출.")
(특별대응 예외발생 throw)

(매크로대응 매크로 defmacro)
(매크로대응 매크로확장 macroexpand)
(매크로대응 매크로확장-1 macroexpand-1)
(매크로대응 주석 comment)
(매크로대응 만약-가정 if-let)
(매크로대응 가정함 letfn)

(매크로대응 함수 defn)
(매크로대응 함수- defn-)
(매크로대응 한번정의 defonce)
(매크로대응 프로토콜 defprotocol)
(매크로대응 프로토콜-확장 extend-protocol)
(매크로대응 레코드 defrecord)
(매크로대응 선언 declare)

(매크로대응 만약-거짓 if-not)
(매크로대응 참이면 when)
(매크로대응 거짓이면 when-not)
(매크로대응 조건 cond)
(매크로대응 조건p condp)
(매크로대응 조건-> cond->)

(매크로대응 필요 require)
(매크로대응 참조 refer)
(매크로대응 사용 use)
(매크로대응 논리곱 and)
(매크로대응 논리합 or)

(매크로대응 미래 future)
(매크로대응 지연 delay)
(매크로대응 시간 time)
(매크로대응 바인딩 binding)
(매크로대응 누차 dotimes)  ; 여러번
(매크로대응 순차 doseq)  ; 차례로
(매크로대응 다중메소드 defmulti)  ; 멀티메소드
(매크로대응 메소드정의 defmethod)
(매크로대응 지연-열 lazy-seq)

(정의 홀? odd?)
(정의 분할 partition)
(정의 리스트 list)

(매크로 정의* [& 정의들]
  (만약 (홀? (count 정의들))
    (예외발생 (java.lang.IllegalArgumentException.))
    (cons 'do (for [[이름 대상] (분할 2 정의들)]
                (리스트 '정의 이름 대상)))))

(정의*
 부정 not
 부정= not=
 리스트* list*
 리스트? list?
 적용 apply  ; 대입
 증가 inc
 감소 dec
 증가' inc'
 감소' dec'
 사상 map
 리듀스 reduce
 참 true
 거짓 false
 공 nil
 참? true?
 거짓? false?
 공? nil?
 기호 symbol
 기호? symbol?
 키워드 keyword
 키워드? keyword?
 인스턴스? instance?
 맵? map?
 벡터 vector
 벡터? vector?
 집합 set
 집합? set?
 해시-집합 hash-set
 최대 max
 최소 min
 정수? integer?
 유리수? rational?
 분수? ratio?
 양? pos?
 음? neg?
 영? zero?
 짝? even?
 부분 partial
 합성 comp
 필터 filter  ; 여과
 가짐 take
 버림 drop
 반복 repeat
 반복해서 repeatedly
 중첩 iterate
 범위 range
 개수 count
 첫째 first
 둘째 second
 n째 nth
 잔여 rest
 다음 next
 마지막 last
 큰수 bigint
 함? fn?  ; ㅎㅅ
 몫 quot
 나머지값 rem
 병합 merge
 빈? empty?
 빈 empty
 약속 promise
 메모하기 memoize
 결합 conj
 결합! conj!
 분리 disj
 분리! disj!
 순방 doall
 순행 dorun
 열 seq
 열? seq?
 순열 sequence
 서식 format
 문 str
 문자열? string?
 실행! run!
 섞기 shuffle
 항등함수 identity  ; https://ko.wikipedia.org/wiki/항등_함수
 상수함수 constantly  ; https://ko.wikipedia.org/wiki/상수_함수
 모두분할 partition-all
 정렬 sort
 비교 compare
 양분 split-at
 정규식-맞춤 re-matches
 정규식-찾기 re-find
 정규식-열 re-seq
 모두? every?
 모두거짓? not-any?
 출력 println)
