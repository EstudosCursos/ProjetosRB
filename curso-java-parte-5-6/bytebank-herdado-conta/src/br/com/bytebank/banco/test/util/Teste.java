package br.com.bytebank.banco.test.util;
	
	import java.util.ArrayList;
	import java.util.List;
	
public class Teste {
	
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29;
		
		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int valor = idadeRef.intValue();
		String s = args[0]; //"10"
		//Integer numero = new Integer(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing
		
		
	}

}
