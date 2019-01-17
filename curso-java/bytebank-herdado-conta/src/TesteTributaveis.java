
public class TesteTributaveis {
	public static void main(String[] args) {
		
	ContaCorrente c1 = new ContaCorrente(01,0001);
	c1.deposita(100.0);
	
	SeguroDeVida sg = new SeguroDeVida();
	
	CalculadorDeImposto calc = new CalculadorDeImposto();
	calc.registra(c1);
	calc.registra(sg);
	
	System.out.println(calc.getImposto());
	}
	
}
