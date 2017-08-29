package com.zgwang.behavior.observer;

public interface Subject {
	public void add(Observer o);
	
	public void del(Observer o);
	
	public void notifyObservers();
	
	public void operation();
}
