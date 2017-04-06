
public class Voo {
	private Assento assentos[][];
	private int nFila;
	private int nAssentos;
	
	public Voo (int nf, int na) {
		if (nf <= 0 || na <= 0)
			return;
		
		char as;
		nFila = nf;
		nAssentos = na;
		assentos = new Assento[nFila][nAssentos];
		
		for (int i = 0; i < nf; i++) {
			for (int j = 0; j < na; j++) {
				as = (char)(j + 'A');
				assentos[i][j] = new Assento(i + 1, as);
			}
		}
	}
	
	public boolean reserva(int f, char a) {
		int pos = a - 'A';
		
		if (assentos == null || 
			assentos.length <= (f - 1) || 
			assentos[f - 1].length <= pos)
			return false;
		
		Assento assento = assentos[f - 1][pos];
		if (assento == null)
			return false;
		
		boolean condicaoRetorno = assento.getEstado();
		
		if (condicaoRetorno)
			assento.reserva();
		
		return condicaoRetorno;
	}
	
	public void imprimeMapa() {
		if (assentos == null)
			return;
		
		Assento assento;
		String estadoAssento;
		
		System.out.print("     ");
		
		for (int cont = 0; cont < nAssentos; cont++) {
			System.out.printf("%c ", (char)(cont + 'A'));
		}
		
		System.out.println();
		
		for (int i = 0; i < nFila; i++) {
			System.out.print(String.format("%02d", i + 1) + " - ");			
			
			for (int j = 0; j < nAssentos; j++) {
				assento = assentos[i][j];
				if (assento == null)
					return;
				
				estadoAssento = assento.getEstado() ? "L" : "X";
				
				System.out.print(estadoAssento + " ");
			}
			
			System.out.println();
		}
	}
}
