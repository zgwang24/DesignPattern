package com.zgwang.behavior.memento;

public class Test {
	public static void main(String[] args) {
		Original o = new Original("egg");
		
		Storage s = new Storage(o.createMemento());
		
		System.out.println("��ʼ��״̬��" + o.getValue());
		o.setValue("abb");
		System.out.println("�޸ĺ�״̬��" + o.getValue());
		
		o.restoreMemento(s.getMemento());
		System.out.println("�ָ���״̬��" + o.getValue());
		
	}
}
