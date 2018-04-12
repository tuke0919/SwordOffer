package com.ketu.javapro;

/*
*
* 翻转链表
* 输入一个链表，反转链表后，输出链表的所有元素。
* */

public class Solution8 {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 翻转链表 保存前一个结点 和后一个结点
     *
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {

        if (head == null){
            return null;
        }

        ListNode pPrev = null;
        ListNode pNext = null;
        ListNode p = head;

        while (p != null){

            pNext = p.next;
            if (pNext == null){//最后一个结点
                p.next = pPrev;
                return p;
            }

            p.next = pPrev;
            pPrev = p;
            p = p.next;

        }

        return p;
    }

}
