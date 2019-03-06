package com.xxm.demo;

import java.util.ArrayList;

/**
 * 九个数字，组成三个三位数，第二个三位数是第一个的2倍，第三个是第一个的3倍
 * 
 * @author min
 *
 */
public class GetNumber {
	// 1,2,3,4,5,6,7,8,9
	// 第一个数字小于330

	public static void main(String[] args) {
		
		//存储结果，第一个数字
		ArrayList<Integer> result = new ArrayList<>();
		for (int fir = 123; fir < 330; fir++) {
			//标记，第1到9的元素都为1，则数字没有重复
			int[] n = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			
			n[fir / 100]++;
			n[fir / 10 % 10]++;
			n[fir % 10]++;
			
			//第二个三位数定义为第一个三位数的两倍
			int sec = fir * 2;
			n[sec / 100]++;
			n[sec / 10 % 10]++;
			n[sec % 10]++;

			//第三个三位数定义为第一个三位数的三倍
			int thir = fir * 3;
			n[thir / 100]++;
			n[thir / 10 % 10]++;
			n[thir % 10]++;

			for (int i = 1; i <= 9; i++) {
				// 数字不重复
				if (n[i] == 0 ) {
					break;
				}
				if(i == 9) {
					result.add(fir);
				}
			}			
		}
		System.out.println(result.size());
		for(int i = 0; i<result.size(); i++) {
			System.out.println(result.get(i)+","+result.get(i)*2+","+result.get(i)*3);
		}
	}
}
