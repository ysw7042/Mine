package xyz.itwill.util;

import java.util.Random;
import java.util.UUID;

//���ο� ��й�ȣ�� �����ϴ� ���α׷�
public class NewPasswordApp {
	//���ο� ��й�ȣ�� ��ȯ�ϴ� �޼ҵ�
	public static String newPasswordOne() {
		Random random=new Random();
		
		//��й�ȣ�� ���� ���ڵ��� ������ ���ڿ� ����
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String newPassword="";
		for(int i=1;i<=10;i++) {
			newPassword+=str.charAt(random.nextInt(str.length()));
			//str�� ÷��(index)�� ���������� �ް� �ٽ� �������� ��ȯ�Ͽ� ��ȯ�Ͽ� newPassword�� ����.
		}
		
		return newPassword;
	}
	
	public static String newPasswordTwo(){
		//java.util.UUID : ���������� ���Ǵ� �������� �����ϱ� ���� Ŭ���� 
		//UUID.randomUUID() : �������� ����� UUID �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ� 
		// => ������ : ���ڿ� ���ĺ� (�ҹ���),-(4��)�� 36�� ���ڵ�� ������ ���ڿ�
		//UUID.toString() : UUID �ν��Ͻ��� ����� �������� ���ڿ�(String)�� ��ȯ�ϴ� �޼ҵ�
		return UUID.randomUUID().toString().replace("-", "").substring(0, 10).toUpperCase();
	}// replace - ��ȯ,substring - �߶󳻱�,toUpperCase - �빮�ڷ� ��ȯ
	
	public static void main(String[] args) {
		System.out.println("�ӽú�й�ȣ-1 = "+newPasswordOne());
		System.out.println("�ӽú�й�ȣ-2 = "+newPasswordTwo());
	}
}
