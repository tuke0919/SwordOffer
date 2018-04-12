package com.ketu.javapro;

/*
*
* 二叉树的镜像
*
* 操作给定的二叉树，将其变换为源二叉树的镜像。
*
* */


import java.util.Stack;

public class Solution10 {


    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    /**
     * 递归 镜像
     *
     * @param root
     */
    public void Mirror(TreeNode root) {

           if (root == null){
               return;
           }

           TreeNode temp = root.left;
           root.left = root.right;
           root.right = temp;


           if (root.left != null){
               Mirror(root.left);
           }
           if (root.right != null){
               Mirror(root.right);
           }

    }
    /**
     * 非递归 镜像
     *
     * @param root
     */
    public void Mirror1(TreeNode root) {

        if (root == null){
            return;
        }

        Stack<TreeNode> mStack = new Stack<>();

        mStack.push(root);

        while (!mStack.isEmpty()){
            TreeNode current = mStack.pop();

            if (current.left != null || current.right != null){

                TreeNode temp = current.left;
                current.left = current.right;
                current.right = temp;

            }
            if (current.left != null){

                mStack.push(current.left);

            }
            if (current.right != null){

                mStack.push(current.right);

            }
        }
    }



}
