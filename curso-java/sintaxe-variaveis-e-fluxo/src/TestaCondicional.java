
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 10;
		int quantidadePessoas = 3;
		if (idade >= 18){
			System.out.println("voc� tem mais de 18 anos");
			System.out.println("Seja Bem vindo");
		}else{
			if(quantidadePessoas >=2){
				System.out.println("voce nao tem 18 anos, mas pode entrar," + 
			"pois est� acompanhado");
			
			}else{
				System.out.println("infelizmente voc� n�o pode entrar");
			}
			
		}
	}
}
