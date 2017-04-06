import Lista.*;

public class EX0402 {

	public static void main(String[] args) {
		Vetor vetor1 = new Vetor(7, 9);
		Vetor vetor2 = new Vetor(2, 12);
		Vetor vetor3 = new Vetor(20, 23);
		Vetor vetor4 = new Vetor(8, 18);
		Vetor vetor5 = new Vetor(9, 2);
		
		Lista lst = new Lista();
		lst.insIni(vetor1);
		lst.insFin(vetor2);
		lst.insIni(vetor3);
		lst.insFin(vetor4);
		lst.insIni(vetor5);
		
		lst.posIni();
		
		Vetor v = (Vetor)lst.prox();
		while(v != null){
			System.out.println(v.toString());
			v = (Vetor)lst.prox();
		} 
	}

}
