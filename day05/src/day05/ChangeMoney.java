package day05;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		// 32메가
		// 50000, 10000, 5000, 1000, 500, 100, 50, 10
		System.out.println("얼마를 바꿀건가요? 금액을 입력하시고 앤터 치세요");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt(); 		// nextInt(); -> 정수를 입력 받는다
		System.out.println("오만원 "+money/50000+"장");
		money = money%50000;
		System.out.println("만원 "+money/10000+"장");
		money = money%10000;
		System.out.println("오천원 "+money/5000+"장");
		money = money%5000;
		System.out.println("천원 "+money/1000+"장");
		money = money%1000;
		System.out.println("오백원 "+money/500+"장");
		money = money%500;
		System.out.println("백원 "+money/100+"장");
		money = money%100;
		System.out.println("오십원 "+money/50+"장");
		money = money%50;
		System.out.println("십원 "+money/10+"장");
		scanner.close();
	}
}
