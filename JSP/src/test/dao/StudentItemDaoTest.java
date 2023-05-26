package dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import kr.ac.kopo07.ctc.kopo07.dao.StudentItemDao;
import kr.ac.kopo07.ctc.kopo07.dao.StudentItemDaoImpl;
import kr.ac.kopo07.ctc.kopo07.domain.StudentItem;
import kr.ac.kopo07.ctc.kopo07.service.StudentItemDaoMock;

class StudentItemDaoTest {

//	 한명 찾기 테스트
	@Test
	void test_select_one() {
		StudentItemDao studentItemDao = new StudentItemDaoMock();
		StudentItem StudentItem = studentItemDao.selectOne(23);
		assertEquals(StudentItem.getName(), "김의엽");
	}

//	 여러명 찾기 테스트
	@Test
	void test_select_All() {
		StudentItemDao studentItemDao = new StudentItemDaoMock();
		List<StudentItem> StudentItem = studentItemDao.selectAllStudent();
		int numberId = 209901;
		for (int i = 0; i < StudentItem.size(); i++) {
			assertEquals(StudentItem.get(i).getStudentid(), (209901 + i));
		}
	}

//	 테이블 생성 테스트
	@Test
	void test_create_table() {
		StudentItemDao studentItemDao = new StudentItemDaoMock();
		studentItemDao.createTable();
	}

//	테이블 삭제 테스트
	@Test
	void test_drop_table() {
		StudentItemDao studentItemDao = new StudentItemDaoMock();
		studentItemDao.dropTable();
	}

//	테이블 랜덤 값 넣기 테스트
	@Test
	void test_insertRandom_table() {
		StudentItemDao studentItemDao = new StudentItemDaoMock();
		studentItemDao.insertRandomStudent10();
	}

}
