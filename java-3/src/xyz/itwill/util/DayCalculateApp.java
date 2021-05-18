package xyz.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//Ű����� ��������� �Է¹޾� ���ñ��� ��ƿ� ��¥(��)�� ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//ex) ������� �Է�[ex.2000-01-01] >> 2021-05-16
//    [���]�¾�� 1�� �������ϴ�.
// => ���Ŀ� ���� ���� ��������� �Է��� ��� ���� �޼��� ��� �� ���α׷� ����
public class DayCalculateApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		
		Date birthday=null;
		System.out.print("������� �Է�[ex.2000-01-01] >> ");
		try {
			//�Էµ� ���ڿ��� Date �ν��Ͻ��� ��ȯ�Ͽ� ����
			// => ���Ͽ� ���� ���� ���ڿ��� �Է��� ��� ParseException �߻�
			birthday=dateFormat.parse(scanner.nextLine());
		} catch (ParseException e) {
			System.out.println("[����]��������� ���Ŀ� �°� �Է��� �ּ���.");
			System.exit(0);
		} finally {
			scanner.close();
		}
		
		//��ƿ� ��¥�� ����Ͽ� ���
		long day=(System.currentTimeMillis()-birthday.getTime())/(1000*60*60*24);
		
		System.out.println("[���]�¾�� "+day+"���� �������ϴ�.");
		
	}
}




