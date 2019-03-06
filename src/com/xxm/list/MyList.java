package com.xxm.list;

import java.util.Arrays;

//ADT 
//java.util 
//
//ArrayList 列表
//LinkedList 链表
public class MyList {
	
	//数据
	private Object[] data;
	
	//列表大小
	private int size = 0;
	
	public MyList() {
		data = new Object[10];
		//null
//		System.out.println(Arrays.toString(data));
		size = 0;
	}
	//获得大小
	public int size() {
		return size;
	}
	/**
	 * 获得指定位置的数据
	 * 
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		if(index >=size || index <0) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		return data[index];
	}
	
	/**
	 * 删除指定位置的数据
	 * 
	 * @param index
	 * @return
	 */
	public Object remove(int index) {
		if(index >=size || index <0) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		Object o = data[index];
		for(int i = index; i < size; i++) {
			data[i] = data[i+1];	
		}
		size--;
		return o;
	}
	
	/**
	 * 增加数据
	 * 
	 * @param o
	 * @return
	 */
	public boolean add (Object o) {
		//是否需要扩容
		if(size >= data.length) {
			ensureCapacity();
		}
		data[size++] = o;
		return true;	
	}
	
	private void ensureCapacity() {
		
			Object[] newData = new Object[size * 2];
			//将数据复制到新的数组
			for(int i=0; i<data.length; i++) {
				newData[i] = data[i];
			}
			//关联
			data = newData;
			System.out.println("#####扩容");
		}
		
	/**
	 *  在指定位置增加数据
	 * 
	 * @param o
	 * @param index
	 * @return
	 */
	boolean add(Object o, int index) {
		//扩容？？
		if(size >= data.length) {
			ensureCapacity();
		}
		//指定位置不在列表大小范围内
		if(index < 0 || index > size) {
		  throw new ArrayIndexOutOfBoundsException(index);
		}
		
		//如果添加到末尾
		if(index == size) {
			add(o);
			return true;
		}
		
		//先移动数据再添加
		//[a,b,c,0,0,0]
		for(int i = size-1; i>= index; i--) {
			data[i+1] = data[i];
		}
		data[index] = o;
		size ++;
		return true;
	}
	
	/**
	 * 是否空列表
	 * 
	 * @return
	 */
	boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * 
	 * 清空列表
	 * 
	 */
	public void clear() {
		size = 0;
	}
	
	//输出格式
	@Override
	public String toString(){
		
		return Arrays.toString(data);
		
	}
	
	
}
