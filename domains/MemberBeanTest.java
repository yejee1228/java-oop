package com.bitcamp.domains;

public class MemberBeanTest {
	private String name, id, pw, birth;
	private double height, weight;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return pw;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getBirth() {
		return birth;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		return String.format("[회원정보]\n"
				+ "이름: %s \n"
				+ "id: %s \n"
				+ "pw: %s \n"
				+ "생년월일: %s \n"
				+ "키: %f \n"
				+ "몸무게: %f \n", name, id, pw, birth, height, weight);
	}
}
