package com.zgwang.create.abstractfactory;

public class MailSender implements Sender{
	
	@Override
	public void send() {
		System.out.println("Send a mail");
	}
	
}
