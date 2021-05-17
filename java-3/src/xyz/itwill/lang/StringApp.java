package xyz.itwill.lang;

//String : ���ڿ��� �����ϱ� ���� Ŭ����
// => ���ڿ��� ������ �� �ִ� ��� ���� - ����� ���ڿ��� ��ȯ�ϴ� �޼ҵ� ������
// => ���������� String �ν��Ͻ��� ���ڿ��� byte �迭�� ��ҿ� ���ڷ� ����Ǿ� ó��
public class StringApp {
	public static void main(String[] args) {
		//" " ��ȣ�� �̿��Ͽ� String �ν��Ͻ� ǥ�� ����
		String str1="ABC";//String �ν��Ͻ� ����
		
		//String.toString() : String �ν��Ͻ��� ����� ���ڿ��� ��ȯ�ϴ� �޼ҵ� 
		System.out.println("str1.toString() = "+str1.toString());
		//���������� ����� ��� �ڵ����� toString() �޼ҵ� ȣ��
		System.out.println("str1 = "+str1);
		System.out.println("============================================================");
		//" " ��ȣ�� �̿��Ͽ� String �ν��Ͻ��� ǥ���� ��� ������ ���ڿ��� ������ 
		//�ν��Ͻ��� �����ϸ� ���� �ν��Ͻ��� ����
		String str2="ABC";//���� �ν��Ͻ� ����
		
		//���������� ���迬���ڷ� ���� ��� ���������� ����� �ν��Ͻ��� �ؽ��ڵ�(HashCode)��
		//���Ͽ� ��� ����
		// => String �ν��Ͻ��� ����� ���ڿ��� ���ϴ� ���� �ƴ϶� �ν��Ͻ��� ��ġ�� ��
		// => ���迬���ڷ� String �ν��Ͻ��� ����� ���ڿ� �� �Ұ���
		if(str1==str2) {
			System.out.println("str1�� str2�� ����� �ν��Ͻ��� �ؽ��ڵ尡 �����ϴ�.");
		} else {
			System.out.println("str1�� str2�� ����� �ν��Ͻ��� �ؽ��ڵ尡 �ٸ��ϴ�.");
		}
		System.out.println("============================================================");
		//new �����ڷ� �����ڸ� ȣ���Ͽ� �ν��Ͻ��� �����ϸ� ������ ���ο� �ν��Ͻ� ����
		String str3=new String("ABC");
		
		if(str1==str3) {
			System.out.println("str1�� str3�� ����� �ν��Ͻ��� �ؽ��ڵ尡 �����ϴ�.");
		} else {
			System.out.println("str1�� str3�� ����� �ν��Ͻ��� �ؽ��ڵ尡 �ٸ��ϴ�.");
		}
		System.out.println("============================================================");
		//String.equals(String s) : ����� ���ڿ��� ���޹��� ���ڿ��� ���� ���Ͽ� �ٸ���
		//false�� ��ȯ�ϰ� ������ true�� ��ȯ�ϴ� �޼ҵ�
		if(str1.equals(str3)) {
			System.out.println("str1�� str3�� ����� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("str1�� str3�� ����� ���ڿ��� �ٸ��ϴ�.");
		}
		System.out.println("============================================================");
		String str4="abc";
		//equals() �޼ҵ�� ��ҹ��ڸ� �����Ͽ� �� ��� ��ȯ
		if(str1.equals(str4)) {
			System.out.println("str1�� str4�� ����� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("str1�� str4�� ����� ���ڿ��� �ٸ��ϴ�.");
		}
		System.out.println("============================================================");
		//String.equalsIgnoreCase(String s) : ����� ���ڿ��� ���޹��� ���ڿ��� ��ҹ���
		//���о��� ���� ���Ͽ� �ٸ��� false�� ��ȯ�ϰ� ������ true�� ��ȯ�ϴ� �޼ҵ�
		if(str1.equalsIgnoreCase(str4)) {
			System.out.println("str1�� str4�� ����� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("str1�� str4�� ����� ���ڿ��� �ٸ��ϴ�.");
		}
		System.out.println("============================================================");
		//String.compareTo(String s) : ����� ���ڿ��� ���޹��� ���ڿ��� ���Ͽ� �����
		//���ڿ��� ũ�� ����� ��ȯ�ϰ� ������ 0�� ��ȯ�ϰ� ���޹��� (�Ű�����)���ڿ��� ũ��
		//������ ��ȯ�ϴ� �޼ҵ� - ��ҹ��� ���� 
		//String.compareToIgnoreCase(String s) : ���о��� ���Ͽ� �ٸ��� false ������ true
		if(str1.compareTo(str4)>0) {
			System.out.println("str1�� ����� ���ڿ��� str4�� ����� ���ڿ����� Ů�ϴ�." );
		} else if(str1.compareTo(str4)==0){
			System.out.println("str1�� ����� ���ڿ��� str4�� ����� ���ڿ��� �����ϴ�." );
		} else {
			System.out.println("str1�� ����� ���ڿ��� str4�� ����� ���ڿ����� �۽��ϴ�." );
		}
		System.out.println("============================================================");
		//���ڿ��� ���������� byte �迭�� ����ǹǷ� ÷��(Index)�� �̿��Ͽ� ó���ϴ� �޼ҵ� ����
		String str5="ABCDEFG";
		
		//String.length() : ����� ���ڿ��� ���� ������ ��ȯ�ϴ� �޼ҵ�
		System.out.println("���ڿ��� ���� ���� = "+str5.length());
		System.out.println("============================================================");
		//String.charAt(int index) : ���޹��� ÷�� ��ġ�� ���ڸ� ��ȯ�ϴ� �޼ҵ�
		//IndexOutOfBoundsException ���� ������ ����� ������ �߻��� �� ���� 
		System.out.println("���ڿ��� �ι�° ��ġ�� ���� = " + str5.charAt(1));
		System.out.println("============================================================");
		//String.indexOf(String str) : ���޵� ���ڿ��� �˻��Ͽ� ����� ��ġ�� ����÷�ڸ� ��ȯ�ϴ� �޼ҵ� 
		// => �˻� ���ڿ��� ���� ��� -1 ��ȯ
		System.out.println("A ���ڿ��� ���� ��ġ(Index) = "+str5.indexOf("A"));
		System.out.println("EFG ���ڿ��� ���� ��ġ(Index) = "+str5.indexOf("EFG"));
		System.out.println("X ���ڿ��� ���� ��ġ(Index) = "+str5.indexOf("X"));
		System.out.println("============================================================");
		String str6 ="Java Programming";
		
		System.out.println("str6 = "+str6);
		//String.toUpperCase() : ����� ���ڿ��� ��� �빮�ڷ� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("str6(�빮��) = "+str6.toUpperCase());
		//String.toLowerCase() : ����� ���ڿ��� ��� �ҹ��ڷ� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("str6(�ҹ���) = "+str6.toLowerCase());
		System.out.println("============================================================");
		String str7 = "   ȫ�浿    ";
		System.out.println("�Էµ� �̸��� ["+str7+"]�Դϴ�.");
		//String.trim() : ����� ���ڿ��� �հ� �ڿ� �����ϴ� ��� ������ �����Ͽ� ��ȯ�ϴ� �޼ҵ�(�߰��� ������ ���� ���� ����) 
		System.out.println("�Էµ� �̸��� ["+str7.trim()+"]�Դϴ�.");
		System.out.println("============================================================");
		String str8 = "  ��  ��  ��  ";
		
		System.out.println("�Էµ� �̸��� ["+str8+"]�Դϴ�.");
		//String.replace(String regEx, String replacement) : ����� ���ڿ����� �˻� ���ڿ�
		//(����ǥ����)�� ã�� ġȯ ���ڿ��� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("�Էµ� �̸��� ["+str8.replace(" ", "").replace("��", "��")+"]�Դϴ�.");
		System.out.println("============================================================");
		String str9 = "010-1234-5678";
		System.out.println("��ȭ��ȣ = "+str9);
		
		//String.split(String regEx) : ����� ���ڿ��� ���޹��� ���� ���ڿ�(����ǥ����)��
		//�и��Ͽ� ���ڿ� �迭�� ��ȯ�ϴ� �޼ҵ�
		// => ����ǥ������ ��Ÿ���ڴ� \\�� �̿��Ͽ� Escape ���ڷ� ǥ��
		String[] array = str9.split("-");
		//String[] array = str9.split("\\*");
		
		System.out.println("��ȭ��ȣ �պκ� = "+array[0]);
		System.out.println("��ȭ��ȣ �߰��κ� = "+array[1]);
		System.out.println("��ȭ��ȣ �޺κ� = "+array[2]);
		System.out.println("============================================================");
		//String.subString(int beginIndex, Integer endindex) : ����� ���ڿ����� ����÷��(����
		//����)���� ����÷��(���� ������)������ ���ڿ��� �и��Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("��ȭ��ȣ �պκ� = "+str9.substring(0, 3));
		System.out.println("��ȭ��ȣ �߰��κ� = "+str9.substring(4, 8));
		//System.out.println("��ȭ��ȣ �޺κ� = "+str9.substring(9, 13));
		//����÷�ڸ� ������ ��� ����÷���� ���ں��� ������ ���ڱ��� �и��Ͽ� ��ȯ 
		System.out.println("��ȭ��ȣ �޺κ� = "+str9.substring(9));
		System.out.println("============================================================");
		
	}
}

