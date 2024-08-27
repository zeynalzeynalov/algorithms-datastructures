package com.zeynal.app;

/*

 Leetcode coding task: https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/description/

 Given a binary tree root, return the maximum sum of all keys of any sub-tree which is also a Binary Search Tree (BST).

 Assume a BST is defined as follows:

 The left subtree of a node contains only nodes with keys less than the node's key.
 The right subtree of a node contains only nodes with keys greater than the node's key.
 Both the left and right subtrees must also be binary search trees.

*/
class MaximumSumBstInBinaryTreeSolution {
    int max;

    public int maxSumBST(TreeNode root) {
        max = 0;
        findMaxSum(root);
        return max;
    }

    public Pack findMaxSum(TreeNode node) {
        if (node == null) return new Pack(true, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);

        Pack left = findMaxSum(node.left);
        Pack right = findMaxSum(node.right);

        boolean isBST = left.isBST && right.isBST && node.val > left.largest && node.val < right.smallest;
        int sum = node.val + left.sum + right.sum;
        if (isBST) max = Math.max(max, sum);

        return new Pack(isBST, Math.max(node.val, right.largest), Math.min(node.val, left.smallest), sum);
    }

    private static class Pack {
        public boolean isBST;
        public int largest;
        public int smallest;
        public int sum;

        Pack(boolean isBST, int largest, int smallest, int sum) {
            this.isBST = isBST;
            this.largest = largest;
            this.smallest = smallest;
            this.sum = sum;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
