package kr.ac.kopo07.ctc.kopo07.service;

import kr.ac.kopo07.ctc.kopo07.dao.StudentItemDao;
import kr.ac.kopo07.ctc.kopo07.dao.StudentItemDaoImpl;
import kr.ac.kopo07.ctc.kopo07.dto.Pagination;

public class StudentItemServiceImpl implements StudentItemService {

	@Override
	public Pagination getPagination(int page, int countPerPage) {

		Pagination pagination = new Pagination();
		StudentItemDaoImpl studentItemDaoImpl = new StudentItemDaoImpl();

		int totalCount = studentItemDaoImpl.totalCount();
		int endPage = 0;

		if (totalCount % countPerPage == 0) {
			endPage = totalCount / countPerPage;
		} else {
			endPage = (totalCount / countPerPage) + 1;
		}

		if (page < 1) {
			pagination.setCurrentPage(1);
		} else if (endPage < page) {
			pagination.setCurrentPage(endPage);
		} else {
			pagination.setCurrentPage(page);
		}

		// 처음 페이지로 돌아가는 Ppre
		if (page < 11) {
			pagination.setPpre(-1);
		} else {
			pagination.setPpre(1);
		}

		// 전페이지 pre
		if (page < 11) {
			pagination.setPre(-1);
		} else {
			pagination.setPre(((page - 10) / 10) * 10 + 1);
		}

		pagination.setStartPage(((page - 1) / 10) * 10 + 1);

		
		
		pagination.setEndPage(((page - 1) / 10) * 10 + 10);
		
		

		if (page < 11) {
			pagination.setNext(11);
		} else if (page < (endPage / 10 * 10)) {
			pagination.setNext(((page - 1) / 10) * 10 + 11);
		} else if ((endPage / 10 * 10) < page) {
			pagination.setNext(-1);
		}

		if ((endPage / 10 * 10) < page) {
			pagination.setNnext(-1);
		} else {
			pagination.setNnext((endPage / 10 * 10) + 1);
		}

		return pagination;
	}

	// ==============================================================================

	@Override
	public StudentItemDao getStudentItemDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentItemDao setStudentItemDao(StudentItemDao studentItemDao) {
		// TODO Auto-generated method stub
		return null;
	}
}
