
package euler10;

import java.util.Arrays;

public class Euler10 {
	public static void main(String[] args) {
		int range = 2500000;
		int d = 0;
		int[] trueprime = new int[range];
		boolean[] prime = new boolean[range];
		long sum = 0;
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (int a = 2; a <= Math.sqrt(range); a++) {
			for (int b = a + a; b < range; b = b + a)
				prime[b] = false;
		}
		for (int c = 0; c < range; c++) {
			if (prime[c]) {
				trueprime[d] += c;
				d++;
			}
		}
		System.out.println(trueprime[10000]);
		for (int x = 0; trueprime[x] <= 2000000; x++) {
			sum += trueprime[x];
		}
		System.out.println(sum);

	}
}
