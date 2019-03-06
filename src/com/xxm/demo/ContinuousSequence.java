package com.xxm.demo;

/**
 * 
 * 最大连续子序列的和
 * @author Administrator
 *
 */
public class ContinuousSequence {
	// 连续子元素最大和
	static int[] n = { -4, 2, 7, -3, 12, 9, -5, 10, 20, -5 };
	
	// O(n*n)
	public static int maxSum() {
		int[] max = new int[n.length-1];
		for(int i = 0; i<n.length-1; i++) {
			int sum = n[i]+n[i+1];
			 max[i] = n[i]+n[i+1];
			for(int j = i+2; j<n.length; j++) {
				sum += n[j];
				if(sum > max[i]) {
					max[i] = sum;
				}
			}
			System.out.println(max[i]);

		}
		int maxsum = max[0];
		for(int k=1; k<max.length; k++) {
			if(max[k] > maxsum) {
				maxsum = max[k];
			}
		}
		return maxsum;
		
	}
		
	// O(n)
	public static int maxNum() {
//		static int[] n = { -4, 2, 7, -3, 12, 9, -5, 10, 20, -5 };

		int len = n.length;
		int start = 0;
		int end = 0;
		//第i项之前的最大连续子序列的和
		int []dp = new int[len];
		dp[0] = n[0];
		int max = Integer.MIN_VALUE;
		for(int i=1;i<len;i++) {
			dp[i] = Math.max(dp[i-1]+n[i], n[i]);
			if(dp[i]>max) {
				max = dp[i];
				end = i;
			}
		}
		
		int ss= max;

		for(int i = end;i>=0; i--) {
			ss = ss - n[i];
			if(ss == 0) {
				start = i;
			}
		}
		System.out.println(start+" "+end);
		return max;
	}
		
	public static void main(String[] args) {
		System.out.println("连续子序列最大和：" + maxNum());

	}

}
