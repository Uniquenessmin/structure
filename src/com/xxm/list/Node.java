package com.xxm.list;

public class Node {
	
	/**
	 * ֵ
	 * 
	 */
	Object value;
	
	/**
	 * ǰ��
	 */
	Node pre;
	
	/**
	 * ���
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
