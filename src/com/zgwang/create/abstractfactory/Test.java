package com.zgwang.create.abstractfactory;

public class Test {
	public static void main(String[] args) {
		Provider p = new SendMailFactory();
		Sender s = p.produce();
		s.send();
	}
}
