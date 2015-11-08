package kr.co.bluezine;

public class People extends Thread {
	Account account;
	String name;
	int money;
	
	public People(Account account, String name, int money) {
		this.account = account;
		this.name = name;
		this.money = money;
	}

	@Override
	public void run() {
		account.move(name, money);
	}
}
