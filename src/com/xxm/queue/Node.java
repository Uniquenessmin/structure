package com.xxm.queue;

public class Node {
	
	/**
	 *元素的值 ֵ
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
