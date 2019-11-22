package LeeCode.linkedList;

import LeeCode.linkedList.Q19_linkedList.ListNode;

/**
 * 206. 反转链表
 * @author msht
 *
 */
public class Q206_revertLinkedList {

	public ListNode reverseList(ListNode head) {
		ListNode newHead = null;//新起个空链表，反转
		ListNode node;//临时存储结点
		while(head != null){//将当前next指针 指向前一个元素
			//对之前链表做头删除
			node = head;
			head = head.next;
			
			//2.对新链表做头插
			node.next = newHead;//反向指向上个结点
			newHead = node;//对新链表赋值
		}

        return newHead;
    }
	
	/**
	 * 使用递归思想来反转
	 * 1个问题可以分解多个子问题解
	 * 
	 * @param head
	 * @return
	 */
	public ListNode reverseList2(ListNode head){
		if(head == null || head.next == null) return head;//第二个结点进行反转处理
		
		ListNode p = reverseList2(head.next);
		
		head.next.next = head;//反转结点
		
		head.next = null;//删除原结点
		
		return p;
	} 
	
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
