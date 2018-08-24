package DoubtsWebinar.DoubtsWebinar3;

import java.util.Arrays;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 05-Aug-2018
 */

public class PairOfRoses {

	public static void main(String[] args) {

		int[] arr = { 10, 2, 6, 8, 4 };

		int target = 10;

		Arrays.sort(arr);

		int left = 0;
		int right = arr.length - 1;

		int lans = 0;
		int rans = 0;

		while (left < right) {

			int sum = arr[left] + arr[right];

			if (sum > target) {
				right--;
			} else if (sum < target) {
				left++;
			} else {
				lans = left;
				rans = right;
				left++;
				right--;
			}

		}

		System.out.println(arr[lans] + " and " + arr[rans]);

	}

}
