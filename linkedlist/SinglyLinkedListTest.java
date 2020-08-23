package com.algo.ds.linkedlist;

public class SinglyLinkedListTest {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertFirst(100);
		list.insertFirst(50);
		list.insertFirst(99);
		list.insertFirst(88);
		list.insertLast(10000);
		list.displayList();
	}
}
