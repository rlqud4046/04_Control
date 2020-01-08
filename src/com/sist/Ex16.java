package com.sist;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요.");
		String name = sc.next();
		System.out.print("국어 점수를 입력하세요.");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요.");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요.");
		int mat = sc.nextInt();
		System.out.print("자바 점수를 입력하세요.");
		int jav = sc.nextInt();

		int tot = kor + eng + mat + jav;
		float avg = tot / 4.0f;

		String grade = null;

		String plus = null;

		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("자바 : " + jav);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);

		switch ((int) avg / 10) {

		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;

		}

		if (avg % 10 >= 5) {
			plus = "+";
		} else {
			plus = "";
		}
		System.out.println("학점 : " + grade + plus);
		sc.close();

	}

}
