package Lec34;

import Lec34.Validate_Binary_Search_Tree.TreeNode;
import Lec34.Validate_Binary_Search_Tree.Solution.BstPair;

public class Maximum_Sum_BST_in_Binary_Tree {
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
		public int maxSumBST(TreeNode root) {
			return ValidBST(root).ans;
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
			sbp.sum = lbp.sum + rbp.sum + root.val;// complete tree ka sum
			sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
			if (sbp.isbst == true) {
				sbp.ans = Math.max(sbp.sum, Math.max(lbp.ans, rbp.ans));// bst wala part ka sum
			} else {
				sbp.ans = Math.max(lbp.ans, rbp.ans);
			}
			return sbp;

		}

		class BstPair {
			boolean isbst = true;
			long min = Long.MAX_VALUE;
			long max = Long.MIN_VALUE;
			int sum = 0;
			int ans = 0;

		}

	}
}
