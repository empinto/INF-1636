
public class Matematica {
	public static double pi(int n){
		// aproximação de Pi com base na fórmula de Leibniz
		double pi = 4 * 1.0;
		
		if (n < 0)
			return pi;
		
		for (int cont = 1; cont <= n; cont++)
			pi += 4 * ( Math.pow(-1, cont) / ( 2 * cont + 1) );
				
		return pi;
	}
}
