<%@page import="comment.CommentBean"%>
<%@page import="review.ReviewDBBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="com" class="comment.CommentBean"></jsp:useBean>
<jsp:setProperty property="*" name="com"/>
<%
	String u_id = "";
	
	if (request.getParameter("u_id") != null) {
		u_id = request.getParameter("u_id");
	} else {
		response.sendRedirect("review.jsp");
	}
	
	int r_num = 0;
	
	if (request.getParameter("r_num") != null) {
		r_num = Integer.parseInt(request.getParameter("r_num"));
	}
	
	/*--�ش� �� �ۼ��� �ޱ�--*/
	
	String review_id = "";
	if(request.getParameter("review_id") != null) {
		review_id = request.getParameter("review_id");
	}
	
	/*--pageNum�� �ޱ�--*/
	String pageNum = request.getParameter("pageNum");
	
	/*--�����϶�--*/
	int com_num = 0, com_ref = 0, com_step = 0, com_level = 0;
	
	com_ref = r_num;
	
	if (request.getParameter("com_num") != null) {
		com_num = Integer.parseInt(request.getParameter("com_num"));
	}
	
	if (com_num != 0) {
		com_ref = Integer.parseInt(request.getParameter("com_ref"));
		com_step = Integer.parseInt(request.getParameter("com_step"));
		com_level = Integer.parseInt(request.getParameter("com_level"));
	} else {
		com_ref = com_num;
	}
	
	ReviewDBBean db = ReviewDBBean.getInstance();
	
	CommentBean comBoard = new CommentBean();
	
	comBoard.setCom_content(com.getCom_content());
	comBoard.setCom_ref(com_ref);
	comBoard.setCom_step(com_step);
	comBoard.setCom_level(com_level);
	comBoard.setU_id(u_id);
	comBoard.setTable_num(com_num);

	int re = db.insertComment(comBoard);
	
	if(re == 1) {
%>
		<script>
			alert("��� ����� ��ϵǾ����ϴ�.");
		</script>
<%
		response.sendRedirect("r_edit.jsp?ht_id=" + review_id + "&r_num=" + com_num + "&u_id=" + u_id + "&pageNum=" + pageNum);
	} else {
%>
		<script>
			alert("��� ��Ͽ� �����Ͽ����ϴ�.");
		</script>
<%
	}
%>