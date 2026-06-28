package bst.kthSmallestInBst.optimal;

import java.util.Stack;

import bst.TreeNode;

class KthSmallestInBST {

    public static int KthSmallestInBSTF(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();

            if (--k == 0) return root.val;

            root = root.right;
        }

        return -1;
    }
}
