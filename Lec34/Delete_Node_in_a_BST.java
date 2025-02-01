package Lec34;

public class Delete_Node_in_a_BST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode deleteNode(TreeNode root, int key) {
			if (root == null) {
				return null;
			}
			if (root.val < key) {
				root.right = deleteNode(root.right, key);
			} else if (root.val > key) {
				root.left = deleteNode(root.left, key);
			} else {
				// 1 child or 0 child
				if (root.left == null) {
					return root.right;
				} else if (root.right == null) {
					return root.left;
				} else {// both child
					int m = max(root.left);// 9
					root.left = deleteNode(root.left, m);
					root.val = m;
				}
			}
			return root;
		}

		public int max(TreeNode root) {
			if (root == null) {
				return Integer.MIN_VALUE;
			}
			int r = max(root.right);
			return Math.max(r, root.val);
		}
	}
}
