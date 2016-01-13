# 미생

미생은 클로저 언어를 위한 한글 확장 라이브러리이다. 겉보기에는 마치 한글 프로그래밍 언어인 것처럼 보이지만, 실상은 그저 클로저 언어의 라이브러리에 불과하다. 정확한 표현을 뒤로하고 과장하자면, 지금 당장 쓸모 있게 바로 쓸 수 있는 한글 프로그래밍 언어라고 말할 수 있다.

## 한글 프로그래밍 언어가 없는 이유

한글 프로그래밍 언어가 없었던 것은 아니다. 필자가 알고 있는 것만 꼽아도, 오래전 C 언어의 문법과 유사한 **씨앗**이라는 언어가 있었고, 한글 베이직이 있었고, 최근에도 몇몇 한글 프로그래밍 언어가 공개된 것으로 알고 있다. 그러나, 결국은 널리 퍼지기 전에 사라지곤 한다. 왜 그럴까? 첫째, 프로그래밍 언어를 쓸모있게 만들기까지의 자발적이고 별다른 보상이 없는 시간과 노력이 많이 필요하다는 문제가 가장 크다. 둘째, 굳이 왜 프로그래밍을 한글로 해야하는가에 대한 회의가 문제인 것 같다.

## 미생은 무엇이 다른가?

미생은 한글 프로그래밍 언어가 없는 첫번째 이유를 간단하게 해결했다. 이미 쓸모있는 고품격 언어인 클로저(Clojure)의 어깨에 사뿐히 올라탔기에, 클로저의 모든 강력한 기능과 기본 라이브러리는 물론 커뮤니티 라이브러리들을 그대로 쓸 수 있기 때문에, 당장 실제 개발에 사용할 수 있다. 게다가 클로저(Clojure)의 특성상 자바(Java) 라이브러리를 그대로 가져다 쓸 수도 있기에, 심지어 자바로 작성된 레거시 코드도 불러다 쓸 수 있다는 장점까지 공짜로 얻고 시작한다.

그러나, 두번째 문제인 "굳이 왜 한글로 프로그래밍을 해야하는가?"라는 문제에서는 자유롭지 못한데, 이는 앞으로의 열린 토론이 필자 대신 결론을 내주리라 믿는다. 적어도 작성자 본인은 "한글로 프로그래밍을 하는 행위"에 대해 긍정적이다.

## 코딩시 한글을 안 쓰는 문화

한글 프로그래밍 언어는 고사하고, 이미 주류의 프로그래밍 언어에서 한글을 쓰는 경우도 보기 어렵다. 요새 대부분의 프로그래밍 언어는 소스코드를 작성하는데 유니코드를 쓰고, 프로그래밍 문법의 요소들도 한글을 포함한 유니코드 문자를 사용해도되는 경우가 대부분이다. 그럼에도 불구하고, 우리는 이상하게도 주석(comment) 외에는 거의 한글을 사용하지 않는 것으로 보인다. 그 이유는 아마도, 영문으로 작성해야한다는 고정 관념이 있거나, 아니면 혹시 한글 심볼을 사용하면 문제가 알 수 없는 문제가 발생할지 모른다는 두려움이 있거나, 아니면 그저 언어 기본 이 점은 쉽게 답하기 힘든 문제이다. 마지막 문제는, 우리 개발자들의 문화가, 소위 가장 많이 쓰이는 언어나 툴에 극단적으로 수렴한다는 점과 관련있겠다. 세상에 주류 프로그래밍 언어는 꽤 많지만, 우리는 가장 널리 쓰이는 몇 개의 프로그래밍 언어에 집중적으로 몰려서 사용하는 것으로 보이고, 한글 프로그래밍 언어가 그런 주류 언어의 일부로 들어가지 않는 한 별다른 우대를 받기는 어려울 것이다.문법이 영문인 상황에서, 한영 혼용에 대한 거부감이 있는 것일지도 모르겠다. 어떤 이유가 그 바닥에 있는지 모르겠으나, 한글로 코딩을 하는 행위는 환영받지 못하는 것 같다.

## 미생은 널리 쓰일 것인가?

글쎄, 어떻게 될지는 알 수 없지만, 미생 역시 그 여러번의 시도중 하나로 묻힐 가능성이 크다. 그러나, 앞서 강조했듯이, 미생은 바닥부터 새로 만든 언어 시스템이 아니라 이미 잘 만들어진 클로저에 올라타 있기 때문에, 지금도 당장 쓸모있게 사용할 수 있다는 강점이 있다. 새로운 프로그래밍 언어를 만드는 일은, 언어 문법과 컴파일러/인터프리터 시스템 말고도, 다양하게 활용할 수 있는 라이브러리와 문서, 그리고 무엇보다 사람들의 힘이 필요한데, 이 모든 여건을 만들기 전에 다양한 반대의견에 부딪혀, 좌초하는 프로젝트가 많았으리라 추측한다.

미생도, 과연 한글 프로그래밍 언어가 필요한가라는 문제 앞에서 자유로울 수 없지만, 적어도, 쓸모 있는 단계까지 가기위한 힘들고 지치는 과정을 건너뛰고 시작한다는 점에서, 어쩌면 본질의 문제에 가까이 다가설 수 있다고 생각한다.

즉, 미생에 대한 호응이 좋다면, 제2의, 제3의 한글 프로그래밍언어가 나올 명분을 만들 수 있으리라 기대한다. 이런 큰 목표가 뒤에 있기는 하지만, 그래도 미생자체가 널리 쓰이라는 기대는 하지 않는다. 그것은 국내에서 클로저(Clojure)가 널리 쓰이지 않는 이유와도 통할 것이다.

## 사용법

FIXME

## 라이선스

Copyright © 2016 Daehyun Kim

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
