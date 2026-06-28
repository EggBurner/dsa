package bst.variableBst.brute;

import java.util.ArrayList;

import bst.TreeNode;

class ValidateBST {

    public static boolean ValidateBSTF(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }

        return true;
    }

    private static void inorder(TreeNode root, ArrayList<Integer> list) {

        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
