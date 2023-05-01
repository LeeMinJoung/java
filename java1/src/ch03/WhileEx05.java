package ch03;

public class WhileEx05 {
	public static void main(String[] args) {
		// 100까지 출력
		int a = 1;
		while(a<=100) {
			System.out.println(a);
			a++;
		}
		System.out.println("-----------------");
		
		// 100까지 홀수 출력
		int b = 1;
		while(b<=100) {
			System.out.println(b);
			b+=2;
		}
		System.out.println("-----------------");
		
		// 100까지 짝수 출력
		int c = 2;
		while(c<=100){
			System.out.println(c);
			c+=2;
		}
	}
}
