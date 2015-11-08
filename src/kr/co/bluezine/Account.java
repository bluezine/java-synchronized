package kr.co.bluezine;

public class Account {
	String accountName;
	int money;
	
	public Account(String accountName, int initialMoney) {
		this.accountName = accountName;
		this.money = initialMoney;
	}
	
	synchronized public void move(String name, int money) {
		if (this.money + money < 0) {
			System.out.println(name + " Not Enough Money : " + accountName);
			return;
		}
		for (int i=0;i<1000000000;i++) {
			if (i==1000000)
				System.out.println(name + " Accounting...");
		}
		this.money = this.money + money;
		System.out.println(accountName + " Account Money : " + this.money);
	}
}
