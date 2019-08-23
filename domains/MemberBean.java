package com.bitcamp.domains;

public class MemberBean {
	private String id, pw, name, birth, blood;
	private double height, weight;
	
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public String getBirth() {
		return birth;
	}
	public String getBlood() {
		return blood;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setBirth(String birth) {
		this.birth=birth;
	}
	public void setBlood(String blood) {
		this.blood=blood;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	@Override
	public String toString() {
		//이름, 아이디, 비밀번호, 생년월일, 혈액형, 키, 몸무게
		return String.format("[회원정보]\n"
				+ "이름: %s \n"
				+ "id: %s \n"
				+ "pw: %s \n"
				+ "생년월일: %s \n"
				+ "혈액형: %s \n"
				+ "키: %s cm \n"
				+ "몸무게: %s kg", 
				id, pw, name, birth, blood,height, weight );
	}
}
