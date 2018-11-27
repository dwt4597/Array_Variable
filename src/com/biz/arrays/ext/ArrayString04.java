package com.biz.arrays.ext;

public class ArrayString04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strKorea = "대한민국 우리나라 만세";
		String[] arrKorea = strKorea.split("");
		for (int i = 0; i < arrKorea.length; i++) {
			System.out.println(arrKorea[i]);
		}
		String strNum = "123456789645231654789415937456";
		String[] arrNum = strNum.split("");
		
		int intSum = 0;
		for(int i =0; i<arrNum.length;i++) {
			intSum += Integer.valueOf(arrNum[i]);
			
		}
	}

}
