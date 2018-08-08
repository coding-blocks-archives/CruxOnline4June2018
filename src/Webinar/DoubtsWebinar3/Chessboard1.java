package Webinar.DoubtsWebinar3;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 05-Aug-2018
 */

public class Chessboard1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		System.out.println(chesscount1(0, 0, n - 1, ""));
		chess1(0, 0, n - 1, "");
	}

	public static void chess1(int cr, int cc, int n, String asf) {

		if (cr == n && cc == n) {
			System.out.print(asf + "{" + n + "-" + n + "}" + " ");
			return;
		}

		if (cr > n || cc > n) {
			return;
		}

		// knights
		chess1(cr + 2, cc + 1, n, asf + "{" + cr + "-" + cc + "}K");
		chess1(cr + 1, cc + 2, n, asf + "{" + cr + "-" + cc + "}K");

		// rook
		if (cr == 0 || cr == n || cc == 0 || cc == n) {

			// horizontal
			for (int col = 1; col <= n; col++) {
				chess1(cr, cc + col, n, asf + "{" + cr + "-" + cc + "}R");
			}

			// vertical
			for (int row = 1; row <= n; row++) {
				chess1(cr + row, cc, n, asf + "{" + cr + "-" + cc + "}R");
			}

		}

		// bishop
		if (cr == cc || cr + cc == n) {
			for (int diag = 1; diag <= n; diag++) {
				chess1(cr + diag, cc + diag, n, asf + "{" + cr + "-" + cc + "}B");
			}
		}

	}

	public static int chesscount1(int cr, int cc, int n, String asf) {

		if (cr == n && cc == n) {
			return 1;
		}

		if (cr > n || cc > n) {
			return 0;
		}

		int count = 0;

		// knights
		count += chesscount1(cr + 1, cc + 2, n, asf + "{" + cr + "-" + cc + "}K");
		count += chesscount1(cr + 2, cc + 1, n, asf + "{" + cr + "-" + cc + "}K");

		// rook
		if (cr == 0 || cr == n || cc == 0 || cc == n) {

			// horizontal
			for (int col = 1; col <= n; col++) {
				count += chesscount1(cr, cc + col, n, asf + "{" + cr + "-" + cc + "}R");
			}

			// vertical
			for (int row = 1; row <= n; row++) {
				count += chesscount1(cr + row, cc, n, asf + "{" + cr + "-" + cc + "}R");
			}

		}

		// bishop
		if (cr == cc || cr + cc == n) {
			for (int diag = 1; diag <= n; diag++) {
				count += chesscount1(cr + diag, cc + diag, n, asf + "{" + cr + "-" + cc + "}B");
			}
		}

		return count;
	}

}
