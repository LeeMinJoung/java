package ch03;

public class IfEx08 {	// 흐름을 이해하는 것이 중요
	public static void main(String[] args) {
		// if문 속 if문
		int score = 85;
		String grade;
		if(score > 90) {	// 블록안에서는 모든 문법이 사용 가능하다
			if(score >= 95) {
				grade="A+";
			}else {
				grade="A";
			}
		}else {
			if(score >= 85) {
				grade="B+";
			}else {
				grade="B";
			}
		}
		System.out.println("학점 : "+grade);
	}
}
