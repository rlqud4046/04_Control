package com.sist;

// Ex 10번 문제를 switch~case 문으로 바꿔보기
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("***메뉴를 선택하세요***");
		System.out.println("1. 피자");
		System.out.println("2, 돈까스");
		System.out.println("3. 제육볶음");
		System.out.println("4. 김치찌개");
		System.out.println("5. 자장면");
		System.out.print("위 메뉴 중 하나를 선택하세요. : ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("피자 선택");
			break;
		case 2:
			System.out.println("돈까스 선택");
			break;
		case 3:
			System.out.println("제육볶음 선택");
			break;
		case 4:
			System.out.println("김치찌개 선택");
			break;
		case 5:
			System.out.println("자장면 선택");
			break;

		default:
			System.out.println("선택하신 메뉴는 없는 메뉴입니다.");

		}

		System.out.print("이름을 입력하세요");
		String name = sc.next();
		System.out.println(name + "님 환영합니다.");

		sc.close();

	}

}
