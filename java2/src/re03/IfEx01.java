package re03;

public class IfEx01 {
	public static void main(String[] args) {
		int a = 6;
		if(a>0) {
			System.out.println("크다");
			System.out.println("크다");
			System.out.println("크다");
		}
		
		if(a>0) {
			a+=4;
		}
		System.out.println(a);
		
		if(a<0) {
			a+=4;
			System.out.println(a);
		}
		System.out.println(a);
	}
}
