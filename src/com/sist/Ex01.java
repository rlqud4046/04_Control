package com.sist;

/*
 * 제어문(Control)
 * 	프로그램의 흐름을 제어하는 명령문
 * 	main() 메서드의 시작 중괄호에서 끝 중괄호 까지 위에서 아래로 순차적으로 실행하는 흐름을 가지고 있음
 * 	이러한 실행 흐름을 개발자가 원하는 방향으로 바꿀 수 있도록 해 주는 것을 말함
 * 	모든 제어문의 실행 결과는 boolean형(true/false)로 나옴
 * 	
 * 	1. 분기문(조건문)	
 * 		if문, if~else문, 다중 if~else문, switch~case문
 * 	2. 반복문
 * 		while문, do~while문, for문
 * 	3. 기타
 * 		break, continue
 */

/*
 * if문 - 조건문
 * 	조건을 제시하고 참이면 실행, 거짓이면 무시함
 * 	실행문이 한 줄이면 { } 생략 가능, 실행문이 두 줄 이상이면 반드시 { } 안에 기재해야 함
 * 	조건식의 결과값은 boolean 형만 올 수 있음
 * 	형식)
 * 		if(조건식) {
 * 				  조건식이 참일 경우 실행문;
 * 				}
 */

public class Ex01 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		int num = 24;

		if (num >= 50) {
			System.out.println("조건식이 참입니다");
			System.out.println("50 이상의 숫자입니다");
		}
		System.out.println();

		int jumsu = 93;
		if (jumsu >= 90) {
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("A학점입니다.");
		}
		
		System.out.println("\n프로그램 종료");
	}

}
