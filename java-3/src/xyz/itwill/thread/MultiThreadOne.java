package xyz.itwill.thread;

//Thread Ŭ������ ��ӹ��� �ڽ� Ŭ���� - �ݵ�� run() �޼ҵ� �������̵� ����
public class MultiThreadOne extends Thread {
	@Override
	public void run() {
		//���ο� ������� ����� ��� �ۼ�
		for(char i='A';i<='Z';i++) {
			System.out.print(i);
			
			//�������̵� ����� �޼ҵ�� ���� ���� �Ұ���
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
