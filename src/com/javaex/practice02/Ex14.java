package com.javaex.practice02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float money = 0, tax = 0;
		System.out.print("수익을 입력해주세요\n금액: ");
		money = sc.nextInt();
		if(money>=0&&money<1000) {
			tax = (float)(0.09*money);
			System.out.println("소득세는 "+tax);
		}
		
		else if(money>1000&&money<=4000) {
			tax = (float)(0.09*1000+0.18*(money-1000));
			System.out.println("소득세는 "+tax);
		}
		
		else if(money>4000&&money<8000) {
			tax = (float)(0.09*1000+0.18*3000+0.27*(money-4000));
			System.out.println("소득세는 "+tax);
		}
		
		else if(money>=8000) {
			tax = (float)(0.09*1000+0.18*3000+0.27*4000+0.36*(money-8000));
			System.out.println("소득세는 "+tax);
		}
		
		else {
			System.out.println("잘못입력했습니다");
		}
		sc.close();
	}

}
