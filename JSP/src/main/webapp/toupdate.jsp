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

<%-- 한글 깨짐 --%>
<%
request.setCharacterEncoding("UTF-8");
%>

<link rel="stylesheet" href="css/toupdate.css">

<HTML>
<HEAD>
</HEAD>
<BODY>
	<%
	String name = request.getParameter("name");
	int studentid = Integer.parseInt(request.getParameter("studentId"));
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int mat = Integer.parseInt(request.getParameter("mat"));
	int id = Integer.parseInt(request.getParameter("id"));

	StudentItem studentItem = new StudentItem();

	studentItem.setName(name);
	studentItem.setStudentid(studentid);
	studentItem.setKor(kor);
	studentItem.setEng(eng);
	studentItem.setMat(mat);
	studentItem.setId(id);

	StudentItemDao StudentItemDao = new StudentItemDaoImpl();
	StudentItem oneStudent = StudentItemDao.update(studentItem);
	%>

	<h1>회원 수정 성공!!</h1>

	<p>
		이름 : <input type="text" name="name" readonly
			value="<%=oneStudent.getName()%>">
	</p>

	<p>
		학번 : <input type="text" name="id" readonly
			value="<%=oneStudent.getStudentid()%>">
	</p>

	<p>
		국어 : <input type="number" name="kor" readonly
			value="<%=oneStudent.getKor()%>">
	</p>
	<p>
		영어 : <input type="number" name="eng" readonly
			value="<%=oneStudent.getEng()%>">
	</p>
	<p>
		수학 : <input type="number" name="mat" readonly
			value="<%=oneStudent.getMat()%>">
	</p>
	<div style="padding-left: 125px">
		<button>
			<a href="./intro.html" target="main">첫페이 가기</a>
		</button>
	</div>

</BODY>
</HTML>