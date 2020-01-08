package com.sist;

import java.util.Scanner;

/*
 * 키보드로 5개의 정수를 입력받아서 최대값을 화면에 출력해 보자.
 * 예) 17 34 8 98 77
 * 
 */

public class Ex21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int temp = 0; // 키보드로 입력받은 변수가 저장될 공간
		int max = -99;
		int su = 1 ;
		while(su <=5) {
			System.out.println(su + "번째 정수 입력 : ");
			temp = sc.nextInt();
			
			if(temp >max) {
				max = temp;
			}
			su++;
		}
		System.out.println("최대값 = " + max);
		
		sc.close();
	}
}

