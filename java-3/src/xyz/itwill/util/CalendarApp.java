package xyz.itwill.util;

import java.util.Calendar;

//java.util.Calendar : ��¥�� �ð������� �����ϱ� ���� Ŭ����
public class CalendarApp {
	public static void main(String[] args) {
		//Calendar.getInstance() : �ý����� ���� ��¥�� �ð������� ������ Calendar 
		//�ν��Ͻ��� ��ȯ�ϴ� �޼ҵ� 
		Calendar now=Calendar.getInstance();//�̱��� Ŭ����
		
		//Calendar.toString() : Calendar �ν��Ͻ��� ����� ��¥�� �ð������� ���ڿ��� 
		//��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		//System.out.println("now.toString() = "+now.toString());
		System.out.println("now = " + now);
		
		String[] day={"��","��","ȭ","��","��","��","��"};
		//Calendar.get(int field) : Calendar �ν��Ͻ��� ����� ���� �� ����� �����Ͽ�
		//���ϴ� ���� ��ȯ�ϴ� �޼ҵ�
		String printDate=now.get(Calendar.YEAR)+"�� "+(now.get(Calendar.MONTH)+1)+"�� "
			+now.get(Calendar.DATE)+"�� "+day[now.get(Calendar.DAY_OF_WEEK)-1]+"����";
		
		System.out.println("���� = "+printDate);
	}
}
