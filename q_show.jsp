<%@page import="java.sql.Timestamp"%>
<%@page import="qna.QnaBean"%>
<%@page import="qna.QnaDBBean"%>
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
	
	/*--�ش� �� �ۼ��� �ޱ�--*/
	String con_id = "";
	if(request.getParameter("qna_id") != null) {
		con_id = request.getParameter("qna_id");
	}
	System.out.println(u_id);
	System.out.println(con_id);
	
	QnaDBBean db = QnaDBBean.getInstance();
	QnaBean hb = null;
	
	if(u_id.equals(con_id)) {
		hb = db.getBoard(q_num);
	} else {
		hb = db.getBoard(q_num);
	}
	
	/*--�����ڿ� ����� ����--*/
	int re = db.confirmManager(u_id);
	
	int q_hit = 0;
	String q_title = "", q_category="", q_content = "",q_id="";
	Timestamp q_date = null;
	
	if (hb != null) {
		q_title = hb.getQ_title();
		q_category = hb.getQ_category();
		q_content = hb.getQ_content();
		q_hit = hb.getQ_hit();
		q_date = hb.getQ_date();
		q_id = hb.getU_id();
	}
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<link rel="stylesheet" href="board.css" type="text/css">
	<script src="https://kit.fontawesome.com/60f6a26247.js" crossorigin="anonymous"></script>
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
						<li class="menu1"><p><a href="notice.jsp">��������</a></p></li>
						<li class="menu2"><p><a href="faq.jsp">F A Q</a></p></li>
						<li class="menu3"><p><a href="qna.jsp">Q & A</a></p></li>
						<li class="menu4"><p><a href="review.jsp">�� �� </a></p></li>
					</ul>
				</div>
			</div>
	</header>
</div>

<center>
		<h1>Q&A</h1>
		<table cellspacing="0" width="600" border="1">
			<tr>
				<td width="100" align="center" >�ۺз�</td>
				<td> <%=q_category %></td>
				<td width="300" align="center" >������</td>
				<td><%= q_title %> </td>
			</tr>
	
			<tr align="center">
				<td width="100">�ۼ���</td>
				<td width="200"><%= q_id %> </td>
				<td width="100">�ۼ���</td>
				<td width="200"><%= q_date %> </td>
			</tr>
		
			<tr>
				<td width="100" align="center" >�۳���</td>
				<td colspan="3"><%= q_content %> </td>
			</tr>
			
		</table>
		<br><br>
		
		
		
        <form method="post" action="" name="">
            <table>
                <tr>
                    <td>��۾���</td>
                    <td></td>
                </tr>
                <tr>
                    <td>
                        <textarea name="" placeholder="�弳, ����ϴ� ���� ����" rows="3" cols="45">
                        </textarea>
                    </td>
                    <td>
                			<input type="button" value="���" onclick="" class="write-submit">
                    </td>
                </tr>
                <tr>
                	<td>
                	<br><br>
                		<input type="button" value="�ۼ���" onclick="location.href='q_edit.jsp'"class="write-submit" >
						&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="button" value="�ۻ���" onclick="delete_ok()" class="write-submit">
						&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="button" value="�۸��" onclick="location.href='qna.jsp?'" class="write-submit" >
                	</td>
                </tr>
            </table>
        </form>
    	<br><br>
    

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