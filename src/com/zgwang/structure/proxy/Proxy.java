package com.zgwang.structure.proxy;

public class Proxy implements Sourceable{
	
	private Source source;	
	
	public Proxy(){
		super();
		this.source = new Source();
	}
	
	private void before(){
		System.out.println("before proxy");
	}
	
	private void after(){
		System.out.println("after proxy");
	}
	
	@Override
	public void method() {
		before();
		source.method();
		after();
	}
	
}
