package com.ohgiraffers.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("받은 금액을 입력하세요 :");
		int amount = sc.nextInt();

		System.out.print("상품 가격을 입력하세요 :");
		int price = sc.nextInt();

		int change = amount - price;
		int om = 0;
		int m = 0;
		int oc = 0;
		int c = 0;
		int ob = 0;
		int b = 0;
		int os = 0;
		int s = 0;


		while ( change > 0) {
			if( change >= 50000 ) {
				change = change - 50000;
				om++;
			} else if ( change >= 10000) {
				change = change - 10000;
				m++;
			} else if ( change >= 5000) {
				change = change - 5000;
				oc++;
			} else if ( change >= 1000) {
				change = change - 1000;
				c++;
			} else if ( change >= 500) {
				change = change - 500;
				ob++;
			} else if ( change >= 100) {
				change = change - 100;
				b++;
			} else if ( change >= 50) {
				change = change - 50;
				os++;
			} else if ( change >= 10) {
				change = change - 10;
				s++;
			} else break;
		}
		System.out.println("==================");
		System.out.println("50000권 지폐 :" + om + "장");
		System.out.println("10000권 지폐:" + m + "장");
		System.out.println("5000권 지폐 :" + oc + "장");
		System.out.println("1000권 지폐 :" + c + "장");
		System.out.println("500권 동전 :" + ob + "개");
		System.out.println("100권 동전 :" + b + "개");
		System.out.println("50권 동전 :" + os + "개");
		System.out.println("10권 동전 :" + s + "개");
		System.out.println("==================");
		System.out.println("거스름돈 :" + (amount - price) + "원");
		/* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
		 * 
		 * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
		 * 지폐외 동전을 구분하여 단위를 표기하세요
		 * 
		 * -- 입력 예시 --
		 * 받으신 금액을 입력하세요 : 100000
		 * 상품 가격을 입력하세요 : 22340
		 * 
		 * -- 출력 예시 --
		 * ============================
		 * 50000원권 지폐 1장
		 * 10000원권 지폐 2장
		 * 5000원권 지폐 1장
		 * 1000원권 지폐 2장
		 * 500원권 동전 1개
		 * 100원권 동전 1개
		 * 50원권 동전 1개
		 * 10원권 동전 1개
		 * ============================
		 * 거스름돈 : 77660원
		 * */

	}

}
