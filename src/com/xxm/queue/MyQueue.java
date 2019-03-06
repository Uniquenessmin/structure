package com.xxm.queue;

import java.util.Queue;

import com.xxm.list.MyList;

/**
 * FIFO 队列
 *  
 * 
 * @author xxm
 *
 */
public class MyQueue {
	
	//委托
	MyList list;

	public MyQueue() {
		list = new MyList();
	}
	
	/**
	 * 入队
	 * 
	 * @param o
	 */
	public void add(Object o) {
		list.add(o);
	}
	
	/**
	 * 出队 remove/poll
	 * 
	 * @return
	 */
	public Object poll() {
		return list.remove(0);		
	}
	
	/**
	 * 访问第一个元素
	 * 
	 * @return
	 */
	public Object peek() {
		return list.get(0);
	}
	
	/**
	 * 大小
	 * 
	 * @return
	 */
	public int size() {
		return list.size();
	}
	
	/**
	 * 清空队列
	 * 
	 */
	public void clear() {
		list.clear();
	}
	
	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
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
