package bst.maxDepth.optimal;

import bst.TreeNode;

class MaxDepth {

    public static int MaxDepthF(TreeNode root) {

        if (root == null) return 0;

        return 1 + Math.max(MaxDepthF(root.left), MaxDepthF(root.right));
    }
}
