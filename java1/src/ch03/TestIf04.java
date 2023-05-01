package ch03;

public class TestIf04 {
	public static void main(String[] args) {
		int kor = 93; 
		int eng = 90;
		int mat = 101;
		
		if (kor<=100 && eng<=100 && mat<=100) {
			System.out.println("국어 점수는 "+kor+"점입니다.");
			System.out.println("영어 점수는 "+eng+"점입니다.");
			System.out.println("수학 점수는 "+mat+"점입니다.");
		}else if(kor>100 || eng>100 || mat>100) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println("다시 입력해주세요.");
		}
	}
}
