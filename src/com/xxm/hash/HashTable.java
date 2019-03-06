package com.xxm.hash;

import java.net.DatagramPacket;

/**
 * 散列值
 * 
 * @author xxm
 *
 */
public class HashTable {
	String[] data = new String[16];
	
	
	//散列冲突
	//解决散列冲突的方法：线性探测、平方探测、再散列、分离链表（链表）
	
	/**
	 * 添加
	 */
	public void put(String key) {
		int hashCode = hash(key);
		
		//散列冲突的线性探测
		while(data[hashCode]!=null) {			
				hashCode++;
				if(hashCode > data.length) {
					throw new IndexOutOfBoundsException();
				}
		}
		
		//TODO
		data[hashCode] = key;
		
	}
	
	public String get(String key) {
		return null;
	}
	
	/**
	 * 自定义的散列函数：各个字符编码的累加和模13
	 * @param text
	 * @return 0~15
	 */
	private int hash(String text) {
		char[] chs = text.toCharArray();
		int sum = 0;
		for(char c : chs) {
			sum += c;
		}	
		return sum % 16;
	}
	
	/**
	 * 
	 * @param text
	 * @return 0-9 || a-f
	 */
	public String hashString(String text) {
		return Integer.toString(hash(text), 16);
	}
	

	/**
	 * 是否包含指定的值
	 * @return
	 */
	public boolean contain(String key) {
		int hashCode = hash(key);
		String s = null;
		while(true) {
			if(data[hashCode].equals(key)) {
				s = data[hashCode];
				break;	
			}
			hashCode++;
			if(hashCode >= data.length) {
				break;
			}
		}
		return s!=null;
	}
	
	public static void main(String[] args) {
		HashTable table = new HashTable();
		
		table.put("allen");
		table.put("len");
		table.put("bob");
		table.put("tomy");
		table.put("eason");
		table.put("eason");
		table.put("eason");
		table.put("eason");
		
		
		System.out.println(table.contain("bob"));
		for(int i = 0; i<16; i++) {
			System.out.println(i+":"+table.data[i]);
		}
	}
	
}
