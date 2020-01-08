package com.sist;

/*
 * 학생 성적 처리
 * 이름, 국어, 영어, 수학, 자바 점수릴 입력 받아서
 * 총점, 평균, 학점을 출력해 보자
 */
public class Ex07 {

	public static void main(String[] args) {

		String name = args[0];
		int kor = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int mat = Integer.parseInt(args[3]);
		int jav = Integer.parseInt(args[4]);

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
	}

}
