package com.sist;

/* 
 * break 명령어
 * 	현재의 제어문을 빠져나가는 명령어
 * 	보통 switch~case 문과 반복문에서 사용된다.
 * 	if문을 제외한 첫번쨰 블럭에서 빠져나오는 명령어이다.
 */
public class Ex26 {

	public static void main(String[] args) {

		// 반복문에서 break 예제
		for (int i = 1; i <= 100; i++) {
			if (i > 10) {
				break;
			}
			System.out.println("i ==>" + i);
		}
		System.out.println();

		// 합이 100이되는 순간의 합과 그 떄까지의 숫자를 화면에 출력해 보세요.
		int sum = 0;
		for (int i = 1;; i++) {
			sum += i;
			System.out.println(i);
			if (sum >= 100)
				break;
		}
		System.out.println("합" + sum);

	}

}
