package LeeCode.linkedList;

public class Q141_hasCycleLikedList {

	/**
	 * 141. 环形链表  检测
	 * 
	 * 1.借助hash表解决问题
	 * 2.龟兔赛跑，总能相遇
	 * @param head
	 * @return
	 */
	public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(slow != fast){
        	if(fast == null || fast.next == null)return false;//如果存在空，就肯定不是环形
        	slow = slow.next;
        	fast = fast.next.next;
        }
        
		return true;
    }
}
