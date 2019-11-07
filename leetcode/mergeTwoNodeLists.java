/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 
 https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
class Solution {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(null == l1 ) return l2;
        if(null == l2 ) return l1;
        
        ListNode head =  new ListNode(-99);
        ListNode prev =  head;
        while(l1 != null && l2 != null){
                if(l1.val <= l2.val){
                    prev.next = l1;
                    l1 = l1.next;
                }else{
                    prev.next = l2;
                    l2 = l2.next;
                }
               prev = prev.next;
        }
        
        prev.next = l1 == null ? l2 : l1;
        
        return head.next;
        
    }
}