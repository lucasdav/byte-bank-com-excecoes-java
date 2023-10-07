package byteBankComExcecaoApp;

public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 12345);
		conta.deposita(100);
		try {
			conta.saque(101);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}
}
