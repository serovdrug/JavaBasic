package com.sourceit.java.basic.ovsianikov.ht10.bank;

public class Client {
	public String fName;
	public String lName;
	public int numberBankAcc;
	private int saldo;

	public int createBankAcc() {
		return numberBankAcc;
	}

	public int getMoney(int sizeMoney) {
		int _sizeMoney = sizeMoney;
		saldo = saldo - _sizeMoney;
		return saldo;
	}

	public int putMoney(int sizeMoney) {
		int _sizeMoney = sizeMoney;
		saldo = saldo + _sizeMoney;
		return saldo;
	}
	
	public void sendMoney(Client fromPerson, Client toPerson, int sizeMoney){
		int _sizeMoney = sizeMoney;
		toPerson.saldo = toPerson.saldo + _sizeMoney;
		fromPerson.saldo = fromPerson.saldo - _sizeMoney;
	}
	
	public int getSaldo(){
		return saldo;
	}

}
