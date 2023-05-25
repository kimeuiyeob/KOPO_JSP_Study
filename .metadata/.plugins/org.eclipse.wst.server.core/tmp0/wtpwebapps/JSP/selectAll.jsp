<%@ page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="kr.ac.kopo07.ctc.kopo07.dao.*"%>

<!-- JDBC 사용시 필요한 임포트 -->
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>

<HTML>
<HEAD>
</HEAD>

<style>
table {
	border-collapse: separate;
	border-spacing: 0;
	width: 100%;
}

th, td {
	padding: 6px 15px;
}

th {
	background: #42444e;
	color: #fff;
	text-align: left;
}

tr:first-child th:first-child {
	border-top-left-radius: 6px;
}

tr:first-child th:last-child {
	border-top-right-radius: 6px;
}

td {
	border-right: 1px solid #c6c9cc;
	border-bottom: 1px solid #c6c9cc;
}

td:first-child {
	border-left: 1px solid #c6c9cc;
}

tr:last-child td:first-child {
	border-bottom-left-radius: 6px;
}

tr:last-child td:last-child {
	border-bottom-right-radius: 6px;
}

#clickhere {
	text-decoration: none;
	font-weight: bold;
}
</style>
<BODY>

	<!-- Mysql데이터 베이스 연결 -->
	<%

	%>

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

			<tbody>
				<tr>
					<%-- <td><a id="clickhere" href="select.jsp?id=<%=id%>"><%=name%></a></td> --%>
					<td>
						<%-- <%=id%> --%>학생번호
					</td>
					<td>
						<%-- <%=kor%> --%>국어점수
					</td>
					<td>
						<%-- <%=eng%> --%>영어점수
					</td>
					<td>
						<%-- <%=mat%> --%>수학점수
					</td>
				</tr>
			</tbody>

			<h1>테이블을 우선 생성해주세요!!</h1>

		</table>
	</center>

</BODY>
</HTML>