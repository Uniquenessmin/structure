package com.xxm.demo;

/**
 * 计算商户纳税金额
 * 
 * @author Administrator
 *
 */
public class Demo {
	// 应纳税所得额
	//0-15000,15000-30000,30000-60000,60000-100000,100000~
	int[] money = { 0, 15000, 30000, 60000, 100000 };
	// 税率
	double[] taxPercent = { 0.05, 0.1, 0.2, 0.3, 0.35 };
	// 速算扣除数
	int[] subMoney = { 0, 750, 3750, 9750, 14750 };

	public double tax(int n) {
		double tax = 0;
		
			for (int i = money.length-1; i >=0; i--) {
		
			if (n > money[i]) {
				tax = n * taxPercent[i] - subMoney[i];
//				System.out.printf("%d * %f + %d =", money[i], taxPercent[i]);
				break;
				
			}
		  }
		
		
		
		
		return tax;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.tax(50000));
		System.out.println(demo.tax(12000));
		System.out.println(demo.tax(150000));
		System.out.println(demo.tax(70000));
		System.out.println(demo.tax(60000));
	}
}
