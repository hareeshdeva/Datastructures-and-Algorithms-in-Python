package com.algo.ds.linkedlist;

public class SinglyLinkedList {
	public Node first;
	
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	//used to insert at the start
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first.next = first;
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (first  --> last) ");
		Node current  = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void insertLast(int data) {
		Node current = first;

		while(current.next != null) {
			current = current.next ;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next  = newNode;
		newNode.next = null;
	}
	
}
