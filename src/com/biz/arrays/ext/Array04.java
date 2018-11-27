package com.biz.arrays.ext;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주소가 복사됨. n1[0]의 주소가 n2[0], n3[0]. 따라서 n1[0]에 30을대입하면 나머지들도 참조주소가 
		// 같으니 같은 값을 호출
		int[] arrN1 = new int[10];
		
		int[] arrN2 = arrN1;
		int[] arrN3 = arrN2;
		
		arrN1[0]=30;
		System.out.println(arrN1[0]);
		System.out.println(arrN2[0]);
		System.out.println(arrN3[0]);
	}

}
