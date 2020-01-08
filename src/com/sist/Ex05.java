package com.sist;

/*
 * 다중 if~else
 * 	형식)
 * 		if(조건식1){
 * 				조건식1이 참일 경우 실행문;
 * 		} else if(조건식2){
 * 				조건식 1이 거짓이고 조건식2가 참일 경우 실행문;
 * 		} else if(조건식3){
 * 				조건식1, 조건식2는 거짓이고 조건식 3은 참인 경우 실행문;
 * 		} else {
 * 				조건식 1,2,3이 모두 거짓인 경우 실행문;
 * 		}
 */

public class Ex05 {

	public static void main(String[] args) {

		int num = 5;

		if (num == 1) {
			System.out.println("입력한 숫자는 1입니다.");
		} else if (num == 2) {
			System.out.println("입력한 숫자는 2입니다.");
		} else if (num == 3) {
			System.out.println("입력한 숫자는 3입니다.");
		} else {
			System.out.println("1~3 이외의 숫자입니다.");
		}
	}

}
