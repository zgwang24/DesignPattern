package com.zgwang.behavior.visitor;

public interface Subject {
	public void accept(Visitor visitor);
	public String getSubject();
}
