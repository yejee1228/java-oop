package com.bitcamp.services;

import com.bitcamp.domains.MemberBeanTest;

public class MemberServiceTest {
	private MemberBeanTest[] members;
	private int count;
	
	public MemberServiceTest() {
		members = new MemberBeanTest[3];
		count=0;
	}
	/**
	 * 0.종료, 1. 회원가입, 2. 마이페이지,
	 * 관리자기능 3. 회원정보, 4. 아이디찾기
	 * */
	public String join(MemberBeanTest param) {
		String msg = "회원가입 성공";
		members[count] = param;
		count++;
		return msg;
	}
	
	public String getMyPage(MemberBeanTest param) {
		String msg = param.toString();
		return msg;
	}
	public String list() {
		String msg = "";
		for(int i= 0; i<count; i++) {
			msg += members[i].toString() + "\n\n";
		}
		return msg;
	}
	public MemberBeanTest findById(String id) {
		MemberBeanTest member = new MemberBeanTest();
		for(int i = 0; i<count; i++) {
			if (id.equals(members[i].getId())) {
				member = members[i];
			}
		}
		return member;
	}
}
