package com.xj.classloader.demo2;

public class MyParentClass {

	public MyParentClass() {
		System.out.println("Parent 无参构造方法 A");
	}
	
	{ 
		System.out.println("Parent 动态块 B"); 
	}
	
	static {
		System.out.println("Parent static静态块 C");
	}
	
	public static void main(String[] args) {
		MyChildrenClass instance1 = new MyChildrenClass();
		System.out.println("============");
		MyChildrenClass instance2 = new MyChildrenClass();
		System.out.println("============");
		MyChildrenClass2 instance3 = new MyChildrenClass2();
	}
}
