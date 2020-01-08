package com.sist;

import java.util.Scanner;

/*
 * 문제. 성적 처리 화면
 * 		이름, 국어, 영어, 수학, 자바 점수를 입력받기
 * 		scanner 클래스를 이용하여 키보드로 입력받고 
 * 		총점, 평균, 학점을 화면에 출력한다.
 */

public class Ex12 {

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
		
		if(avg>=90) {
			grade = "A";
		}else if(avg>=80) {
			grade = "B";
		}else if(avg>=70) {
			grade = "C";
		}else if(avg>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		if(avg>=60) {
			if(avg%10>=5) {
				plus = "+";
			} else {
				plus = "";
			}
		}
		System.out.println("학점 : " + grade + plus);
		sc.close();


	}

}
