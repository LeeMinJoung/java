package ch03;

public class WhileEx04 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;		// 초기식
		while(i<=5) {	// 조건식
			sum+=i;
			i++;		// 증감식
		}
		System.out.println(sum);
		
		// 1~100까지의 합
		int sum1 = 0;
		int a = 1;		// 초기식
		while(a<=100) {	// 조건식
			sum1+=a;
			a++;		// 증감식
		}
		System.out.println(sum1);
	}
}
