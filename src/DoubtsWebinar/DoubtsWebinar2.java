package DoubtsWebinar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 19-Jul-2018
 */

public class DoubtsWebinar2 {

	public static void main(String[] args) {
		// Fib(5);
		// int[] arr = { 1, 2, 3, 3, 4, 5 };
		//
		// splitArray(arr, 0, 0, "", 0, "");
		// int[] one = { 10, 2, 3, 5, 6, 8, 10, 11 };
		// int[] two = { 10, 10, 10, 4, 4, 3, 3, 3, 5 };
		//
		// for (int val : intersection(one, two)) {
		// System.out.println(val);
		// }

		// sum();

		// int[] arr = { 9, 5, 3, 1, 22, 67, 66, 68 };
		//
		// formBiggestNumber(arr);
		// for (int val : arr) {
		// System.out.print(val);
		// }

		// codesOfString("1125", "");

		// lexicoCounting(0, 1000);
		System.out.println(validInvalid());
	}

	public static void Fib(int n) {

		int a = 0;
		int b = 1;
		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {

				System.out.print(a + "\t");

				int sum = a + b;
				a = b;
				b = sum;
			}

			System.out.println();
		}
	}

	public static void splitArray(int[] arr, int vidx, int p1sum, String p1asf, int p2sum, String p2asf) {

		if (vidx == arr.length) {
			if (p1sum == p2sum) {
				System.out.println(p1asf + " and " + p2asf);
			}

			return;
		}

		splitArray(arr, vidx + 1, p1sum + arr[vidx], p1asf + " " + arr[vidx], p2sum, p2asf);
		splitArray(arr, vidx + 1, p1sum, p1asf, p2sum + arr[vidx], p2asf + " " + arr[vidx]);
	}

	public static ArrayList<Integer> intersection(int[] a1, int[] a2) {

		Arrays.sort(a1);
		Arrays.sort(a2);

		ArrayList<Integer> ans = new ArrayList<>();

		int i = 0;
		int j = 0;

		while (i < a1.length && j < a2.length) {

			if (a1[i] < a2[j]) {
				i++;
			} else if (a1[i] > a2[j]) {
				j++;
			} else {
				ans.add(a1[i]);
				i++;
				j++;
			}
		}

		return ans;

	}

	public static void sum() {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int to = scn.nextInt();

		int co = 0;

		while (co < to) {

			int x = scn.nextInt();

			int[] res = new int[arr.length];

			for (int i = 0; i < arr.length; i++) {

				int ni = i - x;

				if (ni < 0) {
					ni = ni + arr.length;
				}
				res[i] = arr[i] + arr[ni];

			}

			arr = res;

			co++;
		}

		int sum = 0;
		for (int val : arr) {
			sum = sum + val;
		}

		System.out.println(sum % 1000000009);

	}

	public static void formBiggestNumber(int[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - 1 - counter; j++) {

				if (compare(arr[j], arr[j + 1]) > 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	// +ve -> swap , -ve -> doesnot swap
	// 8 , 9
	// 9 , 8
	public static int compare(int n1, int n2) {

		String val1 = n1 + "" + n2; // 89 // 98
		String val2 = n2 + "" + n1; // 98 // 89

		int v1 = Integer.valueOf(val1);
		int v2 = Integer.valueOf(val2);

		if (v1 < v2) {
			return 1;
		} else {
			return 0;
		}

	}

	public static void codesOfString(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		String ch1 = str.substring(0, 1);
		String ros1 = str.substring(1);

		codesOfString(ros1, ans + correspondingChar(ch1));

		if (str.length() >= 2) {

			String ch2 = str.substring(0, 2);
			String ros2 = str.substring(2);

			if (Integer.valueOf(ch2) <= 26)
				codesOfString(ros2, ans + correspondingChar(ch2));
		}

	}

	public static char correspondingChar(String ch) {

		int val = Integer.valueOf(ch);
		return (char) (val + 96);

	}

	public static void lexicoCounting(int curr, int end) {

		if (curr > end) {
			return;
		}

		System.out.println(curr);

		int i = 0;
		if (curr == 0) {
			i = 1;
		}

		for (; i <= 9; i++) {
			lexicoCounting(curr * 10 + i, end);
		}
	}

	public static boolean validInvalid() {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		boolean gd = true;
		int prev = scn.nextInt();

		for (int i = 1; i <= n - 1; i++) {

			int curr = scn.nextInt();

			if (gd) {
				if (curr < prev) {
					// ok
				} else {
					gd = false;
				}

			} else {

				if (curr > prev) {
					// ok
				} else {
					return false;
				}

			}

			prev = curr;

		}

		return true;

	}

}
