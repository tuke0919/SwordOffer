package com.ketu.javapro;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
/*
* 从尾到头打印链表
*
* 题目描述
* 输入一个链表，从尾到头打印链表每个节点的值
*
* */



public class Solution2 {


    public class ListNode {
             int val;
             ListNode next = null;

             ListNode(int val) {
                this.val = val;
             }
    }


    public static void main(String[] args){




    }

    /**
     * 使用栈
     *
     * @param listNode  链表头
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> mStack = new Stack<>();
        ArrayList<Integer> mList = new ArrayList<>();

        if (listNode != null){

            while (listNode.next != null){
                mStack.push(listNode.val);
                listNode = listNode.next;
            }

            mStack.push(listNode.val);

            while (!mStack.isEmpty()){
                Integer val = mStack.pop();
                mList.add(val);
            }
        }


        return mList;
    }


    /**
     * 递归方法
     *
     * @param listNode
     * @return
     */

    public ArrayList<Integer> mList = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {

        if (listNode != null){

            printListFromTailToHead1(listNode.next);
            mList.add(listNode.val);
        }
        return mList;
    }





}
