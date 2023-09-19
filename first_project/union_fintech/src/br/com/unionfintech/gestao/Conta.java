package br.com.unionfintech.gestao;

public abstract class Conta {
	
	protected double saldo;
	private int agencia;
    private int numero;
    private static int total = 0;
		
    public Conta() {}
    
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	this.agencia = agencia;
    	this.numero = numero;
    }

    public abstract void deposito(double valor);
    
    public void saque(double valor) throws SaldoInsuficienteException {
    	if(this.saldo < valor) {
    		
    	}
    	this.saldo -= valor;
    }
    
    public void tranferencia(double valor, Conta destino) throws SaldoInsuficienteException  {
    	this.saque(valor);
    	destino.deposito(valor);
    }
    
    
    @Override
   	public String toString() {
   		return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
   	}

}
