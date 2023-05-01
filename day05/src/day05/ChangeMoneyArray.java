package day05;

public class ChangeMoneyArray {
	public static void main(String[] args) {
		int units [] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int money = 1876540;
		for(int i=0; i<units.length; i++) {
			System.out.println(units[i]+"원 "+money/units[i]+"장");
			money = money%units[i];
		}
	}
}
