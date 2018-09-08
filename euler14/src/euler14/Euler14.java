package euler14;

public class Euler14 {

	public static void main(String[] args) {

		long s = 0l;
		long lar = 0l;
		long result = 0l;
		long n1 = 0l;

		for (long n = 2l; n <= 1000000l; n++) {
			n1 = n;
			while (n1 != 1l) {
				if (n1 % 2 == 0) {
					n1 /= 2;
					s++;
				} else {
					n1 = 3 * n1 + 1;
					s++;
				}
			}
			if (lar < s) {
				lar = s;
				result = n;
			}
			s = 0l;
		}
		System.out.println(lar);
		System.out.println(result);
	}

}
