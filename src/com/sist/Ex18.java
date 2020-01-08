package com.sist;

/*
 * 반복문
 * 	1. while 반복문
 * 		조건문을 비교하여 참인 경우 계속하여 반복 실행문을 실행하고, 조건식이 거짓인 경우 반복문을 빠져나감.
 * 		반복문에는 반드시 초기식, 조건식, 증감식이 따라다닌다.
 * 		형식)
 * 			while(조건식) {
 * 				반복 실행문;
 * 			}
 * 
 * 	2. do~ while 반복문
 * 		먼저 반복 실행문을 실행하고 조건을 비교함.
 * 		한 번 이상 반복 실행문이 수행되어야 하는 경우에 사용
 * 		형식)
 * 		do {
 * 			반복 실행문;
 * 		}while(조건식); >> 조건식이 거짓이더라도 한번은 무조건 실행
 */

public class Ex18 {

	public static void main(String[] args) {

		System.out.println("num ==> " + 1);
		System.out.println("num ==> " + 2);
		System.out.println("num ==> " + 3);
		System.out.println("num ==> " + 4);
		System.out.println("num ==> " + 5);
		System.out.println("num ==> " + 6);
		System.out.println("num ==> " + 7);
		System.out.println("num ==> " + 8);
		System.out.println("num ==> " + 9);
		System.out.println("num ==> " + 10);

		System.out.println();

		// 위와같은 방식이 아닌 while 반복문을 사용하여 출력해보자.

		int su = 1; // 초기식
		while (su <= 10) { // 조건식
			System.out.println("su ==> " + su);
			su++; // 증감식
		}

	}

}
