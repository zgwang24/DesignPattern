package com.zgwang.behavior.strategy;

public class Test {
	public static void main(String[] args) {
		String exp = "2+8";
		ICalculator cal = new Plus();
		int res = cal.calculate(exp);
		System.out.println(res);
	}
}
