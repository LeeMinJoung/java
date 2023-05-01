package day05;

public class Score {
	public static void main(String[] args) {
		// 4년 학점 평균 구해보기
		double scoreList[][] = {{2.49, 2.38}, {2.34, 3.5}, {3.87, 2.88}, {4.1, 3.9}}; // 선언과 동시에 입력
		System.out.println("scoreList.length = "+scoreList.length);
		System.out.println("scoreList[1].length = "+scoreList[1].length);
		double sum = 0;
		for(int year=0; year<scoreList.length; year++) {
			for(int term=0; term<scoreList[year].length; term++) {
				sum+=scoreList[year][term];
			}
		}
		System.out.println(sum / (scoreList.length*scoreList[0].length));
	}
}
