<%@page import="notice.NoticeDBBean"%>
<%@page import="notice.NoticeBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	/* 사용자 아이디 */
	String u_id = "";
	if (request.getParameter("u_id") != null) {
		u_id = request.getParameter("u_id");
	}
	
	/* 페이지 */
	String pageNum = "";
	
	if(request.getParameter("pageNum") != null) {
		pageNum = request.getParameter("pageNum");
	} else {
		pageNum = "1";
	}
	
	int n_num = 0;
	
	if (request.getParameter("n_num") != null) {
		n_num = Integer.parseInt(request.getParameter("n_num"));
	}
	
	/*--해당 글 작성자 받기--*/
	String con_id = "";
	if(request.getParameter("n_id") != null) {
		con_id = request.getParameter("n_id");
	}
	System.out.println(u_id);
	System.out.println(con_id);
	
	NoticeDBBean db = NoticeDBBean.getInstance();
	NoticeBean nb = null;
	
	if(u_id.equals(con_id)) {
		nb = db.getBoard(n_num,false);
	} else {
		nb = db.getBoard(n_num,true);
	}
	
	/*--관리자와 사용자 구분--*/
	int re = db.confirmManager(u_id);
	
	String n_title = "", n_content = "", n_id="";
	
	if ((nb) != null) {
		n_title = nb.getN_title();
		n_content = nb.getN_content();
		n_id = nb.getU_id();
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
      
</header>
</div>


<center>
<h1>N O T I C E</h1>
	<form method="post" action="n_delete_ok.jsp?n_num=<%= n_num %>&u_id=<%= u_id %>&pageNum=<%= pageNum %>" name="show_frm">
		<table cellspacing="0" width="600" border="1">
			<tr>
				<td width="100" align="center" >글제목</td>
				<td colspan="3"><%= n_title %> </td>
			</tr>
	
			<tr align="center">
				
				<td width="100">작성자</td>
				<td width="200"><%= n_id %>  </td>
			</tr>
			<tr>
				<td width="100" align="center" >글내용</td>
				<td colspan="3"><%= n_content %>  </td>
			</tr>
			
		</table>
		<br><br>
		
				<% 
     			   if(u_id == null){
        		%>
            	<input type="button" value="글수정" onclick="location.href='n_edit.jsp'">
				&nbsp;&nbsp;&nbsp;&nbsp;
		 		<input type="button" value="글삭제" onclick="delete_ok()">
				&nbsp;&nbsp;&nbsp;&nbsp;
				
				<%
     			   }
				%>
				<input type="button" value="글목록" onclick="location.href='notice.jsp?u_id=<%= u_id %>&pageNum=<%= pageNum %>'">
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