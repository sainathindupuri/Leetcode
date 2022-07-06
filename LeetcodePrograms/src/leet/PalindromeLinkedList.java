package leet;

import java.util.Stack;

import leet.ListNode;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode node) {
		boolean flag = true;
		Stack<Integer> stack = new Stack<>();
		ListNode  dup = node;
		while(dup != null) {
			stack.push(dup.val);
			dup=dup.next;
		}
		while(!stack.isEmpty()) {
			if(stack.pop() != node.val)
				return false;
			node = node.next;
		}
		return false;
		
	}

}
