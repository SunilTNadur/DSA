package com.suni;

public class ReverseLinkedList {

	public Node reverseLL(Node head) {
		if(head == null || head.next == null){
			return head;
		}
		Node temp =reverseLL(head.next);
		head.next.next = head;
		head.next = null;
		return temp ;
		
	}
	
	

}
