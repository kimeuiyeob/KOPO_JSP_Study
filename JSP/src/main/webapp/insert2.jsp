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

<!-- css연동 -->
<link rel="stylesheet" href="css/insert2.css">
<HTML>
<HEAD>
</HEAD>
<BODY>

	<%
	String name = "";
	int kor = 0;
	int eng = 0;
	int mat = 0;

	if (request.getParameter("name").isEmpty()) {
		name = "유령";
	} else {
		name = request.getParameter("name");
	}

	int studentid = Integer.parseInt(request.getParameter("studentid"));

	if (request.getParameter("kor").isEmpty()) {
		kor = 0;
	} else {
		kor = Integer.parseInt(request.getParameter("kor"));
	}

	if (request.getParameter("eng").isEmpty()) {
		eng = 0;
	} else {
		eng = Integer.parseInt(request.getParameter("eng"));
	}

	if (request.getParameter("mat").isEmpty()) {
		mat = 0;
	} else {
		mat = Integer.parseInt(request.getParameter("mat"));
	}

	if (kor > 100 || eng > 100 || mat > 100 || kor < 0 || eng < 0 || mat < 0) {
	%>
	<h1>점수 입력이 이상하잖아</h1>
	<div style="padding-left: 200px;">
		<button type="button" onclick="history.back(-1);">뒤로가기</button>
	</div>
	<%
	} else {

	StudentItem studentItem = new StudentItem();

	studentItem.setName(name);
	studentItem.setStudentid(studentid);
	studentItem.setKor(kor);
	studentItem.setEng(eng);
	studentItem.setMat(mat);

	StudentItemDao StudentItemDao = new StudentItemDaoImpl();
	StudentItem oneStudent = StudentItemDao.insert(studentItem);
	%>

	<h1>테이블 값 넣기 성공!!</h1>

	<p>
		이름 : <input type="text" readonly value="<%=name%>">
	</p>
	<p>
		학번 : <input type="text" readonly value="<%=studentid%>">
	</p>
	<p>
		국어 : <input type="text" readonly value="<%=kor%>">
	</p>
	<p>
		영어 : <input type="text" readonly value="<%=eng%>">
	</p>
	<p>
		수학 : <input type="text" readonly value="<%=mat%>">
	</p>

	<div style="padding-left: 125px">
		<button>
			<a href="./intro.html" target="main">첫페이 가기</a>
		</button>
	</div>

	<%
	}
	%>

</BODY>
</HTML>