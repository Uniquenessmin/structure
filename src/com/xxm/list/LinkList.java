package com.xxm.list;

/**
 * 双向链表
 * 
 * @author min
 *
 */
public class LinkList {

	/**
	 * 头结点
	 */
	private Node head;

	/**
	 * 尾结点
	 */
	private Node tail;

	private int size;

	public LinkList() {
		head = new Node();
		tail = new Node();

		head.next = tail;
		tail.pre = head;
		size = 0;

	}

	/**
	 * 获取链表长度
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * 判断链表是否为空
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * 清空链表
	 * 
	 */
	public void clear() {
		head.next = tail;
		tail.pre = head;
		size = 0;
	}

	/**
	 * 在末尾添加新的数据
	 * 
	 * @param value 数据
	 */
	public void add(Object value) {
		Node node = new Node(value, tail.pre, tail);
		tail.pre.next = node;
		tail.pre = node;
		size++;
	}

	/**
	 * 在特地位置创建新的节点
	 * 
	 * @param index
	 * @param value
	 */
	public void add(int index, Object value) {
		checkLinkList(index);

		if (index == size - 1) {
			// 插在最后一位
			add(value);
		} else {
			Node x = node(index - 1);
			Node y = node(index);
			Node node = new Node(value, x, y);
			x.next = node;
			y.pre = node;
			size++;
		}

	}

	/**
	 * 获取特定位置的节点
	 * 
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		// 检查是否在链表内
		checkLinkList(index);
		// 节点的值
		return node(index).value;
	}

	/**
	 * 删除特定的节点
	 * 
	 * @param index
	 * @return
	 */
	public Node remove(int index) {
		checkLinkList(index);
		Node x = node(index);
		x.pre.next = x.next;
		x.next.pre = x.pre;
		size--;
		return x;
	}

	/**
	 * 检查索引是否在链表内
	 * 
	 * @param index
	 */
	private void checkLinkList(int index) {
		if (index > size() || index < 0)
			throw new IndexOutOfBoundsException(index);
	}

	/**
	 * 遍历链表查询特定的节点
	 * 
	 * @param index 索引
	 * @return 指定的节点
	 */
	private Node node(int index) {
		// 第1个节点
		Node firstNode = head;
		// 最后1个节点
		Node lastNode = tail;

		// 从头开始遍历
		if (index <= (size >> 1)) {
			Node indexNode = firstNode;
			for (int i = -1; i < index; i++)
				indexNode = indexNode.next;
			return indexNode;
		}

		// 从尾遍历
		else {
			Node indexNode = lastNode;
			for (int i = size; i > index; i--) {
				indexNode = indexNode.pre;
			}
			return indexNode;
		}
	}

	/**
	 * 重写链表输出方式
	 * 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		String str = "";
		for (int i = 0; i < size; i++) {
			str = String.valueOf(i + ":" + node(i).value + "\n");
			builder.append(str);
		}
		return builder.toString();
	}

}
