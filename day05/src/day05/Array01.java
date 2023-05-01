package day05;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		// ArrayList / Map
		// 순서 매기기
		// 인덱스 : 0부터 시작, 인덱스에 해당하는 데이터가 있다
		// 예시) class01[0]="정진영"; class01[1]="이민정";
		
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		int max=0;
		System.out.println("양수 5개를 입력해주세요.");
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt();	// nextInt(); -> 정수를 입력 받는다
			// System.out.println(intArray[i]);
			if(intArray[i] > max) {
				max = intArray[i];
			}
		}
		System.out.println("입력한 숫자중에 가장 큰 숫자는 "+max+"입니다.");
		scanner.close();
	}
}
