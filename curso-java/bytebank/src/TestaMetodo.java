
public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(150);
		System.out.println(conta.saldo);
		boolean conseguiuRetirar = conta.saca(350);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
	
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(1000, conta);
		System.out.println(contaDaMarcela.saldo);	
		System.out.println(conta.saldo);
		
	}
}
