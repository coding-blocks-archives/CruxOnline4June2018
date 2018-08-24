package DoubtsWebinar.DoubtsWebinar4;

import java.util.HashMap;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 12-Aug-2018
 */

public class ExtractCharacters {

	public static void main(String[] args) {

		HashMap<Character, Boolean> map = new HashMap<>();

		String str = "himanshu";

		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), true);
		}

		for (Character key : map.keySet()) {
			System.out.print(key + " ");
		}

	}

}
