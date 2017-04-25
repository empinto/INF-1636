
public class Lugar {
	private String cod;
	private boolean livre;
	
	public Lugar(String cod, boolean livre) {
		this.cod = cod;
		this.livre = livre;
	}
	
	public String getCod() {
		return cod;
	}
	
	public boolean getLivre() {
		return livre;
	}
	
	public void reserva() {
		if (!livre)
			return;
		
		livre = !livre;
	}
}
