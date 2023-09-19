package br.com.unionfintech.gestao;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca() {}
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposito(double valor) {
		super.saldo += valor;
		
	}

	
	@Override
	public String toString() {
		return "ContaPoupanca, " + super.toString();
	}
	
	

}
