package xyz.itwill.thread;

//���� ������ ���α׷� - main ������� �ٸ� �����带 �����Ͽ� ���ο� ��� ����
// => ��� �����尡 �Ҹ�Ǿ�߸� ���α׷� ����
public class MultiThreadApp {
	//main �޼ҵ忡�� ���޵Ǵ� ��� ���ܴ� JVM�� �ڵ����� ����ó��
	public static void main(String[] args) throws InterruptedException {
		//JVM�� ���� main ������ �ڵ� ����
		
		//Thread �ν��Ͻ��� �����Ͽ� start() �޼ҵ� ȣ��
		// => ���ο� �����带 ����� run() �޼ҵ��� ��� ����
		//Thread Ŭ������ ����� run() �޼ҵ忡�� ����� ��� ������ 
		// => �ڽ�Ŭ������ �̿��Ͽ� run() �޼ҵ带 �������̵� �����Ͽ� ����� ��� �ۼ�
		/*
		Thread thread=new Thread();
		thread.start();
		*/
		
		//Thread Ŭ������ ��ӹ��� �ڽ� Ŭ������ �ν��Ͻ� ����
		// => �ڽ� Ŭ������ �����ڷ� �ν��Ͻ��� �����Ͽ� �θ�(Thread) �ν��Ͻ��� ���� ����
		//�θ�(Thread) �ν��Ͻ��� start() �޼ҵ带 ȣ���Ͽ� ������ ����
		// => ������ ������� �ڽ� Ŭ�������� �������̵� ����� run() ��� ����
		/*
		MultiThreadOne thread=new MultiThreadOne();
		thread.start();
		*/
		//Thread �ν��Ͻ��� start() �޼ҵ�� ȣ���� �޼ҵ尡 ���� ��� �������� ���� �޼ҵ� ȣ��
		new MultiThreadOne().start();
		//�ϳ��� Thread �ν��Ͻ��� �ϳ��� �����常 ���� ����
		new MultiThreadOne().start();
		
		/*
		//Runnable �������̽��� ��ӹ��� �ڽ� Ŭ������ �ν��Ͻ� ����
		MultiThreadTwo multiThreadTwo=new MultiThreadTwo();
		//Thread Ŭ������ �ν��Ͻ� ���� 
		// => Runnable �ν��Ͻ��� ���޹޾� Thread �ν��Ͻ��� �����ϴ� ������ ȣ��
		// => run() �޼ҵ尡 �������̵� ����Ǵ� �Ͱ� ���� ȿ��
		Thread thread=new Thread(multiThreadTwo);
		//Thread �ν��Ͻ��� start() �޼ҵ� ȣ�� - ���ο� �����带 �����Ͽ� run() ��� ����
		thread.start();
		*/
		new Thread(new MultiThreadTwo()).start();
		
		/*
		for(char i='a';i<='z';i++) {
			System.out.print(i);
			
			//Thread.sleep(long ms) : ���� ����� �����ϴ� �����带 ���ϴ� �ð�(ms)���� 
			//�Ͻ� �����ϴ� �޼ҵ� 
			// => InterruptedException �߻� - ���� ó������ ���� ��� ���� �߻�
			Thread.sleep(500);
		}
		*/
		for(char i='0';i<='9';i++) {
			System.out.print(i);
			Thread.sleep(500);
		}
		
	}
}





