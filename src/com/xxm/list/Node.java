package com.xxm.list;

public class Node {
	
	/**
	 * Öµ
	 * 
	 */
	Object value;
	
	/**
	 * Ç°Çý
	 */
	Node pre;
	
	/**
	 * ºó¼Ì
	 */
	Node next;
	
	public Node(){
		
	}
	
	public Node(Object value, Node pre, Node next) {
		this.value = value;
		this.pre = pre;
		this.next = next;
	}
}
