package IR;
import Lista.Lista;

public abstract class Contribuinte {
	protected String nome;
	protected double rendaBrt;
	
	public static Lista listaContr() {
		Lista lst = new Lista();
		
		Contribuinte c;
		
		c = new PFisica("Joao Santos", 3000.00, "11111");
		lst.insFin(c);
		c = new PJuridica("Lojas AA", 150000.00, "10055");
		lst.insFin(c);
		c = new PFisica("Maria Soares", 5000.00, "22222");
		lst.insFin(c);
		c = new PJuridica("Supermercados B", 2000000.00, "10066");
		lst.insFin(c);
		c = new PFisica("Carla Maia", 1500.00, "33333");
		lst.insFin(c);
		c = new PJuridica("Posto XX", 500000.00, "10077");
		lst.insFin(c);
		
		return lst;
	}
	
	public String getNome() {
		return nome;
	}
	
	abstract public double calcImposto();
}
