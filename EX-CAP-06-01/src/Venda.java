
public class Venda {
	private Produto[] lstProd = new Produto[100];
	private int qtdProd[] = new int[100];
	private int qtdItens = 0;
	
	public void setProd(Produto p, int qtd) {
		lstProd[qtdItens] = p;
		qtdProd[qtdItens] = qtd;
		
		qtdItens++;
	}
	
	public double valorTotal() {
		double valorTotal = 0.0;
		
		for(int cont = 0; cont < qtdItens; cont++){
			valorTotal += qtdProd[cont] * lstProd[cont].getPrecoUnit();
		}
		
		return valorTotal;
	}
}
