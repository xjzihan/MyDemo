package com.xj.accuracy;

/**
 * 示例2：数值包装类型比对问题
 * 
 * https://blog.csdn.net/u011035407/article/details/81173075
 */
public class Example2 {

	public static void main(String[] args) {
		method1();
	}

	/**
	 * 演示-数值封装类型比对问题
	 * 100与100通过==比较，返回true，通过equals比较，返回true
	 * 200与200通过==比较，返回false，通过equals比较，返回true
	 * 
	 * 解读：
	 * 1.equals与==的区别？
	 * 1)对于基本数据类型，==比较的是值
	 * 2)对于封装数据类型，==比较的是内存地址，equals比较的是值
	 * equals()方法是Object基类中定义的方法，这个方法初始行为是通过==比较对象的内存地址，但是在某些类库中该方法会被覆盖重写，如String，Integer，Date等，在其类中重写了equals()方法的实现，从而不再是比较对象在堆内存中的存放地址了
	 * 对于子类没有进行重写Object基类的equals方法时，默认是比较其内存地址
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void method1() {
		Integer i1 = 100;
		/*
		 * 1)变量i1为Integer类型，100为int类型，因为Integer与int之间并无继承关系，按照java的一般处理方法，这行代码应该是报错的
		 * 2)但由于java的自动装箱机制的存在，在为Integer类型的变量赋int类型值时，java会自动将int类型转换为Integer类型。相当于：Integer i1 = Integer.valueOf(1);
		 *   valueOf()方法返回一个Integer类型值，并将其赋值给变量i1，这个过程叫做int的自动装箱(装箱:是将一个原始数据类型赋值给相应封装类的变量,拆箱:则是将一个封装类的变量赋值给相应原始数据类型的变量)
		 *   
		 * 
		 */
		
		
		Integer i2 = 100;
		Integer i3 = 200;
		Integer i4 = 200;

		System.out.println(i1 == i2);//true
		System.out.println(i3 == i4);//false
		
		System.out.println(i1.equals(i2));//true
		System.out.println(i3.equals(i4));//true
		
		System.out.println("i1=" + i1 + "，变量内存地址：" + System.identityHashCode(i1));
		System.out.println("i2=" + i2 + "，变量内存地址：" + System.identityHashCode(i2));
		System.out.println("i3=" + i3 + "，变量内存地址：" + System.identityHashCode(i3));
		System.out.println("i4=" + i4 + "，变量内存地址：" + System.identityHashCode(i4));
	}
}
