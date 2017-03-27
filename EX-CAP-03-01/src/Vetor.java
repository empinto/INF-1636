
public class Vetor {
	// Variáveis
	private double x;
	private double y;
	
	public Vetor(){
		x = 0.0;
		y = 0.0;
	}
	
	public Vetor(double x) { 
		this.x = x;
		y = 0.0;
	}
	
	public Vetor(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	{
		exibe();
	}
	
	public void soma(Vetor v2) {
		x += v2.x;
		y += v2.y;
	}
	
	public void exibe() {
		System.out.println("x = " + x + "; y = " + y);
	}
}
