package com.biz.arrays;

public class StringArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strNation = { "KOREA", "대한민국", "우리나라", "Republic of Krea" };
		String[] strNation2 = new String[5];
		strNation2[0] = "Korea";
		strNation2[1] = "대한민국";
		strNation2[2] = "우리나라";
		strNation2[3] = "Republic of Krea";
	
		String[] strS1 = new String[10];
		System.out.println(strS1.length); 		// 그냥 배열임. String은 그럼
		//System.out.println(strS1[0].length()); 	//문자열이 됨. String은 그럼
		
		int[] intN1 = new int[10];		//String이 아닌건 바로 초기화가 됐다.
		System.out.println(intN1[0]); 	//ㅇㅇ
		
		int intN = 0;
		System.out.println(intN);
		
	}
}
