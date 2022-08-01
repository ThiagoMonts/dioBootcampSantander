
public class main {

	public static void main(String[] args) {
		Cliente thiago = new Cliente();
		thiago.setNome("Thiago");
		
		Conta cc = new ContaCorrente(thiago);
		Conta poupanca = new ContaPoupanca(thiago);

		cc.depositar(1000);
		cc.transferir(500, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}