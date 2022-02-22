package com.basic.demo.service;

import com.basic.demo.vo.MemberVO;

public interface MemberService {
	public MemberVO Login(String userid) throws Exception;
}
