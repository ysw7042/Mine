package xyz.itwill.thread;

public class SingleThread {
	public void display() {
		/*
		System.out.println("SingleThread Ŭ������ display() �޼ҵ� ����");

		System.out.println("["+Thread.currentThread().getName()
				+"] �����忡 ���� display() �޼ҵ��� ��� ����");
		
		System.out.println("SingleThread Ŭ������ display() �޼ҵ� ����");
		*/
		
		for(char i='a';i<='z';i++) {
			System.out.print(i);
		}
	}
}
