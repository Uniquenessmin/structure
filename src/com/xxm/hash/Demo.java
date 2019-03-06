package com.xxm.hash;

import java.util.Hashtable;

public class Demo {
	public static void main(String[] args) {
		Hashtable<Integer, Object> table = new Hashtable<>();
		
		table.put(1, '一');
		table.put(2, '二');
		table.put(3, '三');
		
		table.remove(2);
		
		System.out.println(table);
	}

}
