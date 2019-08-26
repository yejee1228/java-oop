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
	 * 0.종료, 1. 회원가입, 2. 마이페이지,3. 비번수정. 4. 회원탈퇴, 5.아이디체크, 6.로그인
	 * 관리자기능 1. 회원정보,2. 아이디찾기 3. 이름 검색. 4. 전체회원수
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
	public String changePw(MemberBeanTest param) {
		String msg = "비밀번호 변경 성공";
		String[] pw = param.getPw().split(",");
		String oldPw = pw[0];
		String newPw = pw[1];
		for(int i = 0; i<count; i++) {
			if(param.getId().equals(members[i].getId())
					&&oldPw.equals(members[i].getPw())) {
				members[i].setPw(newPw);
				break;
			}
		}
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
	public MemberBeanTest searchName() {
		MemberBeanTest member = new MemberBeanTest();
		return member;
	}
	public String countMember() {
		return String.valueOf(count);
	}
	public String login(MemberBeanTest param) {
		String msg = "로그인 실패";
		for(int i = 0; i<count; i++) {
			if(param.getId().equals(members[i].getId())
					&& param.getPw().contentEquals(members[i].getPw())){
				msg = "로그인 성공";
				break;
			}
		}
		return msg;
	}
	public MemberBeanTest[] findName(String name) {
		int j = 0;
		for(int i = 0; i<count; i++) {
			if(name.equals(this.members[i].getName())) {
				j++;
			}
		}
		MemberBeanTest[] members= new MemberBeanTest[j];
		j=0;
		for(int i = 0; i<count; i++) {
			if (name.equals(this.members[i].getName())) {
				members [j] = this.members[j];
				j++;
				if(members.length == j) {
					break;
					}
				}
		}
		return members;
	}
}
