package com.zgwang.structure.facade;

public class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer(){
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}
	
	public void startUp(){
		System.out.println("computer startup");
		cpu.startUp();
		memory.startUp();
		disk.startUp();
		System.out.println("computer startup finished");
	}
	public void shutDown(){
		System.out.println("computer shutdown");
		cpu.shutDown();
		memory.shutDown();
		disk.shutDown();
		System.out.println("computer closed");
	}
}
