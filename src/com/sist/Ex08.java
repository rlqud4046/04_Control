package com.sist;

public class Ex08 {

	public static void main(String[] args) {

		// 주사위에 숫자중 하나를 임의로 받는다
		// 형식) int(Math.random()*개수 )+시작값
		// 로또 int(Math.random()*45)+1
		int num = (int) (Math.random() * 6) + 1;

		if (num == 1) {
			System.out.println("1번이 나왔습니다");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다");
		} else {
			System.out.println("6번이 나왔습니다");
		}

	}

}
