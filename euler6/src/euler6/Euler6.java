package euler6;

public class Euler6 {

	public static void main(String[] args) {

		int b = 0;
		int c = 1;
		int d = 0;

		for (int a = 1; a <= 100; a++) {
			b += a;
		}
		b = b * b;
		for (int g = 1; g <= 100; g++) {
			d += c * g;
			c++;
		}
		System.out.println(b - d);

	}

}
