package com.basic.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.basic.demo.dao.MemberDao;
import com.basic.demo.vo.MemberVO;

import lombok.Setter;

public class CustomUserDetailService implements UserDetailsService{

	@Setter(onMethod_ = { @Autowired })
	private MemberDao memberDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		MemberVO vo = new MemberVO();
		try {
			vo = memberDao.Login(username);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return vo == null ? null : new CustomUser(vo);
	}
	
	
}
