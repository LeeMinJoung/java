package ch03;

public class TestIf03 {
	public static void main(String[] args) {
			int kor = 93; 
			int eng = 90;
			int mat = 85;
			int sum = kor+eng+mat;
			double avg = sum / 3;
			String grade;
			if(100>=avg && avg>=90) {
				grade = "A";
			} else if(89>=avg && avg>=80) {
				grade = "B";
			} else if(79>=avg && avg>=70) {
				grade = "C";
			} else if(69>=avg && avg>=60) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.println("국어 점수는 "+kor+"점입니다.");
			System.out.println("영어 점수는 "+eng+"점입니다.");
			System.out.println("수학 점수는 "+mat+"점입니다.");
			System.out.println("총점은 "+sum+" 입니다.");
			System.out.println("학점은 "+grade+"입니다.");
	}
}
