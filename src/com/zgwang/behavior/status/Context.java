package com.zgwang.behavior.status;

public class Context {
	private Status status;
	
	public Context(Status status){
		this.setStatus(status);
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void method(){
		if(status.getValue().equals("status1")){
			status.method1();
		}else if(status.getValue().equals("status2")){
			status.method2();
		}
	}
}
