package com.ketu.javapro;

/*
*
* 合并两个 排序的链表
*
* 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
*
* */


import sun.util.resources.cldr.mas.CurrencyNames_mas;

public class Solution9 {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 递归，合并
     *
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1,ListNode list2) {

        if (list1 == null){
            return null;
        }

        if (list2 == null){
            return null;
        }

        ListNode head = null;

        if (list1.val < list2.val){

            head = list1;
            head.next = Merge(list1.next ,list2);

        }else {

            head = list2;
            head.next = Merge(list1 , list2.next);

        }

        return  head;

    }

    /**
     * 非递归
     *
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge1(ListNode list1,ListNode list2) {

        if (list1 == null){
            return list2;
        }

        if (list2 == null){
            return list1;
        }

        ListNode current = new ListNode(-1);
        ListNode root = current;

        while (list1 != null && list2 != null){
            if (list1.val >= list2.val){

                current.next = list1;
                current = list1;
                list1 = list1.next;

            }else {
                current.next = list2;
                current = list2;
                list2 = list2.next;

            }
        }

        if (list1 != null){
            current.next = list1;
        }
        if (list2 != null){
            current.next = list2;
        }
        return root.next;

    }

}
