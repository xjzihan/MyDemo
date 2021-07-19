package com.xj.accuracy;

/**
 * 示例1：多精度计算问题
 */
public class Example {

	public static void main(String[] args) {
		method1();
	}
	
	/**
	 * 演示多精度计算问题1:
	 * 多个double值运算出现小数点后很多位
	 * 加法运算结果：355.22999999999996
	 */
	public static void method1() {
		double num1 = 1;
		double num2 = 31.2;
		double num3 = 323.03;
		double value = num1 + num2 + num3;
		System.out.println("加法运算结果：" + value);
	}
}
