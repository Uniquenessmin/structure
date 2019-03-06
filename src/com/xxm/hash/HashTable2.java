package com.xxm.hash;

public class HashTable2<K,V> {
	
	//数组
	Node[] table = new Node[16];
	
	int size;
	
	/**
	 * 存储
	 * @param key
	 * @param value
	 */
	public void put(K key,V value) {
		Node newNode  = new Node<K, V>(key, value);
		int hashCode = hash(key);
		if(table[hashCode]== null) {
			//数组中单元为空，直接存入
			table[hashCode] = newNode;
		}else {
			//单元非空，加入链表末尾
			Node node = table[hashCode];
			while(true) {
				if(node.next == null) {
					node.next = new Node<K, V>(key, value);
					break;
				}
				node = node.next;
			}
		}
		
	}
	
	/**
	 * 获取key对应的值
	 * @param key
	 * @return
	 */
	public V get(K key) {
		int hashCode = hash(key);
		Node node = table[hashCode];
		V value = null;
		//遍历对应数组单元的链表
		while(node != null) {
			//key值相同
			if(node.key.equals(key)) {
				value = (V) node.value;
				break;
			}
			//下一个节点
			node = node.next;
		}
		return value;
	}
	
	/**
	 * 获得哈希值
	 * @param key
	 * @return
	 */
	public int hash(K key) {
		String s = String.valueOf(key);
		char[] ch = s.toCharArray();
		int sum = 0;
		for(char c : ch) {
			sum += c;
		}
		return sum % 16;
	}

	public static void main(String[] args) {
		HashTable2<String,String> table = new HashTable2<>();
		table.put("bob", "123");
		table.put("sun", "222");
		System.out.println(table.get("bob"));
	}
}
