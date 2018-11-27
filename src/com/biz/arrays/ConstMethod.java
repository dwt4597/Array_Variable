package com.biz.arrays;

public class ConstMethod {
	public /*static 제거 xㅡ> 클래스가 static클래스로 바뀜
	*/static int makeScore() {
		return (int) (Math.random() * (100 - 50 + 1) + 50);
	}
	
	
}
