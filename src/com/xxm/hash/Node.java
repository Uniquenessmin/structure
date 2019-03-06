package com.xxm.hash;



public class Node<K,V> {
	
	K key;
	V value;
	Node next;
	
	public Node(K key, V value) {
		
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String toString() {
		
		return String.valueOf(key +" = " + value);
	}

}
