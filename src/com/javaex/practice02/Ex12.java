package com.javaex.practice02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		char cal;
		
		System.out.print("기호: ");
		cal = sc.next().charAt(0);
		if(cal=='+'||cal=='-'||cal=='*'||cal=='/')
		{
			System.out.print("숫자1 :");
			num1 = sc.nextInt();
			System.out.print("숫자2 :");
			num2 = sc.nextInt();
			
			if(cal=='/'&&num2==0) {
				cal=' ';
			}
			switch(cal) {
			case '+' : System.out.printf("%d %c %d = %d",num1, cal, num2, num1+num2); break;
			case '-' : System.out.printf("%d %c %d = %d",num1, cal, num2, num1-num2); break;
			case '*' : System.out.printf("%d %c %d = %.1f",num1, cal, num2, (float)num1*num2); break;
			case '/' : System.out.printf("%d %c %d = %.1f",num1, cal, num2, (float)num1/num2); break;
			default : System.out.println("오류: 분모가 0"); break;
			}
		}
		else {
			System.out.println("잘못된입력입니다");
		}
		sc.close();
	}

}
