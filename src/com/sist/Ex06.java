package com.sist;

public class Ex06 {

	public static void main(String[] args) {

		int score = Integer.parseInt(args[0]);
		
		if(score >=90) {
			System.out.println("90 이상의 숫자입니다.");
		}else if(score>=80) {
			System.out.println("80~89의 숫자입니다.");
		}else if(score>=70) {
			System.out.println("70~79의 숫자입니다.");
		}else if(score>=60) {
			System.out.println("60~69의 숫자입니다.");
		}else {
			System.out.println("60 미만의 숫자입니다.");
		}
	}

}
