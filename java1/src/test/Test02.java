package test;

public class Test02 {
	public static void main(String[] args) {
		int a, b;
		for(a=1; a<=5; a++) {	// b가 a보다 작거나 같을 때까지 반복
			for(b=1; b<=a; b++) {
				System.out.print("*");	// ln : 줄바꿈
			}
			System.out.println();		// b가 끝나고 줄바꿈
		}
	}
}