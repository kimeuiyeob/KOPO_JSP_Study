package kr.ac.kopo07.ctc.kopo07.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo07.ctc.kopo07.domain.StudentItem;

public class StudentItemDaoImpl implements StudentItemDao {

	@Override
	public StudentItem create() {
		return null;
	}

	@Override
	public StudentItem selectOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentItem> selectAll(int page, int countPerPage) {
		// TODO Auto-generated method stub
		return null;
	}

//	====================================================================

	// 학생 전부 가져오기
	@Override
	public List<StudentItem> selectAllStudent() {

		Connection conn = null;
		List<StudentItem> studentItemList = new ArrayList<>();
		try {
			String url = "jdbc:mysql://localhost:33060/kopo07?useSSL=false";
			String user = "root";
			String pw = "1234";

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pw);
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("select * from twice");

			while (rset.next()) {
				StudentItem studentItem = new StudentItem();
				studentItem.setName(rset.getString(1));
				studentItem.setStudentid(rset.getInt(2));
				studentItem.setKor(rset.getInt(3));
				studentItem.setEng(rset.getInt(4));
				studentItem.setMat(rset.getInt(5));
				studentItem.setId(rset.getInt(6));
				studentItemList.add(studentItem);
			}

			stmt.close();
			conn.close();
			System.out.println(studentItemList);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("학생 전부 조회하기 에러");
		}

		return null;
	}

	@Override
	public int totalCount() {
		return 75;
	}

}
