package com.sist;

import java.util.Scanner;

//키보드로 이름, 나이, 주소를 입력 받기

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("주소를 입력하세요 : ");
		String address = sc.next();

		// 입력 받은 내용을 화면에 출력해 보자

		System.out.println("이름 ==> " + name);
		System.out.println("나이 ==> " + age);
		System.out.println("주소 ==> " + address);
		// scanner로 입력받은 경우 공백 뒤는 인식하지 못한다.
		sc.close();

	}

}
