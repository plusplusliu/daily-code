package oj;

public class Solution {
    public ListNode deleteDuplicates(ListNode head){
        if(null == head||null == head.next){
            return head;
        }
        ListNode cur1 = head;
        ListNode cur2 = head.next;
        while (null!= cur2){
            if (cur1.val != cur2.val){
                cur1 = cur2;
                cur2 = cur2.next;
            }else {
                while (cur1.val == cur2.val){
                    cur2 = cur2.next;
                    if (null == cur2){
                        cur1.next =null;
                        return head;
                    }
                }
                cur1.next = cur2;
                cur1 = cur2;
                cur2.next = cur2;

            }
        }
        return head;
    }
}
