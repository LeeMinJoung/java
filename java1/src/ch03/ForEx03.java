package ch03;

public class ForEx03 {
	public static void main(String[] args) {
		// 1~100까지 홀수만 출력하는 코드
		// 증감식에 대입 연산자 사용
		int a;
//		for(a=1; a<=100; a+=2) {
//			System.out.println(a);
//		}
		
		// 1~100까지 짝수만 출력하는 코드
		for(a=2; a<=100; a+=2) {	// a = a+2
			System.out.println(a);
		}
	}
}
