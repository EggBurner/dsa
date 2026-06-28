package bst.minAbsDiffInBst.brute;

import java.util.ArrayList;

import bst.TreeNode;

class MinAbsDiffInBST {

    public static int MinAbsDiffInBSTF(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                min = Math.min(min, Math.abs(list.get(i) - list.get(j)));
            }
        }

        return min;
    }

    private static void inorder(TreeNode root, ArrayList<Integer> list) {

        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
