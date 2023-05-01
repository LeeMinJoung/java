package re02;

public class Ex07 {
	public static void main(String[] args) {
//		System.out.println(true&&true);
//		System.out.println(true&&false);
//		System.out.println(true&&false&&true);
//		System.out.println(false&&false);
		
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(true||false||true);
		System.out.println(false||false);
		
		int a = 10;
		int b = 5;
		boolean result = (a>0) && (a>100);
		System.out.println(result);
		
		boolean result2 = (a>0) || (a>100);
		System.out.println(!result2);
		System.out.println(result2);
		
		System.out.println(a>7 && b<=5);
		System.out.println((a%3==2)||(b%2!=1));
		
		
	}
}
