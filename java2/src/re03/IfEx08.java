package re03;

public class IfEx08 {
	public static void main(String[] args) {
		int score = 85;
		String grade;
		if(score>90) {
			if(score>=95) {
				grade="A+";
			}else {
			grade="A";
			}
		}else {
			if(score>=85) {
				grade="B+";
			}else {
				grade="B";
			}
		}
		System.out.println("학점 : "+grade);
	}
}