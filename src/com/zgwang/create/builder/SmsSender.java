package com.zgwang.create.builder;

public class SmsSender implements Sender{

	@Override
	public void Send() {
		System.out.println("Send a sms");
	}

}
