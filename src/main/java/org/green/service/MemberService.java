package org.green.service;

import java.util.List;

import org.green.domain.MemberVO;

public interface MemberService {
	//등록 insert
		public void register(MemberVO mvo);
		//게시글 1개 조회 select
		public MemberVO get(int mnum);
		//수정하기
		public boolean modify(MemberVO mvo);
		//삭제하기
		public boolean remove(int mnum);
		//게시글 목록조회
		public List<MemberVO> getList();
}
