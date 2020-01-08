package com.sist;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("직급을 입력하세요 : ");

		String position = sc.next();

		System.out.print(position + " 급여는 : ");
		switch (position) {
		case "사장":
			System.out.println("1,000만원 입니다.");
			break;
		case "전무":
			System.out.println("700만원 입니다.");
			break;
		case "부장":
			System.out.println("600만원 입니다.");
			break;
		case "차장":
			System.out.println("500만원 입니다.");
			break;
		case "과장":
			System.out.println("400만원 입니다.");
			break;
		case "대리":
			System.out.println("300만원 입니다.");
			break;
		case "사원":
			System.out.println("200만원 입니다.");
			break;
		}
		sc.close();

	}

}
