package br.com.bytebank.banco.test.util;

//import java.awt.List;
//import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.Vector;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {
	
	public static void main(String[] args) {
		
		LinkedList <Conta>lista = new LinkedList<Conta>();
		//List<Conta> lista = new Vector<Conta>();//thread safe
		//List<Conta> lista = new ArrayList<Conta>();//thread safe
		LinkedList <String>nome = new LinkedList<String>();
		
		Conta cc = new ContaCorrente(22,11);
		lista.add(cc);
		
//		Cliente cliente = new Cliente();
//		lista.add(cliente);
		
		Conta cc2 = new ContaCorrente(22,22);
		lista.add(cc2);
		
		System.out.println(lista.size());
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		 for(int i = 0; i < lista.size(); i++) {
	            Object oRef = lista.get(i);
	            System.out.println(oRef);
	        }

	        System.out.println("----------");

	        for(Object oRef : lista) {
	            System.out.println(oRef);
	        }
		System.out.println("Tamanho :" + lista.size());
	}

}
