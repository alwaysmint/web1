<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="qna.QnaDBBean"%>
<%@page import="qna.QnaBean"%>
<%@page import="comment.CommentBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String u_id = "";
	if (request.getParameter("u_id") != null) {
		u_id = request.getParameter("u_id");
	}
	
	String pageNum = "";
	
	if(request.getParameter("pageNum") != null) {
		pageNum = request.getParameter("pageNum");
	} else {
		pageNum = "1";
	}
	
	int q_num = 0;
	
	if (request.getParameter("q_num") != null) {
		q_num = Integer.parseInt(request.getParameter("q_num"));
	}
	
	/*--해당 글 작성자 받기--*/
	String con_id = "";
	if(request.getParameter("q_id") != null) {
		con_id = request.getParameter("q_id");
	}
	System.out.println(u_id);
	System.out.println(con_id);
	
	QnaDBBean db = QnaDBBean.getInstance();
	QnaBean rb = null;
	
	if(u_id.equals(con_id)) {
		rb = db.getBoard(q_num);
	} else {
		rb = db.getBoard(q_num);
	}
	
	/*--관리자와 사용자 구분--*/
	int re = db.confirmManager(u_id);
	
	String q_title = "", q_content = "", q_id = "";
	int q_hit = 0;
	Timestamp q_date = null;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
	
	if (rb != null) {
		q_title = rb.getQ_title();
		q_content = rb.getQ_content();
		q_id = rb.getU_id();
		q_hit = rb.getQ_hit();
		q_date = rb.getQ_date();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<script src="https://kit.fontawesome.com/60f6a26247.js" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="board.css" type="text/css">
</head>
<body>
<div id="wrap">
	<header>
	  <div class="top">
        <div class="top__search">
          <li><input type="text"></li>
          <li><a href=""><i class="fas fa-search"></i></a></li>
        </div>
        <ul class="top__list">
      <!--   로그인 상태는 > HOME 
       		 비로그인 상태는 > LOGIN 보이게  -->
        <% 
        if(u_id==null){
        	%>
          <li><a href="Login.jsp">LOGIN</a></li>
         <%  
        }else{
        	%> 
        	 <li><a href="Main.jsp">HOME</a></li>
        	<% 
        }
        %>
          <li><a href="#">JOIN</a></li>
          <li><a href="mypage.jsp">MY PAGE</a></li>
          <li><a href="cart.html">CART</a></li>
        </ul>
      </div>
            
      <div class="logo">
        <img src="images/pinterest_profile_image.jpg" alt="">
      </div>
      
         </div>
			<div id="nav">
				<div class="menu">
					<ul class="myMenu">
						<li class="menu1"><p><a href="notice.jsp">공지사항</a></p></li>
						<li class="menu2"><p><a href="faq.jsp">F A Q</a></p></li>
						<li class="menu3"><p><a href="qna.jsp">Q & A</a></p></li>
						<li class="menu4"><p><a href="review.jsp">후 기 </a></p></li>
					</ul>
				</div>
			</div>
	</header>
</div>

	<center>
	<form action="q_write_ok.jsp" method="post">
		<table>
			<tr>
				<td>글제목</td>
				<td colspan="3"><input type="text" name=""></td>
				
			</tr>
			<tr>
				<td colspan="4">
					<textarea rows="5" cols="70">
				
					</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="4" align="center">
					<input type="button" value="글수정" onclick="q_write_ok.jsp" class="write-submit">&nbsp;
					<input type="reset" value="다시작성" class="write-submit">&nbsp;
					<input type="button" value="글목록" onclick="location.href='qna.jsp?u_id=<%= u_id %>&pageNum=<%= pageNum %>'" class="write-submit">
			</tr>
		</table>
	</form>
	</center>


<footer>
      <div class="info1">
        <li>
          <h3>about us</h3>
          <p>company: MOODON</p>
          <p>business no: 123-45-67890</p>
          <p>tel. 02-1111-1111</p>
          <p>address: 부산광역시 그린구 그린로 123</p>
          <p><i>Copyright. MOODON all rights reserved.</i></p>
        </li>
        <li>
          <h3>C/S CENTER</h3>
          <p><strong>02-1111-1111</strong></p>
          <p>mon-fri pm1:00~pm6:00</p>
          <p>sat, sun, holiday off</p>
        </li>
      </div>
</footer>	


</body>
</html>