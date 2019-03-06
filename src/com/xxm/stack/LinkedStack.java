package com.xxm.stack;

/**
 * ������ʵ��ջ FILO
 * 
 * @author xxm
 *
 */
public class LinkedStack {

	// 数据

	// 头结点
	private Node head;
	
	// 尾结点
	private Node tail;

	// 大小
	private int size;

	public LinkedStack() {
		head = new Node();
		tail = new Node();

		head.next = tail;
		tail.pre = head;
		size = 0;
	}
	
	/**
	 * 栈大小
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * 入栈
	 * 
	 * @param value 
	 */
	public void push(Object value) {
		Node x = new Node(value, tail.pre, tail);
		tail.pre.next = x;
		tail.pre = x;
		size ++;
		
	}
	
	/**
	 * 出栈
	 * 
	 * @return 
	 */
	public Object pop() {
		checkStack();
		Node last = tail.pre;
		last.pre.next = tail;
		tail.pre = last.pre;
		size --;
		return last.value;
	}
	
	/**
	 * 访问栈顶元素
	 * 
	 * @return
	 */
	public Object peek() {
		checkStack();
		return tail.pre.value;
		
	}
	
	/**
	 * 栈是否为空
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * ���ջ
	 * 
	 */
	public void clear() {
		size = 0;
		head.next = tail;
		tail.pre = head;
	}
	
	/**
	 * 检查栈
	 * 
	 */
	public void checkStack() {
		if(isEmpty())
			throw new IndexOutOfBoundsException();
	}
	
	public static void main(String[] args) {
		LinkedStack stack = new LinkedStack();
		stack.push("a");
		stack.push("b");
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		stack.push("c");
		stack.push("d");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	}
}
