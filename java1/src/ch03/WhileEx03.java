package ch03;

public class WhileEx03 {
	public static void main(String[] args) {
//		// 구구단
		int dan, num;
		for(dan=2; dan<10; dan++) {
			for(num=1; num<10; num++) {
				System.out.println(dan+"x"+num+"="+(dan*num));
			}
		}
		
		System.out.println("----------------");
		
		// while문으로 구구단
		int a = 2;
		while(a<=9) {
			int b = 1;	// 초기식의 위치는 반드시 조건식의 위에 위치
			while(b<=9) {
				System.out.println(a+"x"+b+"="+(a*b));
				b++;
			}
			a++;
		}
	}
}
