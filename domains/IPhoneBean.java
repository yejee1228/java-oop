package com.bitcamp.domains;

public class IPhoneBean extends CelphoneBean{
	private String search;
	public final static String KIND = "아이폰";
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
	@Override
	public String toString() {
		return String.format("나는 %s에서 만든 %s를 사용해서 %s을 검색했다",
				super.getCompany(), KIND, search);
	}
}
