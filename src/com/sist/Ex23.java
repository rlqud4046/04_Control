package com.sist;

import java.util.Scanner;

/*
 * 1. 1~100까지 홀수의 합과 짝수의 합을 for문을 이용하여 출력
 * 2. 키보드로 입력받은 수 까지의 홀수의 합과 짝수의 합을 for문을 이용하여 출력
 */

public class Ex23 {

	public static void main(String[] args) {

		int oddsum = 0;
		int evensum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				oddsum += i;
			} else
				evensum += i;

		}
		System.out.println("홀수의 합 = " + oddsum);
		System.out.println("짝수의 합 = " + evensum);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하세요.");

		int k = sc.nextInt();
		oddsum = 0;
		evensum = 0;
		for (int i = 1; i <= k; i++) {
			if (i % 2 == 1) {
				oddsum += i;
			} else
				evensum += i;
		}
		System.out.println("입력받은 수 까지 홀수의 합 = " + oddsum);
		System.out.println("입력받은 수 까지 짝수의 합 = " + evensum);

		sc.close();
		
		
	}

}
