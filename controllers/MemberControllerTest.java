package com.bitcamp.controllers;
import javax.swing.JOptionPane;

import com.bitcamp.domains.MemberBeanTest;
import com.bitcamp.services.MemberServiceTest;

public class MemberControllerTest {

	public static void main(String[] args) {
		MemberServiceTest service = new MemberServiceTest();
		MemberBeanTest member = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료  \n1.회원가입  \n2.마이페이지 \n3.회원정보 \n4.아이디찾기")){
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
			}
		}	
	}

}
