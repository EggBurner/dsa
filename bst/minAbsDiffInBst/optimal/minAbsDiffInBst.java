package bst.minAbsDiffInBst.optimal;

import bst.TreeNode;

class MinAbsDiffInBST {

    private static Integer prev;
    private static int min;

    public static int MinAbsDiffInBSTF(TreeNode root) {

        prev = null;
        min = Integer.MAX_VALUE;

        inorder(root);

        return min;
    }

    private static void inorder(TreeNode root) {

        if (root == null) return;

        inorder(root.left);

        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }

        prev = root.val;

        inorder(root.right);
    }
}
