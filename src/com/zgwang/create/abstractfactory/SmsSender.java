package com.zgwang.create.abstractfactory;

public class SmsSender implements Sender{
	
	@Override
	public void send() {
		System.out.println("Send a sms");
	}
	
}
