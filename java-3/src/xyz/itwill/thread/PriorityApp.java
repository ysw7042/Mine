package xyz.itwill.thread;

public class PriorityApp {
	public static void main(String[] args) {
		PriorityOne one=new PriorityOne();
		PriorityTwo two=new PriorityTwo();
		
		one.setPriority(Thread.MIN_PRIORITY);//thread�� ����ó�� �켱������ �ִ��� õõ��
		two.setPriority(Thread.MAX_PRIORITY);//thread�� ����ó�� �켱������ �ִ��� ���� 
		
		one.start();
		two.start();
	}
}
