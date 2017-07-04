package com.javaquiz;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		System.out.println(ll);
		
		ll.append(10);
		ll.removeTail();
		System.out.println(ll);
		
		ll.append(20);
		ll.removeGreater(5);
		System.out.println(ll);
		
		ll.append(10);
		ll.append(20);
		ll.append(5);
		ll.append(3);
		ll.append(30);
		System.out.println(ll);
		
		ll.removeTail();
		System.out.println(ll);
		
		ll.append(30);
		ll.append(15);
		System.out.println(ll);
		ll.removeGreater(10);
		System.out.println(ll);
		
		
	}

}
