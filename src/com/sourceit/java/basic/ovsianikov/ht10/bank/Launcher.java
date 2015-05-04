package com.sourceit.java.basic.ovsianikov.ht10.bank;

public class Launcher {

	public static void main(String[] args) {

		Client client1 = new Client();
		Client client2 = new Client();

		client1.createBankAcc();
		client2.createBankAcc();

		int creditSizeMoney = 100;
		System.out.println("Client1 get credit - " + creditSizeMoney
				+ "$\nSaldo = " + client1.getMoney(creditSizeMoney) + "$");

		int putSizeMoney = 150;
		System.out.println("Client1 put " + putSizeMoney + "$\nSaldo = "
				+ client1.putMoney(putSizeMoney) + "$");

		System.out.println("Client1 saldo = " + client1.getSaldo() + "$");
		System.out.println("Client2 saldo = " + client2.getSaldo() + "$");

		int sendSizeMoney = 20;
		client1.sendMoney(client1, client2, sendSizeMoney);
		System.out.println("Client1 sent " + sendSizeMoney + "$ to Client2");

		System.out.println("Client1 saldo = " + client1.getSaldo() + "$");
		System.out.println("Client2 saldo = " + client2.getSaldo() + "$");

		int getSizeMoney = 5;
		client2.getMoney(getSizeMoney);
		System.out.println("Client2 get " + getSizeMoney + "$");

		System.out.println("Client1 saldo = " + client1.getSaldo() + "$");
		System.out.println("Client2 saldo = " + client2.getSaldo() + "$");

	}
}
