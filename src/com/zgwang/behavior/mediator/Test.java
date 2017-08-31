package com.zgwang.behavior.mediator;
/**
 * 降低类与类之间的耦合，有利于功能的扩展和维护，有点像Spring容器的作用。
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
