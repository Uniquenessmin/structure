package com.xxm.queue;

/**
 * ������ʵ�ֶ���
 * 
 * @author Administrator
 *
 */
public class MyQueue2 {

	//数据
	private Object[] data;
	
	//大小
	private int size;
	
	//头节点
	private int head;
	
	//尾节点
	private int tail;
	
	public MyQueue2() {
		data = new Object[10];
		head = 0;
		tail = 0;
	}
	
	//操作
	/**
	 * 入队
	 * 
	 * @param o
	 */
	public void add(Object o) {
		data[tail++] = o;
	}
	
	/**
	 * 出队
	 * 
	 * @return
	 */
	public Object poll() {
		return data[head++];
	}
	
	/**
	 * 获得队列的第一个元素
	 * 
	 * @return
	 */
	public Object peek() {
		return data[head];
	}
	
	/**
	 * 获得队列大小
	 * 
	 * @return
	 */
	public int size() {
		return tail - head;
	}
	
	/**
	 * 清空队列
	 * 
	 */
	public void clear() {
		head = 0;
		tail = 0;
	}
	
	public static void main(String[] args) {
		MyQueue2 queue = new MyQueue2();
		queue.add("a");
		queue.add("b");
		queue.add("c");
		
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.size());
		queue.clear();
		System.out.println(queue.size());
	}
}
