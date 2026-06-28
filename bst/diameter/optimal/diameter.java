package bst.diameter.optimal;

import bst.TreeNode;

class DiameterOfBinaryTree {

    private static int diameter;

    public static int DiameterOfBinaryTreeF(TreeNode root) {

        diameter = 0;
        height(root);
        return diameter;
    }

    private static int height(TreeNode root) {

        if (root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }
}
