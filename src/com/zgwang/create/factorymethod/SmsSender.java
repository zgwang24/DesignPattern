package com.zgwang.create.factorymethod;

public class SmsSender implements Sender{
	@Override
	public void Send() {
		System.out.println("Send a sms");
	}

}
