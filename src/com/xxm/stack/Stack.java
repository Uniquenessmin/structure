package com.xxm.stack;


/**
 * 栈  FILO
 * 
 * @author xxm
 *
 */
public class Stack {
	
	//数据
	Object[] data;
	
	//顶部指针
	int top;
	
	public Stack() {
		data = new Object[10];
		top = -1;
	}
	
	//操作
	
	/**
	 * 压栈
	 * 
	 */
	public void push(Object o) {
		data[++top] = o;
	}
	
	/**
	 * 出栈
	 * 
	 * @return
	 */
	public Object pop() {
		return data[top--];
	}
	
	/**
	 * 访问栈顶数据
	 * 
	 * @return 栈顶数据
	 */
	public Object peek() {
		return data[top]; 
	}

	/**
	 * 是否栈空
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return top == -1;
	}
	
	/**
	 * 清空栈
	 * 
	 */
	public void clear() {
		top = -1;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		
		
	}
}
