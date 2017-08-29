package com.zgwang.create.factorymethod;

public class FactoryTest {
	public static void main(String[] args) {
		SendFactory fac = new SendFactory();
		Sender s = fac.produce("mail");
		s.Send();
		
		SendFactory2 fac2 = new SendFactory2();
		Sender s2 = fac2.produceSms();
		s2.Send();
		
		SendFactory3.produceMail().Send();
	}
}
