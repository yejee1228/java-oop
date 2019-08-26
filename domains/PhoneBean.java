package com.bitcamp.domains;
/*
 * 생산자명: company
 * 통화내용 call
 * 통화대상 receiver
 * 전화기 형태 : KIND -> 상수: 집전화기, 2G폰, 아이폰, 안드로이드폰
 * 나는 {금성}에서 만든 {집 전화기}를 사용해서{ 길동이}에게 {"안녕"} 이라고 통화했다.
 * */
public class PhoneBean {
	private String company, call, reciver;
	public final static String KIND = "집전화기";

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public String getReciver() {
		return reciver;
	}

	public void setReciver(String reciver) {
		this.reciver = reciver;
	}

	@Override
	public String toString() {
		return String.format("나는 %s에서 만든 %s를 사용해서 %s에게 %s라고 통화했다.", company, KIND, reciver, call);
	}
	
	
}
