package euler12;

public class Euler12 {

	public static void main(String[] args) {
		int d = 0;
		int f = 0;
		int[] n = new int[20000000];

		for (int a = 1; a < 20000000; a++) {
			for (int b = 1; b <= a; b++) {
				n[d] += b;
			}
			for (int c = 1; c <= n[d]; c++) {
				if (n[d] % c == 0)
					f++;
				if (f == 500) {
					System.out.println(f);
					System.out.println(n[d]);
				}
			}
			f = 0;
			d++;
		}
	}
}
