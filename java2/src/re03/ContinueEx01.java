package re03;

public class ContinueEx01 {
	public static void main(String[] args) {
		int a;
		for(a=1; a<=10; a++) {
			if(a == 3) {
				continue;
			}
			System.out.println(a);
		}
	}
}
