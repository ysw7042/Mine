package xyz.itwill.exception;

//Exception Ŭ���� ��ӹ޾� ���� Ŭ���� �ۼ�
public class PasswordMismatchException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public PasswordMismatchException() {
		// TODO Auto-generated constructor stub
	}
	
	public PasswordMismatchException(String message) {
		super(message);
	}	
}
