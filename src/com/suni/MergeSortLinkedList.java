package com.suni;

public class MergeSortLinkedList {

	public Node mergeSort(Node head) {
		MiddleElementOfLinkedList middleElementOfLinkedList = new MiddleElementOfLinkedList();
		if (head == null || head.next == null) {
			return head;
		}
		Node middle = middleElementOfLinkedList.middleNode(head);
		Node secondHalf = middle.next;
		middle.next = null;
		return merge(mergeSort(head), mergeSort(secondHalf));
	}

	private Node merge(Node firstHalf, Node secondHalf) {
		Node temp = new Node();
		Node SortedList = temp;

		while (firstHalf != null && secondHalf != null) {
			if (firstHalf.data < secondHalf.data) {
				temp.next = firstHalf;
				firstHalf = firstHalf.next;
			} else {
				temp.next = secondHalf;
				secondHalf = secondHalf.next;
			}
			temp = temp.next;
		}
		temp.next = (firstHalf == null) ? secondHalf : firstHalf;

		return SortedList.next;
	}

}
