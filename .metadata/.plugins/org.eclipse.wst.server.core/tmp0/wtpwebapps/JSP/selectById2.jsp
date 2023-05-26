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

<HTML>
<HEAD>
</HEAD>

<link rel="stylesheet" href="css/selectById2.css">

<script>
	//학생정보 수정
	function update() {
		const form = document.getElementById('form')
		form.action = "toupdate.jsp";
		form.submit();
	}
	//학생정보 삭제
	function deletes() {
		const form = document.getElementById('form')
		form.action = "todelete.jsp";
		form.submit();
	}
</script>

<BODY>


	<%
	int studentid = Integer.parseInt(request.getParameter("studentid"));
	StudentItemDao StudentItemDao = new StudentItemDaoImpl();
	StudentItem oneStudent = StudentItemDao.selectOneByStudentId(studentid);

	if (oneStudent.getName() == null) {
	%>

	<h1>해당 학생번호가 없습니다.</h1>
	<div style="padding-left: 200px;">
		<button type="button" onclick="history.back(-1);">뒤로가기</button>
	</div>

	<%
	} else {
	%>


	<div id="score">
		<form id="form" method="post">
			<p>
				이름 : <input type="text" name="name"
					value="<%=oneStudent.getName()%>">
			</p>
			<p>
				학번 : <input type="text" name="studentId" readonly
					value="<%=oneStudent.getStudentid()%>">
			</p>
			<p>
				국어 : <input type="number" name="kor"
					value="<%=oneStudent.getKor()%>">
			</p>
			<p>
				영어 : <input type="number" name="eng"
					value="<%=oneStudent.getEng()%>">
			</p>
			<p>
				수학 : <input type="number" name="mat"
					value="<%=oneStudent.getMat()%>">
			</p>

			<input type="hidden" name="id" value="<%=oneStudent.getId()%>">

			<div style="display: flex">
				<div class="but">
					<button type="button" onclick="update();">수정하기</button>
				</div>

				<div style="padding-left: 20px;">
					<button type="button" onclick="deletes();">삭제하기</button>
				</div>

			</div>
		</form>
	</div>

	<%
	}
	%>

</BODY>
</HTML>