package com.ketu.javapro;

/*
*
* 树的层次遍历
*
* 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
*
* */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution12 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }


    /**
     * 二叉树的层次遍历 用队列
     *
     * @param root
     * @return
     */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> mList= new ArrayList<>();

        if (root == null){
            return mList;
        }

        Queue<TreeNode> mQueue = new LinkedList<>();
        mQueue.offer(root);

        while (!mQueue.isEmpty()){

            TreeNode mNode = mQueue.poll();
            mList.add(mNode.val);

            if (mNode.left != null){
                mQueue.offer(mNode.left);
            }

            if (mNode.right != null){
                mQueue.offer(mNode.right);
            }

        }

        return mList;



    }
}
