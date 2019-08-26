package com.bitcamp.domains;
/*
 * 생산자명: company
 * 통화내용 call
 * 통화대상 receiver
 * 문자 text
 * 전화기 형태 : KIND -> 상수: 집전화기, 2G폰, 아이폰, 안드로이드폰
 * 나는 {금성}에서 만든 {집 전화기}를 사용해서{ 길동이}에게 {"안녕"} 이라고 통화했다.
 * */
public class CelphoneBean extends PhoneBean{
	public final static String KIND = "셀룰러폰";
	private String text;
	
	
	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	@Override
		public String toString() {
			return String.format("나는 %s에서 만든 %s를 사용해서 %s에게 %s라고 문자했다",
					super.getCompany(), KIND, super.getReciver(),text);
		}
}
