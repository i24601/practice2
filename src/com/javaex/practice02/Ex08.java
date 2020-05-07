package com.javaex.practice02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		int min = 0;
		System.out.println("숫자3개를 입력해주세요");
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		System.out.print("숫자3: ");
		num3 = sc.nextInt();
		
		if(num1>num2) {
			min=num2;
		}
		else {
			min=num1;
		}
		
		if(num2>num3) {
			min = num3;
		}
		System.out.println("최소값은 "+min);
		sc.close();
	}

}
