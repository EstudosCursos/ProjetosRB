package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {
	
	/**
	 * Array simples Array[]
	 * @param args
	 */
	public static void main(String[] args) {
		int []idades = new int[6];
		
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 32;
//		idades[3] = 02;
//		idades[4] = 22;
//		idades[5] = 12;
//		
//		int idade4 = idades[4];
//		
//		System.out.println(idade4);
//		System.out.println(idades.length);
		
		for(int i =0; i < idades.length; i++){
			idades[i] = i*i;
		}
		for(int i =0; i < idades.length; i++){
			System.out.println(idades[i]);
		}
//		
	}

}
