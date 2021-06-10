<%@page import="notice.NoticeDBBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="notice" class="notice.NoticeBean"></jsp:useBean>
<jsp:setProperty property="*" name="notice"/>
<%
	String u_id = request.getParameter("u_id");

	NoticeDBBean db = NoticeDBBean.getInstance();
	
	if(db.insertBoard(notice, u_id) == 1) {
		response.sendRedirect("notice.jsp?u_id=" + u_id);
	} else {
		response.sendRedirect("n_write.jsp?u_id=" + u_id);
	}
%>