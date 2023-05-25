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
<style>
	h1 {
	padding-left : 100px;
	}
</style>
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
		Statement stmt = conn.createStatement();

        //======================= 트와이스 테이블 삭제 =======================

        stmt.execute("drop table twice");
        
        stmt.close(); 
        conn.close(); 

    %>

		<h1>테이블 삭제 성공!!</h1>

	<%


	} catch (SQLException e) {

    %>

		<h1>테이블을 우선 생성해주세요!!</h1>

	<%
	}
	%>

</BODY>
</HTML>