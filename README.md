요구사항 - 어떤기능을 정의할 건지 <br>

1. 게시글 생성 <br>

[O] 제목입력 (필수)<br>
[O] 내용입력 (필수)<br>
[O] 등록하기 (등록후에 리다이렉트) <br>

// [X]돌아가기 <br>
// [X] 게시글 탭 선택 (자유,공지) <br>


2. 조회 <br>

[O] 제목,  작성날짜<br>
[X] 조회 기준을 작성날짜기준으로 내림차순이 좋을 것 같음<br>
//[X] 글쓴이, 조회 수, 추천 수 <br>
//[X] 최신 인기글 10개 댓글 수  <br>
//[X] 페이징 10개  <br>


3.게시글 상세 <br>

[O] 제목 / 내용 / 작성날짜  <br>
[O] 전체 댓글 수 표시  <br>
[O] 댓글작성 <br>

[X] 이전글 / 목록으로 / 다음글 버튼생성 <br>
[X] 글쓴이 조회수 추천수 댓글   <br>

//[X] 댓글에 대댓달기 대댓에 대댓   <br>
// 좋아요 달기   <br>


데이터베이스 구조 설계 <br>
Question >> id subject content createDate  //updated_at, view_cnt, like, user_id (FK →) <br>
Answer >> id, content, createDate question //updated_at <br>
//[X] User >> ID, userName, PW, createDate <br>

엔티티 Question <br>
엔티티 Answer <br>



com.mysite.sbb. <br>
----answer <br>
--------Answer <br>
--------AnswerController <br>
--------AnswerService <br>
--------AnswerRepository <br>
    
----question <br>
--------Question  <br>
--------QuestionController <br>
--------QuestionService <br>
--------QuestionRepository <br>
  
----main <br>
--------MainController    <br>

DataNotFoundException <br>
SbbApplication <br>
SecurityConfig <br>

----resources<br>
----static<br>
--------style.css <br>
----templates <br>
--------공통 <br>
--------form_errors.html <br>
--------layout <br>
--------구현페이지 <br>
--------question_list.html <br>
--------question_detail.html <br>
--------question_form.html <br>

## UI/UX (화면 캡처본을 복사 붙여 넣기, url 주소 나오도록)
- 루트/                /question/list   
- 게시글 리스트 페이지  /question/list    | get요청
- 게시글 등록 폼 페이지 /question/create/{id}?subject=''&content=''  | post요청
- 게시글 상세 페이지    /question/detail/{id} | get요청 
- 답글 등록 페이지      /answer/create/{id}?content='' | post요청

## 미비사항 or 막힌 부분
- AnswerForm, QuestionForm 객체, @Valid 태그 사용에서 html form화면에서 조회하는 화면, 생성하는 화면을 @GetMapping,    @PostMapping 구현하는 구조가 꽤 복잡함
- 모델방식 이랑 @Valid를 사용하는 방식을 구분할 것. html에서 데이터 연결하는 방법도 조금 다름 ex) th:object="${answerForm}"
- @ResponseStatus를 그냥 가져다 쓰고 있는데 응용이 불가함
- html을 작성할 수 있는 능력이 부족함, 손이 잘 안따라옴

## HTTP GET 요청과 POST 요청의 차이
- 서버에 정보를 요청 ---- 클라이언트>>서버
- 전송할 데이터를 서버에 보냄 ----서버>>클라이언트

## JPA의 장점과 단점
- 장점 : 객체 지향적인 개발가능, 개발 생산성 향상, 유지 보수성
- 단점 : 복잡한 쿼리 작성의 어려움, 초기 설정 및 학습이 필요, 성능 최적화에 대한 필요성

## 스프링에서 의존성 주입(DI) 방법 3가지 방법
- 클래스의 생성자를 이용 : 객체 생성 시점에 반드시 필요한 의존성을 주입됨 >> 코드가 복잡해질 우려가 있음
- 수정자 주입 : 필요에 따라 Setter 메소드를 통해 동적으로 의존성을 변경 >> 객체의 불변성을 보장 X
- 필드 주입 : @Autowired 또는 @RequiredArgsConstructor >> 편리한 방법


## MVC 패턴
- M 모델 :  데이터의 비즈니스 로직을 담당, 데이터를 담는 틀
- V 뷰 : 사용자에게 보여지는 화면 
- C 컨트롤러 : 사용자의 요청을 받아서 잔달함 //서비스에서 데이터가공을하고 가공된 데이터를 모델로 담아서 뷰에게 전달함
