package com.basic.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.demo.dao.MemberDao;
import com.basic.demo.service.MemberService;
import com.basic.demo.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDao memberDao;

	@Override
	public MemberVO Login(String userid) throws Exception {
		return memberDao.Login(userid);
	}
	
}
