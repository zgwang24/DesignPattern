package com.zgwang.create.builder;

public class MailSender implements Sender{
	
	@Override
	public void Send() {
		System.out.println("Send a mail");
	}
}
