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
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>


<HTML>
<HEAD>
</HEAD>

<link rel="stylesheet" href="css/insert.css">

<script>
	/* number type 글자수 제한 함수 */
	function maxLengthCheck(object) {
		if (object.value.length > object.maxLength) {
			object.value = object.value.slice(0, object.maxLength);
		}
	}
</script>

<BODY>

	<%
	StudentItemDao studentItemDao = new StudentItemDaoImpl();
	int newId = studentItemDao.emptyStudentId();
	%>


	<form action="insert2.jsp" method="post">
		<p>
			이름 : <input type="text" name="name" maxlength="8">
		</p>
		<p>
			학번 : <input type="text" name="studentid" readonly value="<%=newId%>">
		</p>
		<p>
			국어 : <input type="number" name="kor" maxlength="3"
				oninput="maxLengthCheck(this)">
		</p>
		<p>
			영어 : <input type="number" name="eng" maxlength="3"
				oninput="maxLengthCheck(this)">
		</p>
		<p>
			수학 : <input type="number" name="mat" maxlength="3"
				oninput="maxLengthCheck(this)">
		</p>

		<div style="display: flex">
			<div class="but">
				<button type="submit">추가</button>
			</div>
			<div style="padding-left: 20px;">
				<button type="button" onclick="history.back(-1);">뒤로가기</button>
			</div>
		</div>

	</form>



</BODY>
</HTML>