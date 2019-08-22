package com.bitcamp.domains;

public class SubjectBean {
	private int kor, eng, math;
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}
	public void getMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	@Override
	public String toString() {
		return String.format("국어: %d \n영어: %d \n수학: %d", kor, eng, math);
	}
}
