# 미생 (misaeng)

    클로저(Clojure) 프로그래밍 언어의 핵심 매크로와 함수를 한국어로 번역한 라이브러리

미생은 클로저 매크로 시스템을 써서 만든 간단한 라이브러리에 불과하다. 그러나 겉보기에는 미생의 실체가 마치 **한글 프로그래밍 언어**인 것처럼 보인다. 정확한 표현을 뒤로하고 과장해서 홍보하자면, 지금 당장 쓸 수 있는 한글 프로그래밍 언어라고 말할 수 있다. 거짓에 가까운 지나친 표현이지만, 이하 미생이 한글 프로그래밍 언어라고 가정하고 얘기한다. 한번 5분만 속아보고 읽어보자.

> 미생, 아직 살아있지 못한, 한글 프로그래밍 언어

[![Clojars Project](https://img.shields.io/clojars/v/misaeng.svg)](https://clojars.org/misaeng)

## 경고: 알파 버전

* 아직 테스트 및 평가를 위한 알파 버전이다.
* 번역 용어나 API가 수시로 바뀔 수 있다.

## 한글 프로그래밍 언어가 없는 이유

세상에 한글 프로그래밍 언어가 없었던 것은 아니다. 작자가 알고 있는 것만 꼽아도, 오래전 C 언어의 문법과 유사한 "씨앗"이라는 언어가 있었고, ["한글 베이직"](https://ko.wikipedia.org/wiki/한글_베이직)이 있었고, 최근에도 [몇몇 한글 프로그래밍 언어](http://www.bloter.net/archives/240918)가 공개된 것으로 알고 있다. 그러나, 결국은 널리 퍼지기 전에 사라지곤 한다. 왜 그럴까? 첫째, 새로운 프로그래밍 언어를 쓸모 있게 만들기까지의 시간과 노력이 대단히 필요하다는 문제가 가장 크겠다. 둘째, [굳이 왜 프로그래밍을 한글로 해야 하는가에 대한 회의적 의견이 지배적](https://kldp.org/node/22517)이라는 이유도 크다.

## 코딩할 때 한글을 안 쓰는 문화

사실 새로운 한글 프로그래밍 언어는커녕, 이미 잘 쓰이고 있는 영문 프로그래밍 언어에서 한글을 쓰는 경우도 드물다. 대부분의 프로그래밍 언어는 소스코드를 작성하는 데 유니코드를 쓰고, 프로그래밍 문법의 요소들도 한글을 포함한 유니코드 문자를 허용한다. 그럼에도 불구하고, 대부분의 한국 프로그래머가 주석(comment)외에는 거의 한글을 사용하지 않는 것으로 보인다. 어떤 이유인지는 모르겠으나, 실상 한글로 코딩하는 행위는 환영 받지 못하는 것 같다.

그러나, 꼭 그래야만 할까? 아니다, 작자는 코딩에 한글을 더 많이 사용해야 한다고 믿는다. 특히, 프로그래밍 언어로 표현해야 할 대상이 한글 표기가 당연한 경우라면, 코딩할 때에도 한글로 표기하는 것이 낫지 않은가? 업무 도메인은 명백한 한국어이고 한글로 표기하는데, 그걸 개발자들이 따로 모여서 로마자 표기를 하거나, 아니면 어색한 번역으로 영문 표기를 하는 것이 반드시 옳은 방법이라고 할 수는 없다.

* [참고할 사이트]: <http://한글코딩.org>

미생은 이 문제에서 한 걸음 더 나가서, 각종 상수/변수/함수 이름은 물론이고, 언어의 기본 구문까지도 한글로 표기하자고 제안한다. 언어 기본 구문이 한국어로 되어 있다면, 프로그램 기호(심볼)를 한글로 작성하는 것이 더욱 자연스러울 것이다.

그리고, 작자를 포함한 대부분 개발자는 처음 프로그래밍을 배울 때, 프로그래밍과 함께 영어라는 장벽을 함께 넘어야 하는 이중의 어려움이 있는데, 새싹 개발자들이 영어는 잠시 뒤로 미루고, 단지 프로그래밍에 집중할 수 있다면 좋지 않을까?

## 미생은 무엇이 다른가?

미생은 한글 프로그래밍 언어가 없는 첫 번째 이유를 간단하게 해결했다. 쓸모 있는 고품격 언어인 클로저(Clojure)의 어깨에 사뿐히 올라탔기에(leveraging!), 클로저의 모든 강력한 기능과 기본 라이브러리는 기본이고, 숱하게 많은 커뮤니티 라이브러리들을 그대로 쓸 수 있다. 즉, 지금 당장 실용적으로 쓰는 데 문제가 없다. 게다가 클로저(Clojure)의 특성상 자바(Java) 라이브러리를 그대로 가져다 쓸 수 있으므로, 심지어 자바로 작성된 레거시(legacy) 코드도 그대로 쓸 수 있다는 장점도 덤이다. 자바뿐인가? 클로저가 그러하듯, 자바스크립트 환경이나 CLR환경에 쓰이는 것도 문제없다.

이로써, 두 번째자 (작자가 접근해보고 싶은) 본질적인 문제인 "굳이 왜 한글로 프로그래밍을 해야 하는가?"에 집중할 수 있다. 이는 앞으로, 혹시나 미생이 널리 알려진다면, 여러 개발자 사이의 열린 토론이 작자 대신 결론을 내주리라 믿는다.

## 미생은 널리 쓰일 것인가?

글쎄, 어떻게 될지 알 수 없지만 아마도 미생 또한 이내 사라질 것이다.

새로운 프로그래밍 언어를 만드는 일은, 언어 문법과 컴파일러/인터프리터 시스템을 만드는 일 말고도, 다양하게 활용할 수 있는 라이브러리와 문서, 그리고 무엇보다 많은 사람의 힘이 필요한데, 이 모든 여건을 만들기도 전에 숱한 반대 의견에 부딪혀서 좌초한 프로젝트가 많았으리라 추측한다.

솔직히 말해서, 미생 자체가 널리 쓰이리라는 기대는 하지 않는다. 미약하나마 긍정적 여파를 불러올 수 있다면 그것으로 의미있다고 생각하고, 단지 기존 영문 프로그래밍 언어를 쓰는 한국 개발자들이, 한글 표기를 조금 더 사용하는 수준이 되는 것도 나름의 의미가 있지 않겠는가?

앞서 언급했듯이 미생은 바닥부터 새로 만든 언어 시스템이 아니다. 이미 잘 만들어진 클로저 시스템에 올라타 있으므로 지금도 당장 쓸 수 있다는 강점이 있다. 이미 클로저를 쓰던 개발자라면, 프로젝트 의존성 한 줄을 추가하면 그 자리에서 바로 쓸 수 있다. 이렇듯 미생은 그 쓸모 있는 단계까지 가기 위한 힘들고 지치는 과정을 건너뛰고 시작한다는 점에서, 어쩌면 '한글 프로그래밍 언어가 없는 문제'의 본질에 다가설 수 있을 것이다. 만일 그 호응이 좋다면, 누군가 또 다른 한글 프로그래밍 언어를 만들 수 있는 탄탄한 토양이 되어줄 것이라 기대해 본다.

## 어떻게 생겼는가?

### 계승(factorial) 값을 구하는 함수, 두가지 버전

``` clojure
(함수 계승 [n]
  (만약 (<= n 1)
        1
        (* n (계승 (감소 n)))))

(함수 계승' [n]
  (적용 * (범위 2 (증가 n))))
```

## 누구를 위한 언어인가?

* 한글 프로그래밍 언어에 관심이 있는 개발자
* 클로저를 비롯한 LISP 계열 언어를 아직 써보지는 않았지만, 관심이 있는 한국 개발자
* 한국어를 쓰는 클로저 개발자

## 미생의 한계

명백한 한계는 아래와 같다. 그리고 작자는 이 한계에 만족한다.

* 한국어 어순에 맞추지 않았다.
* 새로운 언어나 시스템이 아니다.
* 한글로 표기했지만, 한자어가 많다.
* 한글 전용은 고집하지 않는다. 영문 한글 병용을 지향한다.

## 미생의 가능성

* 미생은 클로저의 훌륭함에 올라타 있기에, 자바스크립트 환경이나, CLR 환경에서도 쉽게 쓸 수 있다.
* 미생의 기본은, 리스프(LISP)의 매크로기능 덕분에 라이브러리 코드만으로도 언어 기능을 만든 것처럼 쓸 수 있다. 따라서, 클로저뿐아니라 다른 리스프계열 언어에서도 문제없이 한글 언어를 구현해 쓸 수 있다.

## 사용법

라이닝언에 아래 의존성을 추가한다.

``` clojure
[misaeng "0.1.0"]
```

그러면, 이제 보통의 클로저 프로젝트처럼 쓸 수 있다. 자세한 내용은 예제를 참고하자.

* <https://github.com/hatemogi/misaeng/tree/master/src/미생/예제>

## 배포 방법

> 이 항목은 배포하는 개발자만을 위한 내용이다. 이용자에게는 필요 없다.

라이닝언 태스크를 이용한다. gpg 서명을 이용하는데, keybase.io에 등록한 키를 그대로 쓰도록 하자.

### 최초 1회 pgp 키 준비


    keybase pgp export -s | gpg --import


### 배포시 마다

* project.clj의 버전을 적절히 올리자.

``` shell
lein deploy clojars
```

## 라이선스

Copyright © 2016 Daehyun Kim

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
