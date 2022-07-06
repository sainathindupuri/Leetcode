package leet;

import java.util.Arrays;

public class BinaryTreeFromInorderPreorder {

	public static void main(String[] args) {
		BinaryTreeFromInorderPreorder obj = new BinaryTreeFromInorderPreorder();
		int[] preorder = { 3, 9, 20, 15, 7 };
		int[] inorder = { 9, 3, 15, 20, 7 };
		obj.buildTree(preorder, inorder);

	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int root = preorder[0];
		return null;
	}

}
