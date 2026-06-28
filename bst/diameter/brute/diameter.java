package bst.diameter.brute;

import bst.TreeNode;

class DiameterOfBinaryTree {

    public static int DiameterOfBinaryTreeF(TreeNode root) {

        if (root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        int curr = left + right;

        int leftDia = DiameterOfBinaryTreeF(root.left);
        int rightDia = DiameterOfBinaryTreeF(root.right);

        return Math.max(curr, Math.max(leftDia, rightDia));
    }

    private static int height(TreeNode root) {

        if (root == null) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }
}
