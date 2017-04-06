import IR.Contribuinte;
import Lista.Lista;

public class EX0502 {

	public static void main(String[] args) {
		Lista lst = Contribuinte.listaContr();
		
		lst.posIni();
		
		Contribuinte c = (Contribuinte)lst.prox();
		
		System.out.printf("NOME                       IMPOSTO\n");
		System.out.printf("====================       =======\n\n");
		
		while (c != null) {
			System.out.printf("%-20s     %9.2f\n", c.getNome(), c.calcImposto());
			
			c = (Contribuinte)lst.prox();
		}
	}
}
