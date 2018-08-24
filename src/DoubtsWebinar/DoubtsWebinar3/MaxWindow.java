package DoubtsWebinar.DoubtsWebinar3;

import java.util.LinkedList;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 12-Aug-2018
 */

public class MaxWindow {

	public static void main(String[] args) {

		int[] arr = { 2, 5, -1, 7, -3, -1, -2 };

		int k = 3;

		LinkedList<Integer> queue = new LinkedList<>();
		for (int i = 0; i < k; i++) {

			while (!queue.isEmpty() && arr[queue.getLast()] < arr[i]) {
				queue.removeLast();
			}

			queue.addLast(i);
		}

		for (int i = k; i < arr.length; i++) {

			System.out.println(arr[queue.getFirst()]);

			// remove the useless elements which are out of this window
			while (!queue.isEmpty() && queue.getFirst() <= i - k) {
				queue.removeFirst();
			}

			// remove the elements which are smaller
			while (!queue.isEmpty() && arr[queue.getLast()] < arr[i]) {
				queue.removeLast();
			}

			queue.addLast(i);

		}

		System.out.println(arr[queue.getFirst()]);

	}

}
