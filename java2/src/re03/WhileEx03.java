package re03;

public class WhileEx03 {
	public static void main(String[] args) {
		// 구구단
		int dan, num;
		for(dan=2; dan<10; dan++) {
			for(num=1; num<10; num++) {
				System.out.println(dan+"x"+num+"="+(dan*num));
			}
		}
		
		System.out.println("----------------");
		
		int a = 2;
		while(a<=9) {
			int b = 1;
			while(b<=9) {
				System.out.println(a+"x"+b+"="+(a*b));
				b++;
			}
			a++;
		}
	}
}
