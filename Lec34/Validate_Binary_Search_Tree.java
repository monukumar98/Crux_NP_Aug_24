package Lec34;

public class Validate_Binary_Search_Tree {
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
		public boolean isValidBST(TreeNode root) {
			return ValidBST(root).isbst;
		}

		public BstPair ValidBST(TreeNode root) {
			if (root == null) {
				return new BstPair();
			}
			BstPair lbp = ValidBST(root.left);// (isbst, min, max)
			BstPair rbp = ValidBST(root.right);// (isbst, min, max)
			BstPair sbp = new BstPair();
			sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
			sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
			sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
			return sbp;

		}

		class BstPair {
			boolean isbst = true;
			long min = Long.MAX_VALUE;
			long max = Long.MIN_VALUE;

		}

	}
}
