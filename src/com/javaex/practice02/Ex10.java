package com.javaex.practice02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int remain = 0;
		
		System.out.print("정수를 입력해주세요\n정수: ");
		num = sc.nextInt();
		
		remain=num%3;
		switch(remain)
		{
		case 0 : System.out.println("A팀"); break;
		case 1 : System.out.println("B팀"); break;
		case 2 : System.out.println("C팀"); break;
		default : System.out.println("잘못입력하셨습니다"); break;
		}
		sc.close();
	}

}
