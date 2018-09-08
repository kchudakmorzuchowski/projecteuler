package euler1;

public class Euler1 {

	public static void main(String[] args) {
		int b = 0;
		int d = 0;
		for (int a = 0; a <= 995; a += 5) {
			System.out.println(a);
			if (a % 3 != 0)
				b += a;
			System.out.println(b);
		}
		;
		for (int c = 0; c <= 999; c += 3) {
			System.out.println(c);
			d += c;
			System.out.println(d);
		}
		;
		System.out.println(b + d);

	}
}