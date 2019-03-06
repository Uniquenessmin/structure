package com.xxm.list;

public class Test {

	public static void main(String[] args) {
		MyList list = new MyList();
	
		test2(list);
		list.add("333",3);
		list.add("z",15);
		System.out.println(list);
		list.add("bb",20);
		System.out.println(list);
		System.out.println(list.get(20));
		System.out.println(list.remove(0));
		System.out.println(list.remove(0));
		System.out.println(list.remove(0));
		list.add("end");
		System.out.println(list);
		System.out.println(list.size());
		
//		test1(list);
	}

	public static void test2(MyList list) {
		System.out.println(list.size());
		for(int i=0; i<19; i++)
		list.add(i);
		System.out.println(list.size());
		System.out.println(list);
	}

	public static void test1(MyList list) {
		System.out.println(list.size());
		
		list.add("a");
		list.add("b");
		list.add("c");

		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list);
		list.add("first");
		System.out.println(list);
	}
	

}
