package xyz.itwill.thread;

public class AccountUserApp {
	public static void main(String[] args) {
		Account account=new Account(10000);
		
		/*
		//���� �����带 �̿��Ͽ� ������� �Ա� ó�� 
		AccountUser[] users=new AccountUser[3];
		users[0]=new AccountUser(account, "ȫ�浿");
		users[1]=new AccountUser(account, "�Ӳ���");
		users[2]=new AccountUser(account, "����ġ");
		
		for(AccountUser user:users) {
			user.getAccount().deposit(user.getUserName(), 5000);
		}
		*/
		
		//���� �����带 �̿��Ͽ� ������� �Ա�(���) ó�� 
		new AccountUser(account, "ȫ�浿").start();
		new AccountUser(account, "�Ӳ���").start();
		new AccountUser(account, "����ġ").start();
	}
}