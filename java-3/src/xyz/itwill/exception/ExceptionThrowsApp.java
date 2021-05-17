package xyz.itwill.exception;

public class ExceptionThrowsApp {
	//�޼ҵ��� ��� ����� �߻��Ǵ� ���ܸ� throws Ű����� ����
	// => ���ܸ� �����ϴ� �޼ҵ带 ȣ���ϸ� ���� �߻�
	public static void display() throws ArrayIndexOutOfBoundsException {
		int[] array= {10,20,30,40,50};
		
		//����(ArrayIndexOutOfBoundsException) �߻� ��� 		
		for(int i=0;i<=array.length;i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}
	}
	
	public static void main(String[] args) {
		try {
			//static �޼ҵ�� Ŭ������ �̿��Ͽ� ȣ��
			//ExceptionThrowsApp.display();
			
			//���� Ŭ������ static �޼ҵ�� Ŭ������ �����Ͽ� ȣ�� ����
			//ArrayIndexOutOfBoundsException�� �����ϴ� �޼ҵ� ȣ�� -���� �߻� >> ���� ó��
			display();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("[����]���α׷� ���࿡ ����ġ ���� ������ �߻��Ǿ����ϴ�.");
		}
	}
}
