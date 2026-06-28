package bst.kthSmallestInBst.brute;

import java.util.ArrayList;

import bst.TreeNode;

class KthSmallestInBST {

    public static int KthSmallestInBSTF(TreeNode root, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);

        return list.get(k - 1);
    }

    private static void inorder(TreeNode root, ArrayList<Integer> list) {

        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
