package euler3;

public class Euler3 {

	public static void main(String[] args) {
		long a = 600851475143l;
		int total = 1;
		while (a != 0) {
			if (a % total == 0) {
				a /= total;
				if (a / total == 0) {
					System.out.println(total);
					break;
				}
				total = 1;
			}
			total++;
		}
	}
}