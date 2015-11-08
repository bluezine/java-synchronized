package kr.co.bluezine;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		Account account = new Account("Bluezine", 100000);
		ArrayList<People> people = new ArrayList<People>();
		for (int i=0;i<20;i++) {
			people.add(new People(account, "People" + i, -10000));
		}
		for (People p : people) {
			p.start();
		}
	}
}