<%@ page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- JDBC 사용시 필요한 임포트 -->
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>

<link rel="stylesheet" href="css/selectById.css">

<HTML>
<HEAD>
</HEAD>

<BODY>

	<form action="selectById2.jsp" method="post">
		<div style="display: flex">
			<p>
				학번 : <input type="text" name="studentid">
			</p>
			<div class="but" style="padding-top: 30px">
				<button type="submit">조회 하기</button>
			</div>
		</div>
	</form>

</BODY>
</HTML>