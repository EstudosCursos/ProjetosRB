
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 0;
		boolean acompanhado = quantidadePessoas >=2;
		
		if(quantidadePessoas >=2){
			acompanhado = true;
		}else{
			acompanhado = false;
		}
		System.out.println("O Valor de acompanhado �: " + acompanhado);
		
		if (idade >= 18 && acompanhado){
			System.out.println("Seja Bem vindo");
		}else{
				System.out.println("infelizmente voc� n�o pode entrar");
		}

	}
}