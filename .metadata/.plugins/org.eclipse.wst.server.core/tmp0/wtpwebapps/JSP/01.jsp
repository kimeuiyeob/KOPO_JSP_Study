<%@ page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- JDBC 사용시 필요한 임포트 -->
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="java.io.*"%>

<HTML>
<HEAD>
</HEAD>
<BODY>

	<!-- Mysql데이터 베이스 연결 -->
	<%
	Connection conn = null;

	try {

		String url = "jdbc:mysql://localhost:33060/kopo07?useSSL=false";
		String user = "root";
		String pw = "1234";

		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, pw);
		out.print("데이터 베이스 연결 성공!!");

	} catch (SQLException e) {

		out.print("데이터 베이스 연결 실패~~");
		out.print("SQLException : " + e.getMessage());

	} finally {
		if (conn != null) {
			conn.close();
		}
	}
	%>

</BODY>
</HTML>