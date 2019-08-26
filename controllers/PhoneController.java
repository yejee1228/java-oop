package com.bitcamp.controllers;

import javax.swing.JOptionPane;

import com.bitcamp.domains.CelphoneBean;
import com.bitcamp.domains.IPhoneBean;
import com.bitcamp.domains.PhoneBean;
import com.bitcamp.serviceimpls.PhoneServiceImpl;
import com.bitcamp.services.PhoneService;

public class PhoneController {
	public static void main(String[] args) {
		PhoneService service = new PhoneServiceImpl();
		PhoneBean phone = null;
		CelphoneBean celPhone = null;
		IPhoneBean iPhone = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료, 1. 집전화기, 2.2G폰, 3.아이폰, 4.안드로이드폰")) {
			case "0" : JOptionPane.showMessageDialog(null, "0. 종료"); return;
			case "1" :
				String[] arr = JOptionPane
								.showInputDialog("전화기 생산자명, 통화대상, 통화내용 입력")
								.split(",");
				phone = new PhoneBean();
				phone.setCompany(arr[0]);
				phone.setReciver(arr[1]);
				phone.setCall(arr[2]);
				JOptionPane.showMessageDialog(null, service.homePhone(phone));
				break;
			case "2" : 
				arr = JOptionPane.showInputDialog("전화기 생산자명, 통화대상, 문자내용 입력").split(",");
				celPhone = new CelphoneBean();
				celPhone.setCompany(arr[0]);
				celPhone.setReciver(arr[1]);
				celPhone.setText(arr[2]);
				JOptionPane.showMessageDialog(null, service.celPhone(celPhone));
				break;
			case "3" :
				arr = JOptionPane.showInputDialog("전화기 생산자명, 검색대상 입력").split(",");
				iPhone = new IPhoneBean();
				iPhone.setCompany(arr[0]);
				iPhone.setSearch(arr[1]);
				JOptionPane.showMessageDialog(null, service.iPhone(iPhone));
				
			}
		}
	}

}
