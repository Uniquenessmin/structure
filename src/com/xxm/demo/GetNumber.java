package com.xxm.demo;

import java.util.ArrayList;

/**
 * �Ÿ����֣����������λ�����ڶ�����λ���ǵ�һ����2�����������ǵ�һ����3��
 * 
 * @author min
 *
 */
public class GetNumber {
	// 1,2,3,4,5,6,7,8,9
	// ��һ������С��330

	public static void main(String[] args) {
		
		//�洢�������һ������
		ArrayList<Integer> result = new ArrayList<>();
		for (int fir = 123; fir < 330; fir++) {
			//��ǣ���1��9��Ԫ�ض�Ϊ1��������û���ظ�
			int[] n = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			
			n[fir / 100]++;
			n[fir / 10 % 10]++;
			n[fir % 10]++;
			
			//�ڶ�����λ������Ϊ��һ����λ��������
			int sec = fir * 2;
			n[sec / 100]++;
			n[sec / 10 % 10]++;
			n[sec % 10]++;

			//��������λ������Ϊ��һ����λ��������
			int thir = fir * 3;
			n[thir / 100]++;
			n[thir / 10 % 10]++;
			n[thir % 10]++;

			for (int i = 1; i <= 9; i++) {
				// ���ֲ��ظ�
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
