/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (subRoot == null) {
            return true;
        }
        if (isSametree(root, subRoot)) {
            return true;
        }
        return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
    }
    public boolean isSametree(TreeNode p, TreeNode q) {
        boolean same = true;
        if (p == null && q == null) {
            return same;
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p.val == q.val) {
            same = same && isSametree(p.left, q.left) && isSametree(p.right, q.right);
        } else {
            return false;
        }
        return same;
    }
}
