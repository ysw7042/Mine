package xyz.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//Ű����� �������� �Է¹޾� ����� ��й�ȣ�� ���Ͽ� �񱳰���� ����ϴ� ���α׷��� �ۼ��ϼ���
public class PasswordMatchApp {
	public static void main(String[] args) {
		/*
		Scanner sc=new Scanner(System.in);
		
		System.out.print("��й�ȣ �Է� >> ");
		int password=sc.nextInt();
		
		if(password==1234) {
			System.out.println("[���]�Էµ� ��й�ȣ�� �½��ϴ�.");
		} else {
			System.out.println("[���]�Էµ� ��й�ȣ�� �ٸ��ϴ�.");
		}
		
		sc.close();
		*/
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("��й�ȣ �Է� >> ");
			int password=sc.nextInt();//InputMismatchException �߻�
			
			if(password!=1234) {//��й�ȣ�� ���� ���� ���
				//���������� ���� �ν��Ͻ��� �����Ͽ� ���� �߻� 
				// => JVM�� ���� �ڵ����� ���� ó���Ǵ� ���ܰ� �ƴϹǷ� ���� ó������ ������ ���� �߻� 
				throw new PasswordMismatchException("[���]�Էµ� ��й�ȣ�� �ٸ��ϴ�.");
			}
			
			System.out.println("[���]�Էµ� ��й�ȣ�� �½��ϴ�.");	
			
		} catch (InputMismatchException e) {
			System.out.println("[����]���ڸ� �Է� �����մϴ�.");
		} catch (PasswordMismatchException e) {
			System.out.println(e.getMessage());
		} finally {
			//��� �ڿ��� �����ϴ� ��� >> ���ܿ� ������� ������ ���� 
			sc.close();			
		}
		
	}
}
