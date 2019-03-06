package com.xxm.queue;


/**
 * 优先队列（最大堆最小堆）
 * 
 * @author Administrator
 *
 */
public class PriorityQueue {
	
	//存储堆得数据
	private int[] data;
	
	//保存堆的最大值
	private int[] result;

	private int size;
	
	private int reSize;
	
	public PriorityQueue() {
		data = new int[10];
		result = new int[10];
		size = 0;
		reSize = 0;
	}

	/**
	 * 入队
	 * 
	 * @param o
	 */
	public void add(int n) {
//		if(size >= data.length)
//			data = increaseCapacity();
			
		//将数据加到队列末尾，比较大小	
		data[size ++] = n;
		if(size>1) 
			addSort();
	
	}
	
	/**
	 * 获得最优队列
	 * 每次取最大堆的顶部
	 * 
	 */
	public void getTop() {
		int n = size;
		for(int i = 0; i < n; i++) {
			result[reSize++] = data[0];
			//最大堆中只剩下一个元素（根节点），退出循环
			if(size == 1) {
				break;
			}
			data[0] = data[size - 1];
			data[size-1] = 0;
			size --;
			subSort();
		}	
	}
	
	/**
	 * 入队时排序
	 * 子节点与它的父节点比较，若比父节点大则交换位置
	 * 
	 */
	public void addSort() {
		int n = size - 1;
		while(n > 0) {
			int i = (n -1)/2;
			if(data[n] > data[i]) {
				int temp = data[i];
				data[i] = data[n];
				data[n] = temp;
				n = i;
			}else break;		
		}		
	}
	
	/**
	 * 去除顶部时重新排序
	 * 
	 */
	public void subSort() {
		int n = 0;
		
		//有子节点则继续比较
		while(data[n*2+1] != 0) {
			int temp = 0;
			int childMax = n*2+1;
			
			//若该父节点有右子节点，比较2个子节点的大小
			if(data[n*2+2] != 0) {
				if(data[n*2+1]<data[n*2+2]) {
					childMax = n*2+2;
				}
			}
			//比较父节点与子节点大小
			if(data[n] < data[childMax]) {
				//交换
				temp = data[childMax];
				data[childMax] = data[n];
				data[n] = temp;
				n = childMax;
			}
			else break;				
		}
	}
	
	/**
	 * 扩容
	 * @return
	 */
	public int[] increaseCapacity() {
		int[] adata = new int[size + 2];
		for(int i = 0; i < size; i++) {
			adata[i] = data[i];
		}
		return adata;
	}
	
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(3);
		queue.add(1);
		queue.add(4);
		queue.add(2);
		queue.add(5);
		queue.add(9);
		queue.add(8);
		System.out.println("==========");
		queue.getTop();
		System.out.println("=========");

		System.out.println(queue.reSize);
		System.out.println(queue.result);
		for(int i = 0; i<queue.reSize;i++) {
			System.out.println(queue.result[i]);
		}
	}
	
	
}
