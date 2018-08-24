package DoubtsWebinar.DoubtsWebinar4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 12-Aug-2018
 */

public class ConsecutiveChar {

	public static void main(String[] args) {

		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };

		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			int val = arr[i];

			int vm1 = val - 1;
			if (map.containsKey(vm1)) {
				map.put(val, false);
			} else {
				map.put(val, true);
			}

			int vp1 = val + 1;

			if (map.containsKey(vp1)) {
				map.put(vp1, false);
			}
		}

		int starting = 0;
		int maxcount = 0;

		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		for (Integer key : keys) {

			if (map.get(key)) {

				int count = 0;

				while (map.containsKey(key + count)) {
					count++;
				}

				if (count > maxcount) {
					maxcount = count;
					starting = key;
				}

			}

		}

		for (int i = 0; i < maxcount; i++) {
			System.out.println(starting + i);
		}

	}

}
