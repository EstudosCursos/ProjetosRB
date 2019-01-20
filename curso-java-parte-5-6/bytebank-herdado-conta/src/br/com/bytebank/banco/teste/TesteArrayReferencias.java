package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		Object[] referencias = new Object[3];
		
		ContaCorrente cc1 = new ContaCorrente(01,1111);
		ContaPoupanca cc2 = new ContaPoupanca(02,2111);
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;

		referencias[0] = cc1;
		referencias[1] = cc2;
		
		//System.out.println(Object[1].getNumero());
		
		ContaPoupanca ref =(ContaPoupanca)referencias[1]; //type cast
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}
}
