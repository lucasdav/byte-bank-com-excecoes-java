package byteBankComExcecaoApp;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoLucas = new Conta(1234, 123245);
		contaDoLucas.deposita(50);
		
		System.out.println(contaDoLucas.getSaldo());
		
		contaDoLucas.saque(20);
		System.out.println(contaDoLucas.getSaldo());
		
		Conta contaDaMarcela = new Conta(1234, 12345);
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contaDoLucas);
		
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDoLucas.getSaldo());
		
		Cliente contaLucas = new Cliente();
		
		contaDoLucas.setTitular(contaLucas);
		System.out.println(contaDoLucas.getTitular());
	}
}
