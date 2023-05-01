package re03;

public class ContinueEx02 {
	public static void main(String[] args) {
		// 짝수만 출력
		for(int a=1; a<=10; a++) {
			if(a%2!=0) {
				continue;
			}
			System.out.print(a+" ");
		}
		
		System.out.println("");
		
		//홀수만 출력
		for(int a=1; a<=10; a++) {
			if(a%2==0) {
				continue;
			}
			System.out.print(a+" ");
		}
	
	}
}
