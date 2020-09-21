## 개발하면서 막힌 부분

<br/>

### 좀비 프로세스

* 서버를 올린 다음 종료하지 않고 IDE가 꺼지는 등의 상황을 이유로, "port 8080이 이미 사용중"이라는 내용의 오류를 맞딱드리게 되었다.
* 서버는 실행중이긴 하지만, 실행한 주체와 연결이 끊겨 종료할 수 없는 상황. 방법은 두 가지였다. 서버를 8080이 아닌 다른 포트로 바꿔서 실행하던가 (굳이?), 아니면 기존의 실행중인 서버를 종료하던가.
* 후자를 선택했다. 윈도우 cmd를 열어서 명령어를 입력한다.
  * netstat -ano : 현재 작동중인 전체 포트를 확인한다.
  * netstat -ano | findstr 8080 : 그 중에 8080을 포함하는 문자열을 검색한다.
  * ![image-20200920220854002](./images/issue1.png)
* 그럼 실행중인 전체 포트 중 8080을 포함한 포트만 출력한다. 다음 명령어를 입력한다.
  * tasklist /FI “PID eq 20056” : 해당 PID가 어떤 프로그램인지 확인한다.
  * ![image-20200920221650535](./images/image-20200920221650535.png)
  * taskkill /F /PID 20056 : PID를 이용해 특정 포트를 종료시킨다.

[참고](https://dullyshin.github.io/2019/08/30/window-checkport/)

<br/>

### 이미지 경로

* HTML 파일을 직접 열 때는 이미지가 출력이 되었는데, 스프링 서버를 올린 다음 localhost:8080으로 들어가면 이미지가 출력되지 않는 오류가 있었다.

* 스프링 부트를 쓰며 thymeleaf 를 사용한 후에는 src/main/resources 를 루트로하여 static 폴더에 넣으면 이미지 경로를 절대경로처럼 사용할 수 있었다.

* 예를 들어, static/images/boyeong.gif 파일을 사용하려 한다면 다음과 같은 경로로 사용하면 된다.

  * ```html
    background-image: url([/]images/boyeong.gif);
    background-image: url("[/]images/boyeong.gif");
    ```

[참고](http://mattdevils.blogspot.com/2016/08/20160821-spring-boot-thymeleaf-image.html)

<br/>

### Github 잔디 . . .

* 매우 속상한 일을 발견했다. 근 한달간 열심히 깃허브에 공부한 자료들을 올렸는데... new repository를 제외한 모든 commit에 대해 잔디가 하나도 심기지 않았다... 어째서 인지하지 못했을까.
* 물론 잔디가 심기는 것 자체는 자기 만족이지만... 너무 큰 의미의 자기 만족이라... 매우 속상했다.
* ![image-20200921131526021](./images/image-20200921131526021.png)
* 원인을 발견했다. 지금으로부터 약 한달 전, 8월 28일. github에 관한 내용을 후배들한테 알려주려고 실습을 하며 내 local 저장소와 매칭된 email을 수정하는 방법을 할 때, 잘못된 이메일을 입력했었다.
* git config user.email 명령어를 입력하면 뒤에 "내 이메일 주소"가 출력된다. 하지만... sanggoe0509@gmail 까지만 쓰여있더라. .com 어디갔어..ㅠ
* gic config --global user.email "내 이메일 주소" 형식으로 다시 수정하여 지정한 후 다시 테스트 겸 commit을 해보니 아주 잘 된다.
* 한달간의 기록... 아쉽다... 흰색보다 초록색이 더 무성한 잔디밭이 될 수 있었는데... 그치만 조금이라도 빨리 그보다 더 값진, 새로 알게된 사실이 있으니 다행이다.

<br/>

### HTTP

#### Get

* 

#### Post

* 

아아아아아ㅏ아아아아아아아ㅏ아아아아ㅏ아 나중에 할래.... 의욕상실

<br/>

### Client - Server 간 데이터 이동 - 단일 데이터 전달

<br/>

#### First issue

![image-20200921234001540](./images/image-20200921234001540.png)

* 사진과 같이, 버튼을 누르면 Sanggoe라는 input tag 안의 데이터를 전달하고, 해당 데이터를 반영한 다음 html 페이지를 보고싶은 것 이었다.
* 위 사항의 경우, name 이라는 데이터 ''하나'만 전달하여 다음 페이지를 요청하고 싶은 경우였지만... 이 마저도 spring boot 프로젝트는 처음이라... 어려움을 겪었다.
* 내가 적게나마 이해한 정도는, client에서 요청을 보내는 action을 html 태그 속성으로 넣어주면, 그에 해당하는 url과 @GetMapping 된 함수를 수행한다는 것. 그리고, 수행한 뒤 결과값을 반환하는 것. 그 정도였다.
* 매개변수로 [?key=value] 형태로 넘어가는데, 어떤 형식으로 주고, 전달 받은 값을 다시 어떻게 html 파일에 보내서 적용을 시켜야 할지.. 되게 막막했던 것 같다.

<br/>

#### 전체적인 그림

* 우선 클라이언트 측을 처음 View, html 페이지 라고 보자. 여기서 name을 입력한 다음, 버튼을 눌러 서버에 name을 파라미터로 주면서 Get 방식으로 다음 페이지에 대한 요청을 보낸다.
* 서버는 Controller가 있는지 먼저 살핀다. 존재한다면 Controller는 보내온 요청 url에 대해 @GetMapping 으로 매핑 되어있는 함수를 실행시켜준다.
* 이 매핑된 함수는 전달받은 데이터를 사용하여 html 문서에 반영한 후, 해당 html 문서를 return 한다.

<br/>

#### Solution

![image-20200921235723354](./images/image-20200921235723354.png)

![image-20200921235633840](./images/image-20200921235633840.png)

* 먼저 Javascript 함수의 도움을 받았다. inputText() 함수는 name이란 id를 가진 태그의 value를 가져와 data에 저장하고, 경로를 string으로 합쳐서 name이라는 매개변수 이름을 가진 'data' 즉, input tag에 입력한 value를 값으로 전할하는 url을 만든다.

<br/>

![image-20200922003032877](./images/image-20200922003032877.png)

![image-20200921235920282](./images/image-20200921235920282.png)

* Controller에서는, 상대 경로에 대한 url을 value로 받아 @GetMapping 시킨 함수를 실행한다. 이 때, 클라이언트가 요청한 것은 data가 적용된 survey1 이라는 html 파일이다.

##### @RequestParam

* 위를 예시로 들면, @RequestParam("name") String name 이다. get 방식에서 파라미터를 전달하는 방식은 [경로?key=vlaue] 이므로.. 여기서 "name"은 key를 말하고, name은 String 형식의 value를 말한다. 

##### Model

* Model 이라는 Class가 존재한다. MVC 패턴에서는 이 모델을 통해서 데이터 전달이 이루어진단다. 즉 내 경우, 전달 받은 데이터를 다음 페이지인 html에 적용시키기 위해서 전달에 필요한 1회용 임시 변수 Temp와 같은 역할이라고 한다. 
* model.addAtrribute() 함수를 이용해 (key, value) 매개 변수로 넘겨주면 return 하는 해당 html 파일에서 그 값을 적용한다.

##### UserInformation field

* 아직 스프링의 이해도가 낮다보니, 사실 방법을 잘 몰라서 무작정 해보고 선택한 방법이다. DB의 필요성 까지는 전혀 못느끼겠고, 해당 웹 페이지를 종료하기 전까지만 데이터가 유지되면 되므로 Controller에 데이터에 해당하는 클래스를 선언하여 field로 두었다.
* MVC 패턴이라는 개념을 적용한다고 하면, 솔직히 좋은 방법이 아니지 않을까.. 생각이 들지만 아직 잘 모르겠다. 우선은 구현 자체에 목적이 있으므로 좋은 습관이 아니더라도 일단 구현해보고, 추후에 코드 리뷰를 하면서 고치는 방법을 선택해야되겠다.

<br/>

##### HTML 파일에 데이터 적용

![image-20200922001718140](./images/image-20200922001718140.png)

![image-20200922001549458](./images/image-20200922001549458.png)

* thymeleaf 템플릿을 사용하였다. 위와 같이, ${name} 형식으로 model에 더해진 값에 대해서 순차적으로 적용이 된다. 이렇게 적용된 html 페이지는 return 되어 클라이언트에게 반환된다.

<br/>

### Client - Server 간 데이터 이동 - 여러 데이터 전달

#### second issue

![image-20200922002118028](./images/image-20200922002118028.png)

* 처음에는 데이터가 이름 하나였지만, 뒤쪽에서는 처리해야 할 데이터가 여러 가지였다. 이 데이터를 어떻게 넘기고, 어떻게 저장하지? 하는 고민에 또 다시 잠기게 되었다.

<br/>

#### Solution

![image-20200922002401412](./images/image-20200922002401412.png)

* 우선, 요번에는 input 태그에서 Javascript 함수를 이용하는 것이 아니라 form 태그의 action 속성 그리고 method 속성으로 post 방식을 선택하였다.

<br/>

![image-20200922002713007](./images/image-20200922002713007.png)

* input 태그를 이용하여 버튼 슬라이드의 값을 input 태그 text type에 실시간으로 출력하고, submit type을 통해서 제출(요청)하는 방식이다.
* 전달할 데이터가 많으므로 Get 방식이 아닌 Post 방식을 선택하였다.
* (처음 할 때는 복수개의 데이터 2개만 전달하는 것으로 테스트 하였다)

<br/>

![image-20200922002938207](./images/image-20200922002938207.png)

* controller에서 @PostMapping 된 함수를 실행한다.
* 추후 실제 코드에서는 각각 key의 이름과 변수 이름 등을 수정해야겠지만,  (key=value) 쌍을 두 개 받아 model에 넣어주는 테스트 예시 코드였다. 이렇게 하면 단일 값 전달과 마찬가지 방식으로 return 하는 html 파일에 model을 통해 데이터가 전달 되었다.

<br/>









<br/>

<br/>

### UI 적인 문제

#### 슬라이드 버튼

![image-20200922002439893](./images/image-20200922002439893.png)

![image-20200922002017436](./images/image-20200922002017436.png)

![image-20200922002118028](./images/image-20200922002118028.png)

*  Javascript 함수의 힘을 빌렸다. 해당 Id의 value를 실시간으로 반영할 수 있도록 작성하였다. 위와 같은 방법으로 잘 구현 되었다.

<br/>