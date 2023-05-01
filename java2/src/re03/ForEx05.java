package re03;

public class ForEx05 {
	public static void main(String[] args) {
		// 100까지 홀수의 합
		int sum = 0;
		int i;
		for(i=1; i<=100; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
		
		System.out.println("-----------");
		
		// 100까지 짝수의 합
		int sum1 = 0;
		int a;
		for(a=2; a<=100; a+=2) {
			sum1+=a;
		}
		System.out.println(sum1);
	}
}
