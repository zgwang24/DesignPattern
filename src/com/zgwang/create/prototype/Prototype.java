package com.zgwang.create.prototype;

public class Prototype implements Cloneable{
	public Object clone(){
		Prototype proto = null;
		try {
			proto = (Prototype)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return proto;
	}
}
