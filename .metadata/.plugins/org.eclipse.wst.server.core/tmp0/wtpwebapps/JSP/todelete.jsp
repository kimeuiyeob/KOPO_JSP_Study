<%@ page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="kr.ac.kopo07.ctc.kopo07.dao.*"%>
<%@ page import="kr.ac.kopo07.ctc.kopo07.domain.*"%>

<!-- JDBC 사용시 필요한 임포트 -->
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>

<link rel="stylesheet" href="css/todelete.css">

<HTML>
<HEAD>
</HEAD>
<BODY>

	<%
	int id = Integer.parseInt(request.getParameter("id"));
	StudentItemDao studentItemDao = new StudentItemDaoImpl();
	studentItemDao.deleteOne(id);
	%>

	<h1>삭제 성공 했습니다!!</h1>

	<div style="padding-left: 125px">
		<button>
			<a href="./intro.html" target="main">첫페이 가기</a>
		</button>
	</div>

</BODY>
</HTML>