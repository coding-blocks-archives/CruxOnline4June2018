package DoubtsWebinar.DoubtsWebinar3;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 05-Aug-2018
 */

public class KeypadCodes {

	public static void main(String[] args) {

		keyPad("134", "");
	}

	public static String code(char ch) {

		if (ch == '1') {
			return "abc";
		} else if (ch == '2') {
			return "def";
		} else if (ch == '3') {
			return "gh";
		} else if (ch == '4') {
			return "ijkl";
		} else {
			return "";
		}
	}

	public static void keyPad(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		String code = code(ch);

		for (int i = 0; i < code.length(); i++) {
			keyPad(ros, ans + code.charAt(i));
		}

	}

}
