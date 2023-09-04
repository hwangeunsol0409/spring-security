package org.green.mapper;

import java.util.List;

import org.green.domain.MemberVO;

public interface MemberMapper {
	//read ==> all select 철
		public List<MemberVO> getList();
		
		//create ==> insert처리
		public void insert(MemberVO mvo);
		
		//read ==> select 처리
		public MemberVO read(int mnum);
		
		//delete ==>delete처리
		public int delete(int mnum);
		
		//update ==> update처리
		public int update(MemberVO mvo);

}
