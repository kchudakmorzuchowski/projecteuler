package euler4;

public class Euler4 {

	public static void main(String[] args) {
		int[] p = { 0, 0, 0, 0, 0, 0 };
		int[] palindrom = new int[999];
		int n = 0;
		for (int a = 1; a <= 9; a++) {
			p[0] = a * 100000;
			p[5] = a * 1;
			palindrom[n] += (p[0] + p[1] + p[2] + p[3] + p[4] + p[5]);
			n++;
			for (int b = 0; b <= 9; b++) {
				p[1] = b * 10000;
				p[4] = b * 10;
				palindrom[n] += (p[0] + p[1] + p[2] + p[3] + p[4] + p[5]);
				n++;
				for (int c = 0; c <= 9; c++) {
					p[2] = c * 1000;
					p[3] = c * 100;
					palindrom[n] += (p[0] + p[1] + p[2] + p[3] + p[4] + p[5]);
					n++;
				}
			}
		}
		int multipli[] = new int[810000];
		int m = 0;
		for (int d = 100; d <= 999; d++) {
			for (int f = 100; f <= 999; f++) {
				multipli[m] += d * f;
				m++;
			}
		}
		int x = 809999;
		int z = 998;
		while (x >= 0) {
			while (z >= 0) {
				if (multipli[x] == palindrom[z] && palindrom[z] >= 900009) {
					System.out.println(palindrom[z]);
					break;
				} else
					z--;
			}
			x--;
			z = 998;
		}

	}

}
