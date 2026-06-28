package bst.invertBinaryTree.brute;

import java.util.LinkedList;
import java.util.Queue;

import bst.TreeNode;

class InvertBinaryTree {

    public static TreeNode InvertBinaryTreeF(TreeNode root) {

        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }

        return root;
    }
}
