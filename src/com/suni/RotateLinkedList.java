package com.suni;

public class RotateLinkedList {
	
	public Node rotateClockWise(int k, Node head){
		Linked link = new Linked();
		
		if(head == null || k < 0) return head;
		
		
		int sizeOfLL = link.getSize(head);
		
		k = k % sizeOfLL;
		
		if(k == 0) return head;
		
		Node temp = head;
		int i = 1;
		
		while(i < sizeOfLL - k){
			temp = temp.next;
			i++;
		}
		Node root = temp.next;
		temp.next = null;
		
		Node current = root;
		
		while(current.next != null){
			current = current.next;
		}
		current.next = head;
		return root;
	}
	
	public Node rotateAntiClockWise(int k, Node head){
		Linked link = new Linked();
		if(head == null || k < 0){
			return head;
			}
		int sizeOfLL = link.getSize(head);
		k = k % sizeOfLL;
		
		if(k == 0){
			return head;
		}
		
		int i = 1;
		
		Node temp = head;
		while(i < k){
			temp = temp.next;
			i++;
		}
		
		Node root = temp.next;
		temp.next = null;
		
		Node current = root ;
		
		while(current.next != null){
			current = current.next;
		}
		current.next = head;
		
		
		return root;
	}
	

}
