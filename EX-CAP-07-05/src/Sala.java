
public class Sala {
	private int num;
	private Lugar[] lugares;
	
	public Sala(int num) {
		this.num = num;		
		
		lugares = new Lugar[4];
		lugares[0] = new Lugar("A1", true);
		lugares[1] = new Lugar("A2", true);
		lugares[2] = new Lugar("A3", false);
		lugares[3] = new Lugar("A4", false);
	}
	
	public int getNum() {
		return num;
	}
	
	public boolean reserva(String c) {
		if (lugares == null)
			return false;
		
		for (int i = 0; i < lugares.length; i++) {
			if (!lugares[i].getCod().equals(c))
				continue;
			
			if (lugares[i].getLivre()) {
				lugares[i].reserva();
				return true;
			}
		}
		
		return false;
	}
}
