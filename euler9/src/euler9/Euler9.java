package euler9;

public class Euler9 {

	public static void main(String[] args) {
		int range = 1000;
		int c;
		for (int a = 1; a <= range / 3; a++) {
			for (int b = 1; b <= range / 2; b++) {
				c = range - a - b;
				if (a * a + b * b == c * c) {
					System.out.println(a + " " + " " + b + " " + c);
					System.out.println(a * b * c);
				}
			}
		}
	}
}
