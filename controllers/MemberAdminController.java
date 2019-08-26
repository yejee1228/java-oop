package com.bitcamp.controllers;
import javax.swing.JOptionPane;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.serviceimpls.AdminServiceImpl;
import com.bitcamp.services.MemberAdminService;
public class MemberAdminController {

	public static void main(String[] args) {
		MemberAdminService service = new AdminServiceImpl();
		MemberBean member = new MemberBean();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1. 회원목록 \n"
					+ "2. 아이디검색 \n"
					+ "3. 이름검색 \n"
					+ "4. 전체 회원수")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1" :
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "2":
				String searchId = JOptionPane.showInputDialog("검색ID");
				member = service.findById(searchId);
				JOptionPane.showMessageDialog(null, member);
				break;
			case "3" :
				String searchName = JOptionPane.showInputDialog("검색 이름");
				JOptionPane.showMessageDialog(null, service.findByName(searchName));
				break;
			case "4" :
				JOptionPane.showMessageDialog(null, service.CountAll());
				break;
			}
		}
	}
}
