package com.zgwang.behavior.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject{
	
	private Vector<Observer> vector = new Vector<Observer>();
	
	public void add(Observer observer){
		vector.add(observer);
	}
	
	public void del(Observer observer){
		vector.remove(observer);
	}
	
	public void notifyObservers(){
		Enumeration<Observer> nums = vector.elements();
		while(nums.hasMoreElements()){
			nums.nextElement().update();
		}
	}
}
