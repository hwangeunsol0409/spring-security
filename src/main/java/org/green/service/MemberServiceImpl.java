package org.green.service;


import java.util.List;

import org.green.domain.MemberVO;
import org.green.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class MemberServiceImpl  implements MemberService {
	
	@Setter(onMethod_= {@Autowired})
	private MemberMapper membermapper;
	
	@Override
	public void register(MemberVO mvo) {
		membermapper.insert(mvo);
		
	}

	@Override
	public MemberVO get(int mnum) {
		MemberVO mvo = membermapper.read(mnum);
		return mvo;
	}

	@Override
	public boolean modify(MemberVO mvo) {
		return membermapper.update(mvo) == 1;
	}

	@Override
	public boolean remove(int mnum) {
		return membermapper.delete(mnum) == 1;
	}

	@Override
	public List<MemberVO> getList() {
		List<MemberVO> memberList = membermapper.getList();
		return memberList;
	}

}
