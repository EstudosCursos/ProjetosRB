
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337,24226);
		
		//conta está inconsistente
		//conta.setAgencia(-50);
		//conta.setNumero(-100);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1232123);
		
		Conta conta2 = new Conta(1337, 24227);
		System.out.println(conta.getAgencia());
		
		System.out.println("Total:" + Conta.getTotal());
		
	}
}
