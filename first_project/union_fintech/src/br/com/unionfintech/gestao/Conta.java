package br.com.unionfintech.gestao;

public abstract class Conta implements Comparable <Conta> {
	
	protected double saldo;
	private int agencia;
    private int numero;
//  private static int total;
		
    public Conta() {}
    
    public Conta(int agencia, int numero) {
//    	Conta.total++;
    	this.agencia = agencia;
    	this.numero = numero;
    }

    public void deposito(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do depósito deve ser maior que zero.");
            return;
        }
        this.saldo += valor;
    }
    
    
    public void saque(double valor) throws SaldoInsuficienteException {
    	if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente para efetuar o saque");
        }
        this.saldo -= valor;
    	
    }
    
    public void transferencia(double valor, Conta destino) throws SaldoInsuficienteException  {
    	this.saque(valor);
    	destino.deposito(valor);
    }
    
    
    @Override
   	public String toString() {
   		return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
   	}

    @Override
    public int compareTo(Conta outraConta) {
        // Comparando número da conta
        return Integer.compare(this.numero, outraConta.numero);
    }

	public int getNumero() {
		
		return numero;
	}
}
