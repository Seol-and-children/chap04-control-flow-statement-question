package com.ohgiraffers.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
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
		Scanner sc = new Scanner(System.in);
		System.out.print("받으신 금액을 입력하세요 :");
		int money = sc.nextInt();
		System.out.print("상품 가격을 입력하세요 :");
		int price = sc.nextInt();
		int change = money - price;
		int cnt = change;
		for(int i = 0; i<8;i++){
			int num=0;
			switch (i) {
				case 0 :
					num = change/50000;
					change = change - num*50000;
					System.out.println("50000원권 지폐 "+ num +"장");
					break;
				case 1 :
					num = change/10000;
					change = change - num*10000;
					System.out.println("1000원권 지폐 "+ num +"장");
					break;
				case 2 :
					num = change/5000;
					change = change - num*5000;
					System.out.println("5000원권 지폐 "+ num +"장");
					break;
				case 3 :
					num = change/1000;
					change = change - num*1000;
					System.out.println("1000원권 지폐 "+ num +"장");
					break;
				case 4 :
					num = change/500;
					change = change - num*500;
					System.out.println("500원권 동전 "+ num +"개");
					break;
				case 5 :
					num = change/100;
					change = change - num*100;
					System.out.println("100원권 동전 "+ num +"개");
					break;
				case 6 :
					num = change/50;
					change = change - num*50;
					System.out.println("50원권 동전 "+ num +"개");
					break;
				case 7 :
					num = change/10;
					change = change - num*10;
					System.out.println("10원권 동전 "+ num +"개");
					break;
				// default:
			}
		}
		System.out.print("거스름돈 : " + cnt);
	}

}
