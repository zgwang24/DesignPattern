package com.zgwang.behavior.status;

public class Test {
	public static void main(String[] args) {
		Status status = new Status();
		Context context = new Context(status);
		
		status.setValue("status1");
		context.method();
		
		status.setValue("status2");
		context.method();
	}
	
}
