package xyz.itwill.util;

import java.util.Random;
import java.util.Scanner;

//���ھ߱����� : ��������(0~9)�� 3�� �����޾� Ű����� �Է��� ���ߴ� ����
// ������ �Է°��� 3���� ���������� ���� Ʋ���� 0���� ���� �Ұ���
// => ������ �Է°��� ���Ͽ� ������ �������� ������ �� ��ġ�� ������ ��Ʈ����ũ �ٸ��� ���� ���
// => ��Ʈ����ũ�� 3���� ���� �޼��� ��� �� ���α׷��� �����ϰ� �ƴϸ� ��Ʈ����ũ�� ���� ������ ���
// => �Է±�ȸ�� 15���� �����ϸ� ������ ���� ��� ����(����) ���
// => �Է°��� ���Ŀ� ���� ���� ��� ���Է�(�Է�Ƚ�� ������)
public class BaseballApp {
	public static void main(String[] args) {
		Random random=new Random();
		
		//0~9 ������ ������ 3���� �����ϱ� ���� �迭 ����
		int[] asw=new int[3];
		
		
		//��Ģ�� �´� �������� �迭 ��ҿ� ����ǵ��� ó���ϴ� �ݺ���
		while(true) {
			for(int i=0;i<=asw.length;i++) {
				asw[i]=random.nextInt(10);//0~9
			}
			
			if(asw[0]!=0 && asw[0]!=asw[1] && asw[1]!=asw[2] && asw[2]!=asw[0]) break;
		}
		
		Scanner sc=new Scanner(System.in);
		
		//���� ���� ���������� �����ϱ� ���� ����
		boolean result=false;
		
		//�Է� ��ȸ ������ ���� �ݺ��� >> �Է¿� ���� ��� ��� 
		for(int cnt=1;cnt<=15;cnt++) {
			//��Ʈ����ũ�� ���� ������ �����ϱ� ���� ���� ����
			int strike=0,ball=0;
			
			//0~9 ������ �Է°� 3���� �����ϱ� ���� �迭 ����
			int[] num=new int[3];
			
			//��Ģ�� �´� �������� �迭 ��ҿ� ����ǵ��� ó���ϴ� �ݺ���
			loop:
			while(true) {
				System.out.print(cnt+"��° �Է� >> ");
				String input=sc.nextLine();//������ ���ֱ� ���ؼ� ���ڿ��� ���� �޴´�.
				
				if(input.length()!=3) {
					System.out.println("[����]3�ڸ��� ���ڸ� �Է� �����մϴ�.");
					continue;
				}
				
				for(int i=0;i<num.length;i++) {
					//�Է°�(���ڿ�)�� �迭�� ��ҿ� ���� - ���� ó��
					//charater Code - '0':48 ~ '9':57
					//ex) '4'-'0' == 52-48 = 4 >> ���ڰ��� ���������� ��ȯ
					num[i]=input.charAt(i)-'0';
					
					if(num[i]<0 || num[i]>9) {
						System.out.println("[����]���ڸ� �Է� �����մϴ�.");
						continue loop;
					}
				}
				
				if(num[0]!=0 && num[0]!=num[1] && num[1]!=num[2] && num[2]!=num[0]) break;
				
				System.out.println("[����]0���� ���۵ǰų� �ߺ��� ���ڰ� �����մϴ�.");
			}
			
			//�������� �Է°��� ���Ͽ� ��Ʈ����ũ�� ���� ����ϴ� �ݺ���  
			for(int i=0;i<asw.length;i++) {//�������� ���� �迭 ����� ÷�� 
				for(int j=0;j<num.length;j++) {//�Է°��� ���� �迭 ����� ÷�� 
				if(asw[i]==num[j]) {//���� �迭�� ��Ұ��� �Է� �迭�� ��Ұ��� ���� ���
					if(i==j) {//���� �迭�� ÷�ڿ� �Է� �迭�� ÷�ڰ� ���� ��� 
							strike++;
						}else {
							ball++;
						}
					}
				}
			}
			if(strike==3) {
				System.out.println("[�޼���]�����մϴ�."+cnt+"������ ������ϴ�.");
				result=true;
				break;
			}
			
			System.out.println("[���]"+strike+"��Ʈ����ũ "+ball+"��");
		}//�Է� ��ȸ�� ���� �ݺ���
		
		if(!result) {//������ ������ ���� ���
			String temp="";
			for(int su:asw) {
				temp+=su;
			}
			System.out.println("[�޼���]������ �� ���豺��.�ٺ�! ������ ["+temp+"]�Դϴ�.");
		}
		sc.close();
	}
}
