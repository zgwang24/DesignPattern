package com.zgwang.behavior.visitor;
/**
 * 访问者模式：一种分离对象数据结构与其操作算法的方式
 * @author zgwang
 *
 */
public class Test {
	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);
	}
}
