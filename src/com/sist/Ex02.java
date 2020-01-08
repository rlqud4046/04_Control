package com.sist;

/*
 * 	문제. 키보드로 점수를 입력받아서 해당 점수가 60점 이상이면 "합격" 이라는 문자열을 화면에 출력
 */

public class Ex02 {

	public static void main(String[] args) {

		int score = Integer.parseInt(args[0]);

		if (score >= 60) {
			System.out.println("합격");
		}

	}

}
