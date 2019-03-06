package com.xxm.list;

/**
 * ˫������
 * 
 * @author min
 *
 */
public class LinkList {

	/**
	 * ͷ���
	 */
	private Node head;

	/**
	 * β���
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
	 * ��ȡ������
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * �ж������Ƿ�Ϊ��
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * �������
	 * 
	 */
	public void clear() {
		head.next = tail;
		tail.pre = head;
		size = 0;
	}

	/**
	 * ��ĩβ����µ�����
	 * 
	 * @param value ����
	 */
	public void add(Object value) {
		Node node = new Node(value, tail.pre, tail);
		tail.pre.next = node;
		tail.pre = node;
		size++;
	}

	/**
	 * ���ص�λ�ô����µĽڵ�
	 * 
	 * @param index
	 * @param value
	 */
	public void add(int index, Object value) {
		checkLinkList(index);

		if (index == size - 1) {
			// �������һλ
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
	 * ��ȡ�ض�λ�õĽڵ�
	 * 
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		// ����Ƿ���������
		checkLinkList(index);
		// �ڵ��ֵ
		return node(index).value;
	}

	/**
	 * ɾ���ض��Ľڵ�
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
	 * ��������Ƿ���������
	 * 
	 * @param index
	 */
	private void checkLinkList(int index) {
		if (index > size() || index < 0)
			throw new IndexOutOfBoundsException(index);
	}

	/**
	 * ���������ѯ�ض��Ľڵ�
	 * 
	 * @param index ����
	 * @return ָ���Ľڵ�
	 */
	private Node node(int index) {
		// ��1���ڵ�
		Node firstNode = head;
		// ���1���ڵ�
		Node lastNode = tail;

		// ��ͷ��ʼ����
		if (index <= (size >> 1)) {
			Node indexNode = firstNode;
			for (int i = -1; i < index; i++)
				indexNode = indexNode.next;
			return indexNode;
		}

		// ��β����
		else {
			Node indexNode = lastNode;
			for (int i = size; i > index; i--) {
				indexNode = indexNode.pre;
			}
			return indexNode;
		}
	}

	/**
	 * ��д���������ʽ
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
