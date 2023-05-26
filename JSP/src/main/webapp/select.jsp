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

<link rel="stylesheet" href="css/select.css">

<HTML>
<HEAD>
</HEAD>
<BODY>
	<center>
		<table>
			<thead>
				<tr id="thead">
					<th>이름</th>
					<th>번호</th>
					<th>국어점수</th>
					<th>영어점수</th>
					<th>수학점수</th>
				</tr>
			</thead>

			<%
			int id = Integer.parseInt(request.getParameter("id"));
			StudentItemDao studentItemDao = new StudentItemDaoImpl();
			StudentItem oneStudent = studentItemDao.selectOne(id);
			%>

			<tbody>
				<tr>
					<td><%=oneStudent.getName()%></td>
					<td><%=oneStudent.getStudentid()%></td>
					<td><%=oneStudent.getKor()%></td>
					<td><%=oneStudent.getEng()%></td>
					<td><%=oneStudent.getMat()%></td>
				</tr>
			</tbody>
		</table>
	</center>
</BODY>
</HTML>