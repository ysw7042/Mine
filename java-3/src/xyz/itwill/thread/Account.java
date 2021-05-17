package xyz.itwill.thread;

//�����������(�ܾ�)�� �����ϱ� ���� Ŭ����
public class Account {
	private int balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//�Ա� ó�� �޼ҵ� - �Ա��ڿ� �Աݾ��� ���޹޾� ó��
	//synchronized : �����忡 ���� ����ȭ ó�� �޼ҵ�� �����ϱ� ���� ������
	public synchronized void deposit(String name, int amount) {
		balance+=amount;
		System.out.println("[�Ա�]"+name+"���� "+amount+"���� �Ա��Ͽ� �ܾ��� "+balance+"���Դϴ�.");
	}
	
	//��� ó�� �޼ҵ� - ����ڿ� ��ݾ��� ���޹޾� ó��
	public void withDraw(String name, int amount) {
		if(balance<amount) {
			System.out.println("[����]"+name+"��, �ܾ��� "+balance+"�� ���� "+amount+"���� ����� �� �����ϴ�.");
			return;
		}
		balance-=amount;
		System.out.println("[���]"+name+"�Կ��� "+amount+"���� ����Ͽ� �ܾ��� "+balance+"���Դϴ�.");
	}
	
}









