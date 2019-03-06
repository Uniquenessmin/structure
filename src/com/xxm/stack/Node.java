package com.xxm.stack;

public class Node {
	
	/**
	 *节点元素
	 * 
	 */
	Object value;
	
	/**
	 * 前赴
	 */
	Node pre;
	
	/**
	 * 后继
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
