package DoubtsWebinar.DoubtsWebinar5;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 18-Aug-2018
 */

public class Kadane {

	public static void main(String[] args) {

		int[] arr = { 2, -3, 4, -1, -2, 1, 5, -3, -8, 6, 1 };

		System.out.println(maxSubarraySum(arr));

	}

	private static int maxSubarraySum(int[] arr) {

		int[] strg = new int[arr.length];

		if (arr[0] < 0) {
			strg[0] = 0;
		} else {
			strg[0] = arr[0];
		}

		for (int i = 1; i < arr.length; i++) {

			if (strg[i - 1] + arr[i] > arr[i]) {
				strg[i] = strg[i - 1] + arr[i];
			} else {
				strg[i] = arr[i];
			}

		}

		int max = 0;

		for (int val : strg) {
			if (val > max) {
				max = val;
			}
		}

		return max;

	}

}
