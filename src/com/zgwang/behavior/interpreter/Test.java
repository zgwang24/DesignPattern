package com.zgwang.behavior.interpreter;
/**
 * ������ģʽ��һ��Ӧ����OOP�����еı����������У�����������ʽ��������
 * @author zgwang
 *
 */
public class Test {
	public static void main(String[] args) {
		int res = new Minus().interpret(new Context(new Plus().interpret(new Context(9, 2)), 8));
		System.out.println(res);
	}
}
