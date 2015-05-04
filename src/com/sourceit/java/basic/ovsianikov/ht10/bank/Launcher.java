package com.sourceit.java.basic.ovsianikov.ht10.bank;

public class Launcher {

	public static void main(String[] args) {

		Client client1 = new Client();
		Client client2 = new Client();

		client1.createBankAcc();
		client2.createBankAcc();
		
		int sizeMoney = 100;

		System.out.println("Client1 get credit - " + sizeMoney + "$\nSaldo = " + client1.getMoney(sizeMoney) + "$");
		
		sizeMoney = 150;
		System.out.println("Client1 put " + sizeMoney + "$\nSaldo = " + client1.putMoney(sizeMoney) + "$");

		System.out.println("Client1 saldo = " + client1.getSaldo() + "$");
		System.out.println("Client2 saldo = " + client2.getSaldo() + "$");
		
		sizeMoney = 20;

		client1.sendMoney(client1, client2, sizeMoney);
		System.out.println("Client1 sent " + sizeMoney + "$ to Client2");
		
		System.out.println("Client1 saldo = " + client1.getSaldo() + "$");
		System.out.println("Client2 saldo = " + client2.getSaldo() + "$");
		
		client2.getMoney(10);
		System.out.println("Client2 get " + sizeMoney + "$");
		

		System.out.println("Client1 saldo = " + client1.getSaldo() + "$");
		System.out.println("Client2 saldo = " + client2.getSaldo() + "$");

	}

}
