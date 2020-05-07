package com.javaex.practice02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = 0, weight = 0 ;
		double shape = 0;
		
		System.out.println("키와 몸무게를 입력해주세요");
		System.out.print("키: ");
		height = sc.nextInt();
		System.out.print("몸무게: ");
		weight = sc.nextInt();
		
		shape=(height-100)*0.9;
	
		if(weight>shape) {
			System.out.println("과체중입니다\n표준체중: "+shape);
		}
		
		else if(weight<shape) {
			System.out.println("저체중입니다\n표준체중: "+shape);
		}
		
		else {
			System.out.println("표준체중입니다");
		}
		sc.close();
	}

}
