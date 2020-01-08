package com.sist;

/*
 * 
 */

public class Ex19 {

	public static void main(String[] args) {

		// while 반복문으로 1~10까지의 합을 출력해 보자.
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);

		System.out.println();

		// 문제 1~100까지의 홀수의 합과 짝수의 합을 구하세요.

		int num = 1;
		int sum1 = 0; // 짝수 합 누적시킬 변수
		int sum2 = 0; // 홀수 합 누적시킬 변수

		while (num <= 100) {
			if (num % 2 == 0) {
				sum1 += num;
				num++;
			} else {
				sum2 += num;
				num++;
			}
			//num++; if와  else 안의 증감식을 밖으로 빼주어 한번만 쓰면 더 깔끔

		}
		System.out.println("짝수의 합 = " + sum1);
		System.out.println("홀수의 합 = " + sum2);

	}

}
