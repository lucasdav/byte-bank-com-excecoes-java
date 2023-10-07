package byteBankComExcecaoApp;

public class TestaGetESet {

	public static void main(String[] args) throws ErroNumeroContaExceptionChecked {
		Conta conta = new Conta(1223, 12345);
		try {
			conta.setNumero(0);
		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
	}
}
