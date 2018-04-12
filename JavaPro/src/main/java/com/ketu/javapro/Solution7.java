package com.ketu.javapro;

/*
* 链表中倒数第k个结点
* 输入一个链表，输出该链表中倒数第k个结点。
* */

public class Solution7 {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    /**
     * 先走k步
     *
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode head,int k) {

        if (head == null || k == 0){
            return null;
        }

        ListNode p1 = new ListNode(0);
        ListNode p2 = new ListNode(1);

        p1 = p2 = head;
        //先走k步
        for (int i = 1 ; i < k ;i++){
            if (p1.next != null){
                p1 = p1.next;
            }else {
                return  null;
            }

        }
        while (p1.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }

}
