package euler2;

public class Euler2 {

	public static void main(String[] args) {
		int fib1 = 1;
		int fib2 = 1;
		int result = 0;
		while (fib1 + fib2 <= 4000000) {
			fib1 += fib2;
			if (fib1 % 2 == 0)
				result += fib1;
			if (fib1 + fib2 <= 4000000) {
				fib2 += fib1;
				if (fib2 % 2 == 0)
					result += fib2;
			}
		}
		System.out.println(result);
	}
}
