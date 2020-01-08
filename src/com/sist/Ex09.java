package com.sist;

import javax.swing.JOptionPane;

/*
 * 키보드로 데이터를 입력받는 방법에는 총 네가지 방법이 있다
 * 	1. main(String[] args)을 이용하는 방법
 * 	2. JOptionPane 클래스를 이용하는 방법(GUI 방식)
 *  3. scanner 클래스를 이용하는 방법
 *  4. 파일 입출력을 이용하는 방법
 */
public class Ex09 {

	public static void main(String[] args) {
//GUI 방식으로 데이터를 입력 받자
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		// 이름을 입력하세요라는 창이 뜨고 입력하면 그 값이 name에 저장됨
		int kor = Integer.parseInt(JOptionPane.showInputDialog("국어점수 입력"));
		int eng = Integer.parseInt(JOptionPane.showInputDialog("영어점수 입력"));
		int mat = Integer.parseInt(JOptionPane.showInputDialog("수학점수 입력"));
		int jav = Integer.parseInt(JOptionPane.showInputDialog("자바점수 입력"));
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

		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		if (avg >= 60) {
			if (avg % 10 >= 5) {
				plus = "+";
			} else {
				plus = "";
			}
		}
		System.out.println("학점 : " + grade + plus);
	}

}
