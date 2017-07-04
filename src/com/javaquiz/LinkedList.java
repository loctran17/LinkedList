package com.javaquiz;

public class LinkedList {
	
	int value;
	LinkedList head = null;
	LinkedList tail = null;
	LinkedList next = null;
	
	// Constructor, the list is empty
	public LinkedList() {
		value = 0;
		
		// Dummy element
		head = tail = null;
	}
	
	// Constructor, the list is empty
	public LinkedList(int value) {
		this.value = value;
		
		// Dummy element
		head = tail = next = null;
	}
	
	// Constructor, the list is empty
	public LinkedList(int value, LinkedList head, LinkedList tail, LinkedList next) {
		this.value = value;
		
		this.head = head;
		this.tail = tail;
		this.next = next;
	}
	
	// Append an element into linked list, return new element.
	LinkedList append(int element) {
		LinkedList newElement = new LinkedList(element);
		
		// the list is empty
		if (head == null) {
			head = tail = newElement;
		}
		else {
			// Update tail object and next object			
			tail.next = newElement;
			tail = newElement;
		}
			
		return newElement;
	}
	
	// Remove the tail element from the linked list
	LinkedList removeTail() {
		// if the list is empty
		if (tail == null) return null;
		
		LinkedList prevTail = head;
		if (prevTail == tail) {
			head = tail = null;
			return prevTail;
		}
		
		LinkedList resultTail = tail;
		
		// Update previous tail
		while (prevTail.next != tail) {
			prevTail = prevTail.next;
		}
		
		// Remove the tail object and update new tail object
		prevTail.next = null;
		tail = prevTail;
		
		return resultTail;
	}
	
	
	// Remove all element in the LinkedList that is greater than a target value
	void removeGreater(int value) {
		LinkedList elem = head;
		LinkedList prevElem = elem;
		
		// Use prevElem for iterator on linked list for improving performance O(n)
		while (elem != null) {
			if (elem.value > value) {
				// if we have first consecutive elements, we update head as well
				if (prevElem == elem) {
					// Update tail
					if (elem == tail) tail = prevElem.next;
					head = prevElem = elem = elem.next;		
				} 
				// remaining list
				else {
					// Update tail
					if (elem == tail) tail = prevElem;
					prevElem.next = elem.next;
					elem = elem.next;
				}
				
			} else {
				prevElem = elem;
				elem = elem.next;
			}
		}
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		LinkedList elem = head;
		while (elem != null && elem != tail) {
			sb.append(String.valueOf(elem.value));
			sb.append(", ");
			elem = elem.next;
		}
		if (tail != null) {
			sb.append(String.valueOf(tail.value));
		}
		sb.append(" ]");
		return sb.toString();
	}
}
