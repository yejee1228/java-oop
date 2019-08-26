package com.bitcamp.serviceimpls;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;

public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;
	private int count;

	public MemberServiceImpl() {
		members = new MemberBean[10];
		count = 0;
	}

	@Override
	public String join(MemberBean param) {
		String msg = "회원가입 성공";
		members[count] = param;
		count++;
		return msg;
	}

	@Override
	public String getMyPage(MemberBean param) {
		return param.toString();
	}

	@Override
	public String changePassword(MemberBean param) {
		String msg = "비밀번호가 변경되었습니다.";
		String[] pw = param.getPw().split(",");
		String oldPw = pw[0];
		String newPw = pw[1];
		for (int i = 0; i < count; i++) {
			if (param.getId().equals(members[i].getId()) 
					&& oldPw.equals(members[i].getPw())) {
				members[i].setPw(newPw);

				break;
			}
		}
		return msg;
	}

	@Override
	public String withdrawal(MemberBean param) {
		String msg = "회원탈퇴 완료.";
		return msg;
	}

	@Override
	public String existId(String id) {
		String msg = "가입 가능한 아이디입니다.";
		for (int i = 0; i < count; i++) {
			if (id.equals(members[i].getId())) {
				msg = "이미 존재하는 아이디.";
				break;
			}
		}
		return msg;
	}

	@Override
	public String login(MemberBean param) {
		String msg = "로그인 실패";
		for (int i = 0; i < count; i++) {
			if (param.getId().equals(members[i].getId()) 
					&& param.getPw().equals(members[i].getPw())) {
				msg = "로그인 성공";
				break;
			}
		}
		return msg;
	}
}
