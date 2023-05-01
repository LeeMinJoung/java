package ch03;

public class SwitchEx01 {
	public static void main(String[] args) {
		// Switch문 - 변수의 값을 가지고 평가한다
		// 결과 값을 int, String 타입을 사용한다
		// {} 블럭만 영역이다, : ; -> 영역아님
//		int a = 10;
//		switch(a) {
//			case 50 :
//				System.out.println("50");
//			case 30:
//				System.out.println("30");
//			case 10 :
//				System.out.println("10");
//		}
		
		int num = 6;
		switch(num) {					// 해당 case부터 밑에 있는 모든 실행문을 실행
			case 1 :
				System.out.println(1);
			case 2 :
				System.out.println(2);
			case 3 :
				System.out.println(3);
			default :					// 만족되는 값이 없으면 default로 간다
				System.out.println(0);
			case 4 :
				System.out.println(4);
		}
		
	}
}
