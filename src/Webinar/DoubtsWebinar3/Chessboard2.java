package Webinar.DoubtsWebinar3;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 05-Aug-2018
 */

public class Chessboard2 {

	public static void main(String[] args) {

		int n = 4;

		boolean[] arr = makePrimesArray(n * n);

		int[] mnp = makePortMines(arr);

		chess2(0, 0, n - 1, "", mnp);
	}

	public static void chess2(int cr, int cc, int n, String asf, int[] mnp) {

		if (cr == n && cc == n) {
			System.out.println(asf + "{" + n + "-" + n + "}");
			return;
		}

		if (cr > n || cc > n) {
			return;
		}

		int val = ((n + 1) * cr) + (cc + 1);

		// mine
		if (mnp[val] == 1) {
			return;
		}
		// port
		else if (mnp[val] == 2) {
			chess2(n, n, n, asf + "{" + cr + "-" + cc + "}P", mnp);
		}

		// knights
		chess2(cr + 1, cc + 2, n, asf + "{" + cr + "-" + cc + "}K", mnp);
		chess2(cr + 2, cc + 1, n, asf + "{" + cr + "-" + cc + "}K", mnp);

		// rook
		if (cr == 0 || cr == n || cc == 0 || cc == n) {

			// horizontal
			for (int col = 1; col <= n; col++) {
				chess2(cr, cc + col, n, asf + "{" + cr + "-" + cc + "}R", mnp);
			}

			// vertical
			for (int row = 1; row <= n; row++) {
				chess2(cr + row, cc, n, asf + "{" + cr + "-" + cc + "}R", mnp);
			}

		}

		// bishop
		if (cr == cc || cr + cc == n) {
			for (int diag = 1; diag <= n; diag++) {
				chess2(cr + diag, cc + diag, n, asf + "{" + cr + "-" + cc + "}B", mnp);
			}
		}

	}

	public static boolean[] makePrimesArray(int n) {

		boolean[] primes = new boolean[n];

		for (int i = 2; i < primes.length; i++) {

			int divisor = 2;
			boolean flag = true;

			while (divisor <= i - 1) {

				if (i % divisor == 0) {
					flag = false;
				}

				divisor = divisor + 1;
			}

			if (flag == true) {
				primes[i] = true;
			} else {
				primes[i] = false;
			}

		}

		return primes;

	}

	public static int[] makePortMines(boolean[] primes) {

		int[] mnp = new int[primes.length];

		int count = 1;

		for (int i = 0; i < primes.length; i++) {

			if (primes[i]) {

				if (count % 2 == 0) {
					mnp[i] = 2;
				} else {
					mnp[i] = 1;
				}

				count++;
			}

		}

		return mnp;
	}

}
