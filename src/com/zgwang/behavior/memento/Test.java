package com.zgwang.behavior.memento;

public class Test {
	public static void main(String[] args) {
		Original o = new Original("egg");
		
		Storage s = new Storage(o.createMemento());
		
		System.out.println("³õÊ¼»¯×´Ì¬£º" + o.getValue());
		o.setValue("abb");
		System.out.println("ÐÞ¸Äºó×´Ì¬£º" + o.getValue());
		
		o.restoreMemento(s.getMemento());
		System.out.println("»Ö¸´ºó×´Ì¬£º" + o.getValue());
		
	}
}
