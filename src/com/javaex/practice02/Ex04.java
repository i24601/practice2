package com.javaex.practice02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		byte age = 1;
		
		do {
		System.out.print("나이를 입력해주세요 0 입력시 종료\n나이: ");
		if(sc.hasNextByte()) {
			age = sc.nextByte();
			if(age>=19&&age<65) {
				System.out.println("\n1번그룹입니다\n");
			}
			else if(age!=0) {
				System.out.println("\n2번그룹입니다\n");
			}
		}
		else {
			sc.next();
			System.out.println("\n잘못된 입력입니다\n");
		}
		}while(age!=0);
		sc.close();
		System.out.println("종료");
	}
}
