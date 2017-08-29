package com.zgwang.behavior.templatemethod;

public class Test {
	public static void main(String[] args) {
		String exp = "8+8";
		AbstractCalculator cal = new Plus();
		int res = cal.calculate(exp, "\\+");
		System.out.println(res);
	}
}
