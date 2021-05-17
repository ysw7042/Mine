package xyz.itwill.lang;

//Wrapper : ���� ����Ÿ Ÿ���� �ڷ���(Primitive Type)�� Ŭ������ ǥ���� �ڷ���
// => Byte, Short, Integer, Long, Character, Float, Double, Boolean
public class WrapperApp {
	public static void main(String[] args) {
		/*
		int num1=100,num2=200;
		int num3=num1+num2;
		System.out.println("�հ� = "+num3);
		*/
		
		/*
		//Integer : �������� �����ϱ� ���� Ŭ����
		//�������� ����� Integer �ν��Ͻ��� �����Ͽ� ���������� ����
		Integer num1=Integer.valueOf(100);
		Integer num2=Integer.valueOf("200");
		Integer num3=Integer.valueOf(num1.intValue()+num2.intValue());
		System.out.println("�հ� = "+num3.intValue());
		*/
		
		//JDK5������ ����ڽ̰� �����ڽ� ��� �߰�
		//����ڽ�(Auto Boxing) : ���� ����Ÿ Ÿ���� ���� �ڵ����� Wrapper �ν��Ͻ��� ��ȯ�ϴ� ���
		//�����ڽ�(Auto UnBoxing) : Wrapper �ν��Ͻ��� �ڵ����� ���� ����Ÿ Ÿ���� ������ ��ȯ�ϴ� ���
		Integer num1=100,num2=200;
		Integer num3=num1+num2;
		System.out.println("�հ� = "+num3);
		System.out.println("=====================================================");
		//Integer.valueOf(String s, int radix) : Integer �ν��Ͻ��� �����Ͽ� ���޹���
		//������ ���ڿ��� ���������� �����Ͽ� ��ȯ�ϴ� �޼ҵ� 
		Integer num=Integer.valueOf("ABC", 16);//int num=0xABC;
		System.out.println("num = "+num);//�������� 10������ ���
		System.out.println("=====================================================");
		//Integer number=50;
		Integer number=-50;
		
		System.out.println("number(10����) = "+number);
		//Integer.toOctalString(int i) : ���޹��� �������� 8������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("number(8����) = "+Integer.toOctalString(number));
		//Integer.toHexString(int i) : ���޹��� �������� 16������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("number(16����) = "+Integer.toHexString(number));
		//Integer.toBinaryString(int i) : ���޹��� �������� 2������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("number(2����) = "+Integer.toBinaryString(number));
		System.out.println("=====================================================");
		String str1="100",str2="200";
		System.out.println("�հ� = "+(str1+str2));//���ڿ� ����
		
		//Integer.parseInt(String s) : ���ڿ��� ���޹޾� ���������� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => ����� ���޹��� ���ڿ��� ���������� ��ȯ���� ���� ��� NumberFormatException �߻�
		System.out.println("�հ� = "+(Integer.parseInt(str1)+Integer.parseInt(str2)));
		System.out.println("=====================================================");
		
	}
}





