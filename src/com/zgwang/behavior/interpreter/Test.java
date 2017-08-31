package com.zgwang.behavior.interpreter;
/**
 * 解释器模式：一般应用在OOP开发中的编译器开发中，例如正则表达式解释器。
 * @author zgwang
 *
 */
public class Test {
	public static void main(String[] args) {
		int res = new Minus().interpret(new Context(new Plus().interpret(new Context(9, 2)), 8));
		System.out.println(res);
	}
}
