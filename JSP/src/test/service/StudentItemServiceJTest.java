package service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import kr.ac.kopo07.ctc.kopo07.dto.Pagination;
import kr.ac.kopo07.ctc.kopo07.service.StudentItemDaoMock;
import kr.ac.kopo07.ctc.kopo07.service.StudentItemService;
import kr.ac.kopo07.ctc.kopo07.service.StudentItemServiceImpl;

class StudentItemServiceJTest {

	@Test
	void test_1_1() {
		StudentItemDaoMock studentItemDao = new StudentItemDaoMock();
		StudentItemService studentItemService = new StudentItemServiceImpl();
		studentItemService.setStudentItemDao(studentItemDao);

		Pagination pagination = studentItemService.getPagination(1, 5);

		assertEquals(pagination.getCurrentPage(), 1);
		assertEquals(pagination.getPpre(), -1);
		assertEquals(pagination.getPre(), -1);
		assertEquals(pagination.getStartPage(), 1);
		assertEquals(pagination.getEndPage(), 10);
		assertEquals(pagination.getNext(), 11);
		assertEquals(pagination.getNnext(), 11);
	}

	@Test
	void test_1_2() {
		StudentItemDaoMock studentItemDao = new StudentItemDaoMock();
		StudentItemService studentItemService = new StudentItemServiceImpl();
		studentItemService.setStudentItemDao(studentItemDao);

		Pagination pagination = studentItemService.getPagination(0, 5);

		assertEquals(pagination.getCurrentPage(), 1);
		assertEquals(pagination.getPpre(), -1);
		assertEquals(pagination.getPre(), -1);
		assertEquals(pagination.getStartPage(), 1);
		assertEquals(pagination.getEndPage(), 10);
		assertEquals(pagination.getNext(), 11);
		assertEquals(pagination.getNnext(), 11);
	}

	@Test
	void test_1_3() {
		StudentItemDaoMock studentItemDao = new StudentItemDaoMock();
		StudentItemService studentItemService = new StudentItemServiceImpl();
		studentItemService.setStudentItemDao(studentItemDao);

		Pagination pagination = studentItemService.getPagination(-1, 5);

		assertEquals(pagination.getCurrentPage(), 1);
		assertEquals(pagination.getPpre(), -1);
		assertEquals(pagination.getPre(), -1);
		assertEquals(pagination.getStartPage(), 1);
		assertEquals(pagination.getEndPage(), 10);
		assertEquals(pagination.getNext(), 11);
		assertEquals(pagination.getNnext(), 11);
	}
	
	@Test
	void test_1_4() {
		StudentItemDaoMock studentItemDao = new StudentItemDaoMock();
		StudentItemService studentItemService = new StudentItemServiceImpl();
		studentItemService.setStudentItemDao(studentItemDao);

		Pagination pagination = studentItemService.getPagination(11, 5);

		assertEquals(pagination.getCurrentPage(), 11);
		assertEquals(pagination.getPpre(), 1);
		assertEquals(pagination.getPre(), 1);
		assertEquals(pagination.getStartPage(), 11);
		assertEquals(pagination.getEndPage(), 15);
		assertEquals(pagination.getNext(), -1);
		assertEquals(pagination.getNnext(), -1);
	}


}
