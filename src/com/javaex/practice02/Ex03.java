package com.javaex.practice02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.println("\"1번그룹\"");
		}
		else {
			System.out.println("\"2번그룹\"");
		}
		System.out.println("입니다");
		sc.close();
	}
}
//예상 21이상 입력시 1번그룹 그 외는 전부 2번그룹 출력 println때문에 입니다가 아랫줄에서 출력
//15 19 20 2번그룹 21 100 1번그룹