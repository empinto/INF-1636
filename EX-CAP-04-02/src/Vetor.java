
public class Vetor {
	private double x, y;    
	
	public Vetor(double x, double y) {   
		this.x = x;   
		this.y = y;
	}    
	
	private Vetor() {  }    
	
	public Vetor clone() {  
		Vetor clone = new Vetor();
		
		clone.x = x;
		clone.y = y;
		
		return clone;
	}
	
	public String toString() {  
		return "(" + String.format("%.2f", x) + " , " + String.format("%.2f", y) + ")";
	}
}
