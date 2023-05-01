package re02;

public class Ex08 {
	public static void main(String[] args) {
		System.out.println(10>0 ? 100 : -100);
		System.out.println(10<0 ? 'A' : "F");
		System.out.println(10>0 ? 10+10 : 10-10);
	
		int a = 10;
		System.out.println(a>0 ? "크다" : "작다");
		String result = a>0 ? "작다" : "없다";
		System.out.println(result);
		
		boolean result2 = a>5 ? true : false;
		System.out.println(result2);
		
		int age = 85;
		String result3 = (!(age>90)) ? "가" : "나";
		System.out.println(result3);
		
		int score = 85;
		// char grade = (score>90) ? 'A' : ((score>80) ? 'B' : 'C');
		char grade = (score<90) ? (score>80) ? 'B' : 'C' : 'A';
		System.out.println(score+"점은 "+grade+"등급입니다");
	}
}
