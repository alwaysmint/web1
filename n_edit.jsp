<%@page import="notice.NoticeBean"%>
<%@page import="notice.NoticeDBBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String u_id = "";
	
	if (request.getParameter("u_id") != null) {
		u_id = request.getParameter("u_id");
	} else {
		response.sendRedirect("notice.jsp");
	}
	
	int n_num = 0;
	
	if (request.getParameter("n_num") != null) {
		n_num = Integer.parseInt(request.getParameter("n_num"));
	}
	
	NoticeDBBean db = NoticeDBBean.getInstance();
	NoticeBean notice = db.getBoard(n_num,false);
	
	if(!u_id.equals(notice.getU_id())) {
%>
		<script>
			history.go(-1);
		</script>
<%
	}
	
	/*--pageNum�� �ޱ�--*/
	String pageNum = request.getParameter("pageNum");
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
      <!--   �α��� ���´� > HOME 
       		 ��α��� ���´� > LOGIN ���̰�  -->
<% 
        if(u_id == null){
%>
          <li><a href="Login.jsp">LOGIN</a></li>
<%  
        } else {
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
	<form action="f_write_ok.jsp?u_id=<%= u_id %>&n_num=<%= n_num %>" method="post">
		<table>
			<tr>
				<td>������</td>
				<td colspan="3"><input type="text" value="<%= notice.getN_title() %>" name=""></td>
				<te>
			</tr>
			<tr>
				<td colspan="4">
					<textarea rows="5" cols="70">
						<%= notice.getN_content() %>
					</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="4" align="center">
					<input type="button" value="�ۼ���" onclick="write_ok()">&nbsp;
					<input type="reset" value="�ٽ��ۼ�" >&nbsp;
					<input type="button" value="�۸��" onclick="location.href='notice.jsp?u_id=<%= u_id %>&pageNum=<%= pageNum %>'" >
				</td>
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
          <p>address: �λ걤���� �׸��� �׸��� 123</p>
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