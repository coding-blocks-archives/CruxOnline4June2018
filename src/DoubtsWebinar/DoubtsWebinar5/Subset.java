package DoubtsWebinar.DoubtsWebinar5;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 18-Aug-2018
 */

public class Subset {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(subsetSum(arr, 100));

	}

	public static boolean subsetSum(int[] arr, int target) {

		boolean[][] strg = new boolean[arr.length + 1][target + 1];

		for (int row = 0; row < strg.length; row++) {
			strg[row][0] = true;
		}

		for (int row = 1; row < strg.length; row++) {

			for (int col = 1; col < strg[0].length; col++) {

				boolean include = false;

				if (col >= arr[row - 1]) {
					include = strg[row - 1][col - arr[row - 1]];
				}

				boolean exclude = strg[row - 1][col];

				strg[row][col] = include || exclude;

			}
		}

		return strg[strg.length - 1][strg[0].length - 1];

	}

}
