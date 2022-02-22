package com.basic.demo.vo;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class MemberVO {

	private String id;
	private String password;
	private String userName;
	private boolean enabled;
	
	private Date regdate;
	private List<AuthVO> authList;
	
	// to String
    @Override
    public String toString() {
        return "MemberVO [id=" + id + ", password=" + password + "]";
    }
}
