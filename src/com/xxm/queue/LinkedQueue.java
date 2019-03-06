package com.xxm.queue;

/**
 * ������ʵ�ֶ���
 * 
 * @author Administrator
 *
 */
public class LinkedQueue {
	
	//数据
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedQueue() {
		head = new Node();
		tail = new Node();
		
		head.next = tail;
		tail.pre = head;
		size = 0;
	}
	
	//操作
	/**
	 * 队列的大小
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * 入队
	 * @param o
	 */
	public void add(Object value) {
		Node node = new Node(value, tail.pre, tail);
		tail.pre.next = node;
		tail.pre =node;
		size ++;	
	}
	
	/**
	 * 出队
	 * 
	 * @return
	 */
	public Object poll() {
		checkQueue();
		Node x = head.next;
		x.pre.next = x.next;
		x.next.pre = x.pre;
		size --;
		return x.value;
	}
	
	/**
	 * 清空队列
	 * 
	 */
	public void clear() {
		head.next = tail;
		tail.pre = head;
		size = 0;
		
	}
	
	/**
	 * 访问第一个元素
	 * 
	 * @return
	 */
	public Object peek() {
		checkQueue();
		return head.next.value;
	}
	
	/**
	 *队列是否空
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void checkQueue() {
		if(isEmpty())
			throw new IndexOutOfBoundsException("������");
	}
	
	public static void main(String[] args) {
		LinkedQueue queue = new LinkedQueue();
		queue.add("a");
		queue.add("b");
		queue.add("c");
		queue.add("d");
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println();
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.size());
		
		
		
	}
}
