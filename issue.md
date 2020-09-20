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

