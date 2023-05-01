package test;

public class Test09 {
	public static void main(String[] args) {
		int a,b;
//		for(a=0; a<5; a++) {
//			for(b=0; b<a; b++){
//				System.out.print(" ");
//			}
//			for(b=0; b<9-(a*2); b++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		for(a=5; a>0; a--) {			// 줄 반복
			for(b=5-a; b>0; b--) {		// 공백 없음으로 시작
				System.out.print(" ");
			}
			for(b=a*2-1; b>0; b--) {
				System.out.print("*");	// a=5로 시작, *이 9개로
			}
			System.out.println();
		}
	}
}
