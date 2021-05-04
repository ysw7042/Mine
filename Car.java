package oop;

//�ڵ����� ǥ���ϱ� ���� Ŭ����(�ڷ���)
public class Car {
	//�ʵ�(Field) : ǥ���� ��� ���� �Ӽ� ���� - �Ӽ��� ���� 
	// => Ŭ������ ����� ��� �޼ҵ忡�� �ʵ忡 �����Ͽ� ��� ����
	String aliasName;//�̸�(��Ī) - ������
	boolean engineStatus;//��������(�õ�����) - false : off, true : on
	int currentSpeed;//����ӵ�
	
	//������(Constructor) : ��ü(�ν��Ͻ�)�� �����ϱ� ���� Ư���� �޼ҵ�
	// => �ϳ��� �����ڵ� �������� ������ �Ű������� ���� �⺻ �����ڰ� �����ϴ� ������ ó���ȴ�. 
	
	//�޼ҵ�(Method) : ǥ�� ��� ���� ���� ����   
	// => �ʵ带 �̿��Ͽ� ǥ�� ����� ������ ������� �ۼ��� ������� ���� 
	
	// �ڵ��� �õ��� �Ѵ� ������ ǥ���� �޼ҵ�
	void startEngine() {
		engineStatus=true;
		System.out.println(aliasName+"�� �õ��� �׽��ϴ�.");
	}
 	
	// �ڵ��� �õ��� ���� ������ ǥ���� �޼ҵ�
	void stopEngine() {
		engineStatus=false;
		System.out.println(aliasName+"�� �õ��� �����ϴ�.");
	}
	
	//�ڵ��� �ӵ��� �����ϴ� ������ ǥ���� �޼ҵ� 
	void speedUp(int speed) {
		currentSpeed+=speed; //currentSpeed �� ����ӵ� speed�� ���� ������ ��ŭ �ӵ��� �����Ѵ�. 
		System.out.println(aliasName+"�� �ӵ��� "+speed
				+"Km/h ���� �Ǿ����ϴ�. ���� �ӵ��� "+currentSpeed+"Km/h �Դϴ�.");
	}
	
	//�ڵ��� �ӵ��� �����ϴ� ������ ǥ���� �޼ҵ�
	void speedDown(int speed) {
		currentSpeed-=speed; //currentSpeed �� ����ӵ� speed�� ���� ������ ��ŭ �ӵ��� �����Ѵ�. 
		System.out.println(aliasName+"�� �ӵ��� "+speed
				+"Km/h ���� �Ǿ����ϴ�. ���� �ӵ��� "+currentSpeed+"Km/h �Դϴ�.");
	}
	
	//�ڵ����� ���ߴ� ������ ǥ���� �޼ҵ� 
	void sppedZero() {
		currentSpeed=0;
		System.out.println(aliasName+"�� �ڵ����� ������ϴ�.");
	}
	
}









