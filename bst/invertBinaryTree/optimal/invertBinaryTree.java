package bst.invertBinaryTree.optimal;

import bst.TreeNode;

class InvertBinaryTree {

    public static TreeNode InvertBinaryTreeF(TreeNode root) {

        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = InvertBinaryTreeF(root.right);
        root.right = InvertBinaryTreeF(temp);

        return root;
    }
}
