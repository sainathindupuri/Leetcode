package leet;

import java.util.ArrayList;
import java.util.List;

public class IsSymmetric {

	List<Integer> list1 = new ArrayList<>();
	List<Integer> list2 = new ArrayList<>();

	public boolean isSymmetric(TreeNode root) {
		inOrder1(root.left);
		inOrder2(root.right);
		int i = 0;
		if (list1.size() != list2.size())
			return false;
		while (i < list1.size()) {
			if (list1.get(i) != list2.get(i))
				return false;
			i++;
		}
		return true;
	}

	private void inOrder1(TreeNode node) {
		if (node == null)
			return;
		inOrder1(node.left);
		list1.add(node.val);
		inOrder1(node.right);
	}

	private void inOrder2(TreeNode node) {
		if (node == null)
			return;
		inOrder1(node.right);
		list2.add(node.val);
		inOrder1(node.left);
	}

}
