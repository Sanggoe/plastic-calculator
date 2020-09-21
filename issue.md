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

