// contrato Autenticavbel
	//quem assinar esse contrato, precisa implementar
		//metodo setSenha
		//metodo autenticar
public abstract interface Autenticavel{

	
	public abstract boolean autentica(int senha);
	
	public abstract void setSenha(int senha);

}
