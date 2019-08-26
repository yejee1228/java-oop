package com.bitcamp.controllers;
import javax.swing.JOptionPane;

import com.bitcamp.domains.MemberBeanTest;
import com.bitcamp.services.MemberServiceTest;

public class MemberControllerTest {

	public static void main(String[] args) {
		MemberServiceTest service = new MemberServiceTest();
		MemberBeanTest member = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료  \n"
					+ "1.회원가입  \n"
					+ "2.마이페이지 \n"
					+ "3.회원정보 \n"
					+ "4.아이디검색 \n"
					+ "5.비번수정\n"
					+ "6.아이디 중복체크\n"
					+ "7.로그인\n"
					+ "8.이름검색\n"
					+ "9.전체회원수\n")){
				case "0" : JOptionPane.showMessageDialog(null,"종료");
					return;
				case "1" : 
					member = new MemberBeanTest();
					String spec = JOptionPane.showInputDialog("이름, 아이디, 비밀번호, 생일, 키, 몸무게");
					String[] arr = spec.split(",");
					member.setName(arr[0]);
					member.setId(arr[1]);
					member.setPw(arr[2]);
					member.setBirth(arr[3]);
					member.setHeight(Double.parseDouble(arr[4]));
					member.setWeight(Double.parseDouble(arr[5]));
					JOptionPane.showMessageDialog(null, service.join(member));
					break;
				case "2" :
					JOptionPane.showMessageDialog(null, service.getMyPage(member));
					break;
				case "3" :JOptionPane.showMessageDialog(null, service.list());
					break;
				case "4" :
					String serchId = JOptionPane.showInputDialog("id입력");
					JOptionPane.showMessageDialog(null, service.findById(serchId));
					break;
				case "5" ://비번수정
					spec = JOptionPane.showInputDialog("아이디, 현재비번, 새비번");
					arr = spec.split(",");
					member= new MemberBeanTest();
					member.setId(arr[0]);
					member.setPw(arr[1]+","+arr[2]);
					JOptionPane.showMessageDialog(null, service.changePw(member));
					break;
				case"6" ://아이디 중복체크
					spec = JOptionPane.showInputDialog("ID 입력");
					JOptionPane.showMessageDialog(null, service.findById(spec));
					break;
				case "7" : //로그인
					spec = JOptionPane.showInputDialog("id, pw입력");
					arr = spec.split(",");
					String loginId = arr[0];
					String loginPw = arr[1];
					member = new MemberBeanTest();
					member.setId(loginId);
					member.setPw(loginPw);
					JOptionPane.showMessageDialog(null, service.login(member));
				case "8" : //이름검색
					spec = JOptionPane.showInputDialog("이름입력");
					JOptionPane.showMessageDialog(null, service.findName(spec));
				case "9" : //전체 회원수
					JOptionPane.showMessageDialog(null, service.countMember());
			}
		}	
	}

}
