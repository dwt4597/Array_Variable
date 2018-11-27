package com.biz.arrays;

public class Scores01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어선생님이 어느 반 학생 5명의
		// 국어 점수의 합계를 계산하고자 합니다.
		// 변수를 선언해서 5명 학생의 국어 점수를
		// 저장해두고
		// 총점을 계산

		int intkor=0;
		int sum=0;
		/*
		 * int a = 50; int b = 60; int c = 60; int d = 70; int f = 80; sum = a+b+c+d+f;
		 * System.out.println(sum);
		 */
		int[] array = { 88, 50, 60, 70, 50 };

		for (int i = 0; i < 5; i++) {
			System.out.println(array[i]);
			sum += array[i];
		}
		System.out.println(sum);

	}
	
	public int makeScor() {
			return (int)(Math.random()*(100-50+1)+50);
	}

}
