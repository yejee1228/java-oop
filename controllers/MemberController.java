package com.bitcamp.controllers;
import javax.swing.JOptionPane;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;
public class MemberController {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		MemberBean member = null;
		String []arr = null;
		String temp = "";
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1. 회원가입 \n"
					+ "2. 마이페이지 \n"
					+ "3. 비번수정 \n"
					+ "4. 회원탈퇴 \n"
					+ "5. 아이디 체크 \n"
					+ "6. 로그인 ")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				temp = JOptionPane.showInputDialog("이름, 아이디, 비밀번호, 생년월일, 혈액형, 키, 몸무게");
				arr = temp.split(",");
				member = new MemberBean();
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setBirth(arr[3]);
				member.setBlood(arr[4]);
				member.setHeight(Double.parseDouble(arr[5]));
				member.setWeight(Double.parseDouble(arr[6]));
				
				JOptionPane.showMessageDialog(null, service.join(member));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.getMyPage(member));
				break;
			case "3":
				temp = JOptionPane.showInputDialog("아이디, 현재 비번, 새로운 비번");
				arr=temp.split(",");
				member= new MemberBean();
				member.setId(arr[0]);
				member.setPw(arr[1]+","+arr[2]);
				JOptionPane.showMessageDialog(null, service.changePassword(member));
				break;
			case "4":
				
				break;
			case "5" : 
				temp = JOptionPane.showInputDialog("id입력");
				JOptionPane.showMessageDialog(null, service.existId(temp));
				break;
			case "6" : //로그인
				temp = JOptionPane.showInputDialog("로그인  ID, PW");
				arr = temp.split(",");
				String loginId = arr[0];
				String loginPw = arr[1];
				member = new MemberBean();
				member.setId(loginId);
				member.setPw(loginPw);
				String msg = service.login(member);
				JOptionPane.showMessageDialog(null, msg);
				break;
			}
		}
	}

}
