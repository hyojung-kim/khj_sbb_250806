요구사항 - 어떤기능을 정의할 건지

1. 게시글 생성
//게시글 탭 선택 (자유,공지)
제목입력 (필수)
내용입력 (필수)
등록하기 (등록후에 리다이렉트)
돌아가기
//목록 탭이 필요할 것 같음. (자유, 공지)


2. 조회

제목 + 댓글수,  작성날짜, //글쓴이, 조회 수, 추천 수
//최신 인기글 10개 댓글 수
//페이징 10개


3.게시글 상세

제목 / 작성날짜
글쓴이 조회수 추천수 댓글
글 내용
이전글 / 목록으로 / 다음글
전체 댓글 수 표시
댓글작성
//댓글에 대댓달기 대댓에 대댓
//좋아요 달기


데이터베이스 구조 설계
Question >> id subject content createDate  //updated_at, view_cnt, like, user_id (FK →)
Answer >> id, content, createDate question //updated_at
//User >> ID, userName, PW, createDate

엔티티 Question
엔티티 Answer



com.mysite.sbb. <br>
  answer <br>
    Answer <br>
    AnswerController <br>
    AnswerService <br>
    AnswerRepository <br>
    
  question
    Question
    QuestionController
    QuestionService
    QuestionRepository
  
  main
    MainController   

DataNotFoundException
SbbApplication
SecurityConfig

resources
  static
    style.css
  templates
    -공통
    form_errors.html
    layout
    -구현페이지
    question_list.html
    question_detail.html
    question_form.html



    
  
