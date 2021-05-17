package xyz.itwill.util;

import java.util.Date;

//java.util.Date : ��¥�� �ð������� �����ϱ� ���� Ŭ����
public class DateApp {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//Date Ŭ������ �Ű������� ���� �����ڷ� �ν��Ͻ��� �����ϸ� �ý����� ���� ��¥��
		//�ð������� �ν��Ͻ��� ���� 
		Date now=new Date();
		
		//Date.toString() : Date �ν��Ͻ��� ����� ��¥�� �ð������� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		//System.out.println("now.toString() = "+now.toString());
		System.out.println("now = "+now);//toString() �޼ҵ� �ڵ� ȣ��
		
		String[] day={"��","��","ȭ","��","��","��","��"};
		String printDate=(now.getYear()+1900)+"�� "+(now.getMonth()+1)+"�� "
				+now.getDate()+"�� "+day[now.getDay()]+"���� ";
		//now.getMonth()+1 => 0~11�������� ��� �Ǳ� ������ +1�� �Ͽ� 1~12������ ��µȴ�.
		System.out.println("���� = "+printDate);
		
		//Date.getTime() : Date �ν��Ͻ��� ����� ��¥�� �ð������� long type�� ������
		//(TimeStamp)���� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�  
		//Ÿ�� ������(TimeStamp) : 1970�� 01�� 01�Ϻ��� 1ms���� 1�� ������ ������
		// => ��¥�� �ð������� ���������� ǥ���Ͽ� �����ϱ� ���� ���
		//long nowTime=now.getTime();
		
		//System.currentTimeMillis() : �ý����� ���� ��¥�� �ð������� ���� Ÿ�� �������� ��ȯ
		long nowTime=System.currentTimeMillis();
		System.out.println("nowTime = "+nowTime);
		
		Date wantDate=new Date(100, 0, 1);//2000�� 1�� 1�� 0�� 0�� 0�� 
		System.out.println("wantDate = "+wantDate);
		
		long wantTime=wantDate.getTime();
		
		System.out.println("������(��) = "+((nowTime-wantTime)/1000));
	}
}
