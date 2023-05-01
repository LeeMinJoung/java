package re03;

public class SwitchEx05 {
	public static void main(String[] args) {
		char grade = '0';
		switch(grade) {
			case 'A':
			case 'a':
			case '0':
				System.out.println("최고 등급입니다.");
			case 'B':
			case 'b':
				System.out.println("중간 등급입니다.");
			break;
			default:
				System.out.println("최저 등급입니다.");
		}
	}
}
