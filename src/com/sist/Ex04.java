package com.sist;

/*
 * 문제. Ex02 문제를 처리하는데 거짓인 경우 "불합격" 이라는 문자열을 출력하도록 프로그램 수정
 * 
 * 문제2. 키보드로 숫자를 입력받아 입력받은 숫자가 짝수인지 판별하세요.
 * 	
 */

public class Ex04 {

	public static void main(String[] args) {

		int score = Integer.parseInt(args[0]);

		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		if(score%2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}


	}
}

