package Webinar.DoubtsWebinar3;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 05-Aug-2018
 */

public class TOH {

	public static void main(String[] args) {

		TOH(3, "S", "D", "T");

	}

	public static void TOH(int n, String s, String d, String t) {

		if (n == 0) {
			return;
		}
		TOH(n - 1, s, t, d);
		System.out.println("Move " + n + " disc from " + s + " to " + d);
		TOH(n - 1, t, d, s);
	}

}
