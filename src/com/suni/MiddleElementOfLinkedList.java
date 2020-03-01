package com.suni;

public class MiddleElementOfLinkedList {

	public Node middleNode(Node head) {
		if(head == null || head.next == null){
			return head;
		}
		Node a = head;
		Node b = head.next;
		
		while(b != null && b.next != null){
			a = a.next;
			b = b.next.next;
		}
		return a;
	}

}
