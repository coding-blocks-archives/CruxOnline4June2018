package DoubtsWebinar;

import java.util.Arrays;
import java.util.Scanner;

public class DoubtsWebinar1 {

	public static void main(String[] args) {

		// char ch = 'b';
		// // int num = ch;
		// System.out.println((int) ch);

		Scanner scn = new Scanner(System.in);
		// char ch = scn.nextLine().charAt(0);
		// System.out.println(ch);

		// int n = scn.nextInt();
		//
		// scn.nextLine();
		//
		// String s1 = scn.nextLine();
		// String s2 = scn.nextLine();
		//
		// System.out.println(n);
		// System.out.println(s1);
		// System.out.println(s2);

		int[] a = { 3, 2, 18, 9 };
		Arrays.sort(a);

		for (int val : a) {
			System.out.print(val + " ");
		}

		System.out.println();
		pascal(5);

		int val = (int) Math.pow(2, 5);
		System.out.println(val);
	}

	public static void pascal(int n) {

		for (int row = 0; row < n; row++) {

			int val = 1;

			for (int col = 0; col <= row; col++) {

				System.out.print(val + " ");
				val = (val * (row - col)) / (col + 1);
			}

			System.out.println();
		}
	}

}
