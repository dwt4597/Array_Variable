package com.biz.arrays;

public class ScoreArray05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intScore = new int[5];

		for (int i = 0; i < intScore.length; i++) {
			for (int j = i + 1; i < intScore.length; j++) {
				if (intScore[i] > intScore[j + 1]) {
					int a = intScore[i];
					intScore[i] = intScore[j + 1];
					intScore[j + 1] = a;
				}
			}
		}

	}
}