package ch03;

public class ForEx09 {
	public static void main(String[] args) {
		// 반복문 속 조건문 <-> 조건문 속 반복문
		for(int a=1; a<=10; a++) {
			// for문의 조건식이 true일 때 실행
			if(a%2==0) {
				// if문의 조건식이 true일 때 실행
				System.out.println(a+" : 짝수");
			}else {
				// if문의 조건식이 false일 때 실행
				System.out.println(a+" : 홀수");
			}	// if문 종료
		}	// for문 종료
		
		
		/*
	 	나머지 연산 : 나누고 난 후 남는 값
	 	10 % 2 = 0		: 남는 값 없음
	 	10 % 3 = 1
	 	10 % 4 = 2
	 	10 % 20 = 10	: 나눌 수가 없기때문에 10은 나눠지지않고 남아있다
	   */
		
	}
}
