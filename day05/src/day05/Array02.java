package day05;

public class Array02 {
	public static void main(String[] args) {
		int nums[] = {1, 3, 5, 7, 9, 10, 12, 19, 900, 40};	// 배열은 중요하다
		System.out.println(nums.length);
		int total = nums.length;
		int sum = 0;
		for(int i=0; i<total; i++) {
			sum+=nums[i];
		}
		System.out.println(sum);
		System.out.println((double)sum/total);
		
		// for-each
		int sum2 = 0;
		for(int j : nums) {
			sum2+=j;
		}
		System.out.println(sum2);
		
		String fruits[] = new String[5]; // {"포도", "딸기", "사과", "오렌지", "키위"};
		fruits[0]="포도";
		fruits[1]="딸기";
		fruits[2]="사과";
		fruits[3]="오렌지";
		fruits[4]="키위";
		
		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
//		String fruit0 = "포도";
//		String fruit1 = "딸기";
//		String fruit2 = "사과";
//		String fruit3 = "오렌지";
//		String fruit4 = "키위";
//		System.out.println(fruit0);
//		System.out.println(fruit1);
//		System.out.println(fruit2);
//		System.out.println(fruit3);
//		System.out.println(fruit4);
		
		for(String fruit :  fruits) {	// : -> 포인터
			System.out.print(fruit+", ");
		}
		
		System.out.println();
		
		// 2차원 배열
		int intArray [][] = new int[2][3];	// 선언 같이
		intArray[0][0] = 1;
		intArray[0][1] = 2;
		intArray[0][2] = 3;
		
		intArray[1][0] = 100;
		intArray[1][1] = 200;
		intArray[1][2] = 300;
		
//		intArray[2][0] = 500;
//		intArray[2][1] = 700;
//		intArray[2][2] = 900;
		
//		System.out.println(intArray[2][2]);
		
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j]+",");
			}
		}
		
		System.out.println();
		
		String animals[] = {"강아지", "고양이", "사자", "호랑이"};
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		for(String animal : animals) {
			System.out.println(animal);
		}
		
		// 3의 배수만 출력
		int nums2[] = {23, 45, 67, 78, 56, 3, 9, 12, 85, 889889, 898, 909, 784387};
//		for(int i=0; i<nums2.length; i++) {
//			if(nums2[i]%3==0) {
//				System.out.print(nums2[i]+" ");
//			}
//		}
		for(int num : nums2) {
			if(num%3==0) {
				System.out.print(num+" ");
			}
		}
		
	}
}