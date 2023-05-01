package ch03;

public class ForEx07 {
	public static void main(String[] args) {
		// for문 속 for문
//		int a;
//		int b;
//		for(a=1; a<=5; a++) {
//			for(b=1; b<=5; b++) {
//				System.out.println(a+"//"+b);
//			}
//		}
		
		// 구구단
		// dan, num
		int dan;
		int num;
		for(dan=2; dan<10; dan++) {		// 2~9단
			for(num=1; num<=9; num++) {	// 1~9
				System.out.println(dan+"x"+num+"="+(dan*num));
										// () : 수학에서 연산 우선순위 가장 높다
			}
			System.out.println("-------");
		}
	}
}
