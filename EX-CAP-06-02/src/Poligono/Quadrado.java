package Poligono;

public class Quadrado extends Retangulo {
	
	Quadrado(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
		super(p1, p2, p3, p4);
	}
	
	public double perimetro() {
		return super.perimetro();
	}
	
	public String tipo() {
		return "Quadrado";
	}
}
