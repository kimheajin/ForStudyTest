package com.basic.demo.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.basic.demo.vo.MemberVO;

@Repository
public class MemberDao {
	
	@Autowired
    private SqlSessionTemplate mybatis;

	public MemberVO Login(String userid) throws Exception {
		return mybatis.selectOne("Member.Login", userid);
	}

}
