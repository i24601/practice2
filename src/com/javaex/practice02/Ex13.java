package com.javaex.practice02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, result = 0;
		System.out.print("숫자를 입력해 주세요\n숫자: ");
		num = sc.nextInt();
		if(num<=0) {
			result = num*num*num-9*num+2;
		}
		else {
			result = 7*num+2;
		}
		sc.close();
		System.out.println("계산결과는 "+(float)result+"입니다");
	}

}
