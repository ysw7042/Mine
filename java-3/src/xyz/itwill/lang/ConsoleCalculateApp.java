package xyz.itwill.lang;

import java.util.Scanner;

//Ű����� ������� �Է¹޾� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
//ex) ����� �Է� >> 20 + 10
//    [���]30
// => �Է� ����Ŀ��� ��� ������ �����ڴ� ��Ģ ������(*,/,+,-)�� ���
// => ���Ŀ� ���� ���� ������� �Էµ� ��� ���� �޼��� ��� �� ���α׷� ����
// => �Է� ����Ŀ� ������ �Է� ���� �ϵ��� ó��
public class ConsoleCalculateApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("����� �Է� >> ");
		//�Է� ����Ŀ� �����ϴ� ��� ���� �����Ͽ� ����
		String operation=scanner.nextLine().replace(" ", "");
		
		scanner.close();
		
		//����Ŀ��� �˻��� �����ڸ� ������ �迭 ����
		String[] operatorArray={"*","/","+","-"};
		
		//����Ŀ� �����ڸ� �˻��Ͽ� �������� ������ġ(index)�� ��ȯ�޾� ����
		int index=-1;
		for(String str:operatorArray) {
			//String.lastIndexOf(String s) : String �ν��Ͻ��� ����� ���ڿ����� �˻�
			//���ڿ��� �ں��� �˻��Ͽ� ������ġ�� ��ȯ�ϴ� �޼ҵ�
			index=operation.lastIndexOf(str);
			
			//����Ŀ��� �����ڰ� �˻��� ��� �ݺ��� ����
			if(index!=-1) break;
		}
		
		//����Ŀ� �����ڰ� ���ų� �������� ��ġ�� �߸��� ��� ���α׷� ����
		if(index<=0 || index>=operation.length()-1) {
			System.out.println("[����]������� �߸� �Է� �Ͽ����ϴ�.");
			System.exit(0);//���α׷� ���� �޼ҵ�
		}
		
		try {
			//����Ŀ��� �����ڿ� �ǿ����ڸ� �и��Ͽ� ����
			int num1=Integer.parseInt(operation.substring(0, index));
			String operator=operation.substring(index, index+1);
			int num2=Integer.parseInt(operation.substring(index+1));
			
			//�����ڿ� ���� ���� ����� ����
			int result=0;
			switch (operator) {
			case "*": result=num1*num2; break;
			case "/": result=num1/num2; break;
			case "+": result=num1+num2; break;
			case "-": result=num1-num2; break;
			}
			
			//���� ����� ���
			System.out.println("[���]"+result);
		} catch (NumberFormatException e) {
			System.out.println("[����]����Ŀ� ���ڰ� �ƴ� ���ڰ� �Է� �Ǿ����ϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("[����]0���� ���� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("[����]����ġ ���� ������ �߻� �Ͽ����ϴ�.");
		}
	}
}













