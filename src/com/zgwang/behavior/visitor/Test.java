package com.zgwang.behavior.visitor;
/**
 * ������ģʽ��һ�ַ���������ݽṹ��������㷨�ķ�ʽ
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
