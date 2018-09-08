package euler5;

public class Euler5 {

	public static void main(String[] args) {
		int total = 20;
		int b = 20;
		while (b >= 1) {
			if (total % b == 0) {
				b--;
			}
			if (b == 1) {
				System.out.println(total);
				break;
			}
			if (total % b != 0) {
				total += 20;
				b = 20;
			}
		}
	}
}
