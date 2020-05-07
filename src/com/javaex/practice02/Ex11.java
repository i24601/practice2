package com.javaex.practice02;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char Alph = 0;
		
		System.out.print("알파벳 1글자를 입력해주세요\n알파벳: ");
		Alph = sc.next().charAt(0);
		
		switch(Alph)
		{
		case 'a' :
		case 'e' : 
		case 'i' : 
		case 'o' :
		case 'u' : System.out.println("모음입니다"); break;
		default : System.out.println("자음입니다"); break;
		}
		sc.close();
	}
}
