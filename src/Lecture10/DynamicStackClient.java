package Lecture10;

import Lecture10.StackUsingArrays;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArrays stack = new DynamicStack(5);

		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
			stack.display();
		}
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.display();
		System.out.println(stack.top());

		while (!stack.isEmpty()) {
			stack.display();
			stack.pop();
		}
		// stack.pop();

		int[] arr = { 50, 35, 10, 45, 60, 47, 30, 37, 80 };
		int[] ans = stockSpan(arr);

		for (int val : ans) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	// Assignments
	public static int[] stockSpan(int[] prices) throws Exception {

		int[] span = new int[prices.length];

		DynamicStack stack = new DynamicStack();

		for (int i = 0; i < prices.length; i++) {

			while (!stack.isEmpty() && prices[stack.top()] < prices[i]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - stack.top();
			}

			stack.push(i);

		}

		return span;

	}

}
