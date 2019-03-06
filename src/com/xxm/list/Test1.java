package com.xxm.list;

public class Test1 {

	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		linkList.add("1");
		linkList.add("2");
		linkList.add("3");
		linkList.add("4");
	
		linkList.add(2,"bb");
		linkList.add(4,"zz");
		linkList.add(0,"vv");
		System.out.println("size:"+linkList.size());
		System.out.println(linkList.toString());
		System.out.println("==========");

		System.out.println("É¾³ý£º" + linkList.remove(0).value);
		System.out.println("É¾³ý" + linkList.remove(3).value);
		System.out.println("size:"+linkList.size());
		System.out.println(linkList.toString());
	}

}
