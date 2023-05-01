package re03;

public class WhileEx04 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i<=5) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		// 1 ~ 100까지의 합
		int sum1 = 0;
		int a = 1;
		while(a<=100) {
			sum1+=a;
			a++;
		}
		System.out.println(sum1);
	}
}
