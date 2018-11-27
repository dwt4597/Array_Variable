package com.biz.arrays;

public class ScoreArray04 {
	public static void main(String[] args) {
		int[] intMath = new int[100];
		for (int i = 0; i < intMath.length; i++) {
			intMath[i] = ConstMethod.makeScore();
		}
		// 위에서 생성한 intMath 배열의 값 중에서
		// 60이상인 값(if(? >= 60)이 나타나면, 그 값만 console에 출력하라
		for (int i = 0; i < intMath.length; i++) {
			if (intMath[i] >= 60) {
				System.out.println(intMath[i]);
			}
		}

		// 위에서 생성한 intMath 배열의 값 중에서
		// 60이상인 값이 나타나면
		// 그 값이 위치한 index를 출력
		System.out.println("=======================");
		for (int i = 0; i < intMath.length; i++) {
			if (intMath[i] >= 60) {
				System.out.println(i);
			}
		}

		// 위에서 생성한 intMath 배열의 값 중에서
		// 80이상인 값이 나타나면
		// 그 값이 위치한 index를 출력
		System.out.println("=======================");
		int intSum = 0;
		for (int i = 0; i < intMath.length; i++) {
			if (intMath[i] >= 80) {
				intSum += intMath[i];

			}

		}
		System.out.println(intSum);

		// 위에서 생성한 intMath 배열의 값 중에서
		// 80이상인 값이 최초로 나타날때
		// 몇번째인지 출력하시오.
		int intSearch = 0;
		System.out.println("=======================");
		int intSum1 = 0;
		for (int i = 0; i < intMath.length; i++) {
			if (intMath[i] >= 80) {
				intSearch = i;
//				System.out.println("첫번째 80이상인 값 :"+ i +","+intMath[i]);
				break;  // return;   //break는 for문을 종료, return;은 프로그램을 종료
			}

		} 	System.out.println(intSearch);
	}
}
