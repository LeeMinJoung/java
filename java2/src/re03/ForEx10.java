package re03;

public class ForEx10 {
	public static void main(String[] args) {
		for(int a=1; a<=100; a++) {
			if(a%5==0) {
				break;
			}
			System.out.println(a);
		}
		System.out.println("hello");
	}
}
