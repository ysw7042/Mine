package xyz.itwill.exception;

public class ExceptionHandleApp {
		public static void main(String[] args) {
		int[] array = {10,20,30,40,50};
		
		//���ܰ� �߻� ������ ����� try ������ �ۼ�
		// => ���ܰ� �߻��� ��� ���� ���� �ν��Ͻ� ���� 
		// => Catch �������� ���� �ν��ͽ��� ���޹޾� ���� ó�� 
		try {
			//�迭�� ��� ǥ���� ÷�ڸ� �߸� ����� ��� ArrayIndexOutOfBoundsException �߻�
			// => ArrayIndexOutOfBoundsException �߻��� ��� JVM�� ���� �ڵ����� ���� ó��
			// => JVM�� ����ó���� ���ܰ� �߻��� ��θ� ���ϰ� ǥ���Ͽ� ��� - ������ �߽�
			// => ����� �߽��� ���α׷��� �ۼ��ϱ� ���� ���� ���� ó���ϴ� ���� ����
			for(int i=0;i<=array.length;i++) {
				System.out.println("array["+i+"] = "+array[i]);
			}
			
			//���ܰ� �߻��� ��� �ϴܿ� �����ϴ� ����� �̽���
			// => ���ܰ� �߻��Ǹ� catch �������� ������(���α׷��� ���� �帧) �̵�
			System.out.println("[�޼���]���α׷��� ���������� ���� �Ǿ����ϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {//���� �ν��Ͻ��� ���޹޾� ���������� ����
			//catch ������ ������ ���� Ŭ������ ���� ���� ó�� ��� �ۼ� - �޼��� ���
			//���� ó�� ��� - �޼��� ���
			//System.out.println("[����]���α׷� ���࿡ ����ġ ���� ������ �߻��Ǿ����ϴ�.");
			
			//Throwable.getMessage() : ���� �ν��Ͻ��� ���� �޼����� ��ȯ�ϴ� �޼ҵ� 
			//System.out.println("���� �޼��� = "+e.getMessage());
			
			//Throwable.printStackTrace() : ���ܰ� �߻��� ��θ� ���ϰ� ǥ���Ͽ� ����ϴ� �޼ҵ�
			e.printStackTrace(); 
		}finally {
			//���ܿ� ������� ������ ����� ����� �ۼ��ϴ� ���� : ���� ����
			// => �ڿ��� ���� ���� ����� ������ ��� ���
			System.out.println("[�޼���]������ ����Ǵ� ��� ");
		}
	}
}
