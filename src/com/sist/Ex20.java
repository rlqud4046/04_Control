package com.sist;

import java.util.Scanner;

/*
 * 키보드로 입력받은 수 까지 홀수의 합과 짝수의 합을 구해보자.
 */

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		int max = sc.nextInt();

		int i = 1;
		int oddsum = 0;
		int evensum = 0;
		while (i <= max) {
			if (i % 2 == 1) {
				oddsum += i;
			} else {
				evensum += i;
			}
			i++;
		}

		System.out.println("홀수의 합은 = " + oddsum);
		System.out.println("짝수의 합은 = " + evensum);
		sc.close();

		System.out.println();

		// 반복문에서 무한루프를 돌리는 방법

		int a = 1;
		int suma = 0;
		while (true) {
			suma += a;
			a++;
			if (a > 10)
				break; // 반복문 탈출
		}
		System.out.println("합 = " + suma);

	}

}
