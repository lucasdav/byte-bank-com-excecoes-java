package byteBankComExcecaoApp;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	// static torna o atributo da classe e não mais do objeto
	private static int total;
	
	//abaixo um construtor inicia os atributos na própria construção
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("o total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta " + this.numero);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente > Saldo: " + this.saldo + ", Valor requisitado: " + valor);
		} 
		this.saldo -= valor;
		
	}
	
	public void transfere(double valor, Conta destino) {
		this.saque(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) throws ErroNumeroContaExceptionChecked {
		if(numero <= 0) {
			throw new ErroNumeroContaExceptionChecked("nao pode valor menor igual a 0");	
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}
		
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
