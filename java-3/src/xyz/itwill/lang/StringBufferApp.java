package xyz.itwill.lang;

//StringBuffer : ���ڿ��� �����ϱ� ���� Ŭ����
// => ����� ���ڿ��� ���ڸ� ���� ��ȯ�ϴ� �޼ҵ� ����
public class StringBufferApp {
	public static void main(String[] args) {
		//StringBuffer Ŭ������ new �����ڷ� �����ڸ� ȣ���Ͽ� �ν��Ͻ� ����
		StringBuffer sb=new StringBuffer("ABC");
		
		//StringBuffer.toString() : StringBuffer �ν��Ͻ��� ����� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		System.out.println("sb.toString() = "+sb.toString());
		System.out.println("sb = "+sb);
		
		//StringBuffer �ν��Ͻ��� String �ν��Ͻ��� ��ȯ�޾� ����
		String str=sb.toString(); 
		System.out.println("str ="+str);
		System.out.println("===================================================");
		
		//StringBuffer.append(Object o) : ���ް��� ����� ���ڿ��� �߰��ϴ� �޼ҵ� //���� ���̾��δ�.
		// => String �ν��Ͻ��� ����� ���ڿ��� += �����ڸ� ����� ȿ���� ����
		sb.append("DEF");
		System.out.println("sb = "+sb);//.append�� ������ ���ڿ��� �߰��ϴ� �޼ҵ� 
		System.out.println("===================================================");
		
		//StringBuffer.insert(int offset, Object o) : ����� ���ڿ����� ���ϴ� ��ġ(index)�� 
		//���ް��� �����ϴ� �޼ҵ�		
		sb.insert(4, "X"); //4��° index�� �ڸ��� "X"�� �߰�
		System.out.println("sb = "+sb);
		System.out.println("===================================================");
		
		//StringBuffer.deleteCharAt(int index) : ����� ���ڿ����� ���ϴ� ��ġ(index)��
		//���ڸ� �����ϴ� �޼ҵ�
		sb.deleteCharAt(2);//
		System.out.println("sb = "+sb);
		System.out.println("===================================================");
		
		//StringBuffer.delete(int start,int end) : ����� ���ڿ����� ���ϴ� ����(start ����
		//����, end ���� ������)�� ���ڵ��� �����ϴ� �޼ҵ�
		sb.delete(4, 6);//4��°�� 6��° �ڸ� ���� 
		System.out.println("sb = "+sb);
		System.out.println("===================================================");
		
		//StringBuffer.reverse(): ����� ���ڿ��� ���ڸ� �ݴ�� �ٲپ� �����ϴ� �޼ҵ�
		sb.reverse();//�ݴ�� �ٲ۴�
		System.out.println("sb = "+sb);
		System.out.println("===================================================");
	}
}
