package re03;

public class IfEx10 {
	public static void main(String[] args) {
		int score = 97;
		String result = "";
		
		if(score>=90) {
			if(score>=95) {
				result="A+";
			}else {
				result="A";
			}
		}
		System.out.println(result);
	}
}
