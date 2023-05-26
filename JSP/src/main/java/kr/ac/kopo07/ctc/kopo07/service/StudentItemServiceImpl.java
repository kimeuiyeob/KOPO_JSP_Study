package kr.ac.kopo07.ctc.kopo07.service;

import kr.ac.kopo07.ctc.kopo07.dao.StudentItemDao;
import kr.ac.kopo07.ctc.kopo07.dao.StudentItemDaoImpl;
import kr.ac.kopo07.ctc.kopo07.dto.Pagination;

public class StudentItemServiceImpl implements StudentItemService {

	@Override
	// currentPage = 현재페이지
	// itemCountPerPage = 한페이지당 화면에 보여질 개시글 수
	public Pagination getPagination(int currentPage, int itemCountPerPage) {

		StudentItemDaoImpl studentItemDaoImpl = new StudentItemDaoImpl();

		// 게시물 총갯수
		int totalItemCount = studentItemDaoImpl.totalCount();

		// 총 페이지 갯수
		int totalPageCnt = 0;

		// 만약 페이지 총갯수가 0으로 나누어 떨어지지 않다면 총 +1
		if (totalItemCount % itemCountPerPage == 0) {
			totalPageCnt = totalItemCount / itemCountPerPage;
		} else {
			totalPageCnt = totalItemCount / itemCountPerPage + 1;
		}

		// 첫페이지
		int startPage = 1;

		// 한 화면에 보여지는 페이지 개수 = 10개로 셋팅
		int numPagePerScreen = 10;

		Pagination pagination = new Pagination();

		pagination.setCurrentPage(currentPage);
		pagination.setEndPage(totalPageCnt);

		// 만약 현재페이지가 1보다 작을때 1로, 현재페이지가 마지막 페이지 보다 클때 마지막페이지
		if (currentPage <= 0) {
			currentPage = 1;
		} else if (currentPage > totalPageCnt) {
			currentPage = totalPageCnt;
		}

		// currentGroupSequence = 현재 그룹 => ex) 1~10일때 0, 11~20 일때 1, 21 ~ 30일때 2
		int currentGroupSequence = currentPage / 10;

		if (currentPage % 10 == 0) {
			currentGroupSequence--;
		}

		int minGroupSequence = 0;
		int maxGroupSequence = totalPageCnt / 10;

		System.out.println("currentGroupSequence = " + currentGroupSequence);
		System.out.println("totalPageCnt = " + totalPageCnt);

		// 현제 페이지가 1~10일때
		if (currentGroupSequence == minGroupSequence) {

			pagination.setCurrentPage(currentPage);
			pagination.setPre(-1);
			pagination.setPpre(-1);
			pagination.setNext(10 * (currentGroupSequence + 1) + 1);
			pagination.setNnext(10 * maxGroupSequence + 1);
			pagination.setStartPage(10 * currentGroupSequence + 1);
			pagination.setEndPage(10 * currentGroupSequence + 10);

			// 페이지 갯수 ex) 1~7까지 있을때
			if (totalPageCnt < 10) {
				pagination.setEndPage(totalPageCnt);
				pagination.setNext(-1);
				pagination.setNnext(-1);
			}

			// 현제 페이지가 마지막 일때
		} else if (currentGroupSequence == maxGroupSequence) {

			pagination.setCurrentPage(currentPage);
			pagination.setPre(10 * (currentGroupSequence - 1) + 1);
			pagination.setPpre(10 * minGroupSequence + 1);
			pagination.setNext(-1);
			pagination.setNnext(-1);
			pagination.setStartPage(10 * currentGroupSequence + 1);
			pagination.setEndPage(totalPageCnt);

		} else {

			pagination.setCurrentPage(currentPage);
			pagination.setPre(10 * (currentGroupSequence - 1) + 1);
			pagination.setPpre(10 * minGroupSequence + 1);
			pagination.setNext(10 * (currentGroupSequence + 1) + 1);
			pagination.setNnext(10 * maxGroupSequence + 1);
			pagination.setStartPage(10 * currentGroupSequence + 1);
			pagination.setEndPage(10 * currentGroupSequence + 10);

		}

		_print(pagination);
		System.out.println("====================================");
		return pagination;
	}

	public void _print(Pagination pagination) {
		System.out.println("-----------------------------------");
		System.out.println("currentPage = " + pagination.getCurrentPage());
		System.out.println("ppre = " + pagination.getPpre());
		System.out.println("pre = " + pagination.getPre());
		System.out.println("startPage = " + pagination.getStartPage());
		System.out.println("endPage = " + pagination.getEndPage());
		System.out.println("next = " + pagination.getNext());
		System.out.println("nnext = " + pagination.getNnext());

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
