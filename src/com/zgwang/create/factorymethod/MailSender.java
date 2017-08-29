package com.zgwang.create.factorymethod;

public class MailSender implements Sender{
	@Override
	public void Send() {
		System.out.println("Send a mail");
	}
}
