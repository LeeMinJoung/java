package ch03;

public class ForEx04 {
	public static void main(String[] args) {
		int sum = 0;
		sum = sum+1;	// sum+=1	1
		sum = sum+2;	// sum+=2	3
		sum = sum+3; 	//			6
		sum = sum+4;	//			10
		sum = sum+5;	//			15
		System.out.println("0~5까지의 합 : "+sum);
		
		System.out.println("----------------------");
		
		// 0~5까지의 합
		int sum1 = 0;
		int i;
		for(i=1; i<=5; i++) {
			sum1+=i;
		}
		System.out.println(sum1);
		
		System.out.println("----------------------");
		
		// 1~5까지의 합
		int sum2 = 1;
		int a;
		for(a=2; a<=5; a++) {
			sum2+=a;
		}
		System.out.println(sum2);
		
		System.out.println("----------------------");
		
		// 1~100까지의 합
		int sum3 = 0;
		int b;
		for(b=1; b<101; b++) {
			sum3+=b;
		}
		System.out.println(sum3);
	}
}
