package br.com.unionfintech.gestao;

public abstract class Conta {
	
	private double saldo;
	private int agencia;
    private int numero;
    private static int total = 0;
		
	
    
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	this.agencia = agencia;
    	this.numero = numero;
    }

    public abstract void deposito(double valor);
    
    public void saque(double valor) {
    	if(this.saldo < valor) {
    		
    	}
    	this.saldo -= valor;
    }
    
    public void tranferencia(double valor, Conta destino) {
    	this.saque(valor);
    	destino.deposito(valor);
    }
    
    
    
    
    
}
