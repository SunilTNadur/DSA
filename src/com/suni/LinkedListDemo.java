package com.suni;

class Node {
	int data;
	Node next;
}

class Linked {

	// Create a new node
	private Node getNewNode(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		return node;
	}

	public Node createLL(Node head, int data) {
		// if list is empty, get the new node
		if (head == null) {
			return getNewNode(data);
		}
		head.next = createLL(head.next, data);
		return head;
	}

	// Display linked list
	public void printLL(Node head) {
		// if list is empty, return void
		if (head == null) {
			return;
		}

		System.out.print(head.data + " ");
		printLL(head.next);

	}
	
	public void reversePrint(Node head) {

        if(head == null ) { return; }

        Node prev = null;
        Node next = null;

        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        Node temp = prev;

            while(temp != null){
                System.out.print(temp.data+"  ");
                temp = temp.next;
            }
        }


	// Get the size of linked list
	public int getSize(Node head) {
		if (head == null)
			return 0;

		return getSize(head.next) + 1;
	}

}

public class LinkedListDemo {

	public static void main(String[] args) {

		Node head = null;
		Linked link = new Linked();

		// int [] numbers = {10,20,30,40};
		head = link.createLL(head, 40);
		
		head = link.createLL(head, 70);
		head = link.createLL(head, 10);
		head = link.createLL(head, 20);
		head = link.createLL(head, 50);
		head = link.createLL(head, 60);
		head = link.createLL(head, 30);
		

		int size = link.getSize(head);

		System.out.println("Size is " + size);

		link.printLL(head);
		
		System.out.println("Size is " + size); 
		
		link.reversePrint(head);

		// Rotate LL clock wise

		/*
		 * RotateLinkedList rotate = new RotateLinkedList();
		 * 
		 * head = rotate.rotateClockWise(2, head);
		 * 
		 * System.out.println("Clock Wise "); link.printLL(head);
		 * 
		 * head = rotate.rotateAntiClockWise(3, head);
		 * System.out.println("Anti Clock Wise "); link.printLL(head);
		 */

		System.out.println();

		// Reverse Linked list

		/*
		 * ReverseLinkedList reverse = new ReverseLinkedList(); head =
		 * reverse.reverseLL(head); link.printLL(head);
		 */

		// Middle element of List

		MiddleElementOfLinkedList middle = new MiddleElementOfLinkedList();
		Node midNode = middle.middleNode(head);
		System.out.print("Middle element : " + midNode.data);

		MergeSortLinkedList sortedList = new MergeSortLinkedList();
		head = sortedList.mergeSort(head);
		System.out.println("Sorted list");
		link.printLL(head);

	}

}
