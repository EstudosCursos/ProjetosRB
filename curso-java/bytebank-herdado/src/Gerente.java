
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoCache autenticador;
	
	public Gerente(){
		this.autenticador = new AutenticacaoCache();
	}
	
	public double getBonificacao(){
		System.out.println("Gerente");
			return super.getSalario();
		}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); 
		}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}
		
}