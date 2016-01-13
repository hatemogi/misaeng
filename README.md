# 미생 (misaeng)


    클로저(Clojure) 프로그래밍 언어의 핵심 매크로와 함수를 한글로 번역한 라이브러리

미생은 클로저 매크로 시스템을 써서 만든 간단한 라이브러리에 불과하다. 그러나 겉보기에는 미생의 실체가 마치 **한글 프로그래밍 언어**인 것처럼 보인다. 정확한 표현을 뒤로하고 과장해서 홍보하자면, 지금 당장 쓸 수 있는 한글 프로그래밍 언어라고 말할 수 있다. 거짓에 가까운 지나친 표현이지만, 이하 미생이 한글 프로그래밍 언어라고 가정하고 얘기한다. 한번 5분만 속아보고 읽어보자.

> 미생, 아직 살아있지 못한, 한글 프로그래밍 언어

## 한글 프로그래밍 언어가 없는 이유

세상에 한글 프로그래밍 언어가 없었던 것은 아니다. 작자가 알고 있는 것만 꼽아도, 오래전 C 언어의 문법과 유사한 **씨앗**이라는 언어가 있었고, 한글 베이직이 있었고, 최근에도 몇몇 한글 프로그래밍 언어가 공개된 것으로 알고 있다. 그러나, 결국은 널리 퍼지기 전에 사라지곤 한다. 왜 그럴까? 첫째, 새로운 프로그래밍 언어를 쓸모있게 만들기까지의 시간과 노력이 대단히 필요하다는 문제가 가장 크겠다. 둘째, 굳이 왜 프로그래밍을 한글로 해야하는가에 대한 회의가 문제도 크다.

## 코딩할 때 한글을 안 쓰는 문화

사실 새로운 한글 프로그래밍 언어는 커녕, 이미 잘 쓰이고 있는 영문 프로그래밍 언어에서 한글을 쓰는 경우도 보기 어렵다. 대부분의 프로그래밍 언어는 소스코드를 작성하는데 유니코드를 쓰고, 프로그래밍 문법의 요소들도 한글을 포함한 유니코드 문자를 허용하는 경우가 많다. 그럼에도 불구하고, 주석(comment)외에는 거의 한글을 사용하지 않는 것으로 보인다. 어떤 이유인지는 모르겠으나, 어쨌건 실상 한글로 코딩을 하는 행위는 환영받지 못하는 것 같다.

그러나, 작자는 코딩에 한글을 더 많이 사용해야 한다고 믿는다. 특히, 프로그래밍 언어로 표현해야할 대상이 한글 표기가 당연한 경우라면, 코딩할 때에도 한글로 표기하는 것이 낫지 않은가? 업무 도메인은 명백한 한국어이고 한글로 표기하는데, 그걸 개발자들이 따로 모여서 로마자 표기를 하거나, 아니면 어색한 번역으로 영문 표기를 하는 것이 반드시 옳은 방법이라고 할 수는 없다.

미생은 이 문제에서 한걸음 더 나가서, 각종 상수/변수/함수 이름은 물론이고, 언어의 기본 구문까지도 한글로 표기하자고 제안한다.

## 미생은 무엇이 다른가?

미생은 한글 프로그래밍 언어가 없는 첫번째 이유를 간단하게 해결했다. 쓸모있는 고품격 언어인 클로저(Clojure)의 어깨에 사뿐히 올라탔기에, 클로저의 모든 강력한 기능과 기본 라이브러리는 기본이고, 숱하게 많은 커뮤니티 라이브러리들을 그대로 쓸 수 있다. 즉, 지금 당장 실용적으로 쓰는데 문제가 없다. 게다가 클로저(Clojure)의 특성상 자바(Java) 라이브러리를 그대로 가져다 쓸 수 있으므로, 심지어 자바로 작성된 레거시(legacy) 코드도 그대로 쓸 수 있다는 장점도 덤이다.

이로써, 두번째이자 본질적인 문제인 "굳이 왜 한글로 프로그래밍을 해야하는가?"에 집중할 수 있다. 이는 앞으로, 혹시나 미생이 널리 알려진다면, 여러 개발자들 사이의 열린 토론이 작자 대신 결론을 내주리라 믿는다.

## 미생은 널리 쓰일 것인가?

글쎄, 어떻게 될지 알 수 없지만 아마도 미생 또한 이내 사라질 것이다.

새로운 프로그래밍 언어를 만드는 일은, 언어 문법과 컴파일러/인터프리터 시스템을 만드는 일 말고도, 다양하게 활용할 수 있는 라이브러리와 문서, 그리고 무엇보다 사람들의 힘이 필요한데, 이 모든 여건을 만들기도 전에 숱한 반대 의견에 부딪혀서 좌초한 프로젝트가 많았으리라 추측한다.

솔직히 말해서, 미생 자체가 널리 쓰이라는 기대는 하지 않는다. 미약하나마 긍정적 여파를 불러올 수 있다면 그것으로 의미있다고 생각하고, 단지 기존 영문 프로그래밍 언어를 쓰는 한국 개발자들이, 한글 표기를 조금 더 사용하는 수준이 되는 것도 나름의 의미가 있지 않겠는가?

앞서 언급했듯이 미생은 바닥부터 새로 만든 언어 시스템이 아니다. 이미 잘 만들어진 클로저 시스템에 올라타 있기 때문에 지금도 당장 쓸 수 있다는 강점이 있다. 그렇게 미생은 그 쓸모있는 단계까지 가기 위한 힘들고 지치는 과정을 건너 뛰고 시작한다는 점에서, 어쩌면 '한글 프로그래밍 언어가 없는 문제'의 본질에 다가설 수 있을 것이다. 만일 그 호응이 좋다면, 누군가 또 다른 한글 프로그래밍 언어를 만들 수 있는 탄탄한 토양이 되어줄 것이라 기대해 본다.

## 어떻게 생겼는가?

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


## 사용법

FIXME

## 라이선스

Copyright © 2016 Daehyun Kim

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
