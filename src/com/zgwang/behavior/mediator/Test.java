package com.zgwang.behavior.mediator;
/**
 * ����������֮�����ϣ������ڹ��ܵ���չ��ά�����е���Spring���������á�
 * @author zgwang
 *
 */
public class Test {
	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
