package re03;

public class SwitchEx07 {
	public static void main(String[] args) {
//		int score;
//		String grade = "B";
//		switch(grade) {
//			case "A":
//				score = 100;
//			case "B":
//				score = 80;
//			break;
//			default:
//				score = 60;
//		}
//		System.out.println("score 는 : "+score);
		
		int score = 85;
		String grade = "";
		switch(score) {
			case 100:
				grade = "A";
			break;
			case 80:
				grade = "B";
			break;
			default:
				grade = "C";
			case 60:
				grade = "D";
			break;
		}
		System.out.println("grade 는 : "+grade);
	}
}
