package com.javaex.practice02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();

		if (num1 > num2) {
			if (num1 % num2 == 0) {
				System.out.printf("%d는 %d의 약수입니다", num2, num1);
			} else {
				System.out.printf("%d는 %d의 약수가 아닙니다",num2, num1);
			}
		} else {
			if (num2 % num1 == 0) {
				System.out.printf("%d는 %d의 약수입니다", num1, num2);
			}
			else {
				System.out.printf("%d는 %d의 약수가 아닙니다",num1, num2);

			}
			}
			
		sc.close();
	}

}
