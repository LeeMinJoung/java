package re03;

public class ForEx07 {
	public static void main(String[] args) {
		int a, b;
		for(a=1; a<=5; a++) {
			for(b=1; b<=5; b++) {
				System.out.println(a+"//"+b);
			}
		}
		
		System.out.println("---------------");
		
		// 구구단
		int dan, num;
		for(dan=2; dan<=9; dan++) {
			for(num=1; num<=9; num++) {
				System.out.println(dan+"x"+num+"="+(dan*num));
			}
			System.out.println("----------");
		}
	}
}
