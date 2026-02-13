// Last updated: 2/13/2026, 9:46:28 AM
class Solution {
    public void fun(TreeNode root_left, TreeNode root_right, int level) {
        if (root_left == null || root_right == null)
            return;
        if (level % 2 != 0) {
            int t = root_left.val;
            root_left.val = root_right.val;
            root_right.val = t;
        }
        fun(root_left.left, root_right.right, level + 1);
        fun(root_left.right, root_right.left, level + 1);
    }

    public TreeNode reverseOddLevels(TreeNode root) {
        fun(root.left, root.right, 1);
        return root;
    }
}
