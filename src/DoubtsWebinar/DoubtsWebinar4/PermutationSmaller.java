package DoubtsWebinar.DoubtsWebinar4;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 12-Aug-2018
 */

public class PermutationSmaller {

	public static void main(String[] args) {

		printPermutation("cbda", "", "cbda");
	}

	public static void printPermutation(String ques, String ans, String oques) {

		if (ques.length() == 0) {

			if (ans.compareTo(oques) < 0) {
				System.out.println(ans);
			}
			return;
		}

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);

			printPermutation(roq, ans + ch, oques);
		}
	}

}
