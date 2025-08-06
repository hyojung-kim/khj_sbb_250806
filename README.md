요구사항 - 어떤기능을 정의할 건지 <br>

1. 게시글 생성 <br>
//게시글 탭 선택 (자유,공지) <br>
제목입력 (필수) <br>
내용입력 (필수) <br>
등록하기 (등록후에 리다이렉트) <br>
돌아가기 <br>
//목록 탭이 필요할 것 같음. (자유, 공지) <br>


2. 조회 <br>

제목 + 댓글수,  작성날짜, //글쓴이, 조회 수, 추천 수 <br>
//최신 인기글 10개 댓글 수 <br>
//페이징 10개 <br>


3.게시글 상세 <br>

제목 / 작성날짜 <br>
글쓴이 조회수 추천수 댓글 <br>
글 내용 <br>
이전글 / 목록으로 / 다음글 <br>
전체 댓글 수 표시 <br>
댓글작성 <br>
//댓글에 대댓달기 대댓에 대댓 <br>
//좋아요 달기 <br>


데이터베이스 구조 설계 <br>
Question >> id subject content createDate  //updated_at, view_cnt, like, user_id (FK →) <br>
Answer >> id, content, createDate question //updated_at <br>
//User >> ID, userName, PW, createDate <br>

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



    
  
