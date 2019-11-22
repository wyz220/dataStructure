package LeeCode.linkedList;
/**
 19. 删除链表的倒数第N个节点
 @author msht
**/

public class Q19_linkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);
		head.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		head5.next = null;
		ListNode removeNthFromEnd = removeNthFromEnd(head,2);
		System.out.println(removeNthFromEnd);
	}
	/**
	 * 删除链表的倒数第N个节点
	 * @param head
	 * @param n
	 * @return
	 */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n<0) return null;
        
        ListNode p = head;
        ListNode q = head;
        //q 往右移动n位
        for(int i=0;i<n;i++){
        	q = q.next;
        }
        
        if(p == null){//倒数第n个节点就是头节点
        	//删除头文件
        	head = head.next;
        	return head;
        }
        
        while(q.next != null){
        	p = p.next;
        	q = q.next;
        }
        
        p.next = p.next.next;//删除操作
        
    	return head;
    }
	
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
