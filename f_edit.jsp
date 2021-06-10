<%@page import="faq.FaqDBBean"%>
<%@page import="faq.FaqBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String u_id = "";
	
	if (request.getParameter("u_id") != null) {
		u_id = request.getParameter("u_id");
	} else {
		response.sendRedirect("faq.jsp");
	}
	
	int f_num = 0;
	
	if (request.getParameter("f_num") != null) {
		f_num = Integer.parseInt(request.getParameter("f_num"));
	}
	
	FaqDBBean db = FaqDBBean.getInstance();
	FaqBean faq = db.getBoard(f_num,false);
	
	if(!u_id.equals(faq.getU_id())) {
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
	<script type="text/javascript" src="faq.js" charset="utf-8"></script>
	<link rel="stylesheet" href="board.css" type="text/css">
	<script src="https://kit.fontawesome.com/60f6a26247.js" crossorigin="anonymous"></script>
</head>
<body>
<center>
	<form action="f_write_ok.jsp?u_id=<%= u_id %>&f_num=<%= f_num %>" method="post">
		<table>
			<tr>
				<td>������</td>
				<td colspan="3"><input type="text" value="<%= faq.getF_title() %>"></td>
				<te>
			</tr>
			<tr>
				<td>�ۺз�</td>
				<td><input type="text" size="30" value="<%= faq.getF_category() %>"></td>
			</tr>
			<tr>
				<td colspan="4">
					<textarea rows="5" cols="70">
						<%= faq.getF_content() %>
					</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="4" align="center">
					<input type="button" value="�����ϱ�" onclick="write_ok()">&nbsp;
					<input type="reset" value="�ٽ��ۼ�">&nbsp;
					<input type="button" value="�۸��" onclick="location.href='faq.jsp?u_id=<%= u_id %>&pageNum=<%= pageNum %>'">
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