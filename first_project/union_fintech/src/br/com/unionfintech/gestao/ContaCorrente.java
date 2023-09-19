package br.com.unionfintech.gestao;

public class ContaCorrente extends Conta{
	
	
	
	public ContaCorrente () {}
	
	
	public ContaCorrente (int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saque(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saque(valorASacar);
	}

	@Override
	public void deposito(double valor) {
        super.saldo += valor;
    }

	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}
	
}
