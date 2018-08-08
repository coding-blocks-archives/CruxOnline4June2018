package Lecture12;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true
		// 85 false false true 60 false false
		// BinaryTree tree = new BinaryTree();
		// tree.display();
		//
		// System.out.println("Height of tree is " + tree.height());
		// tree.preOrder();
		// tree.postOrder();
		// tree.inOrder();
		// tree.levelOrder();

		int[] pre = { 10, 20, 40, 50, 60, 70, 30 };
		int[] in = { 40, 20, 60, 50, 70, 10, 30 };

		BinaryTree bt = new BinaryTree(pre, in);

		bt.display();
	}

}
