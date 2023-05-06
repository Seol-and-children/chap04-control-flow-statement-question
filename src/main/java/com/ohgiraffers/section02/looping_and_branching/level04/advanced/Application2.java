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

		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] moneyCount = new int[money.length];

		for(int i = 0; i < money.length; i ++){
			moneyCount[i] = change / money[i];
			change %= money[i];

			if( moneyCount[i] > 0 ){
				if( money[i] >= 1000) {
					System.out.println(money[i] + "원권 지폐 : " + moneyCount[i] + "장");
				} else System.out.println(money[i] + "원권 동전 :" + moneyCount[i] + "개");
			}
		}
	}

}
