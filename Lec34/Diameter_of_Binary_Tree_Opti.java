package Lec34;

public class Diameter_of_Binary_Tree_Opti {
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
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).d;
		}

		public DiaPair diameter(TreeNode root) {
			if (root == null) {
				return new DiaPair();
			}

			DiaPair ldp = diameter(root.left);
			DiaPair rdp = diameter(root.right);
			DiaPair sdp = new DiaPair();
			int sd = ldp.h + rdp.h + 2;
			sdp.h = Math.max(ldp.h, rdp.h) + 1;
			sdp.d = Math.max(sd, Math.max(ldp.d, rdp.d));
			return sdp;
		}

		class DiaPair {
			int d = 0;
			int h = -1;
		}
	}
}
