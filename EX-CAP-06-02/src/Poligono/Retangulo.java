package Poligono;

public class Retangulo {
	protected Ponto[] vert;
	
	public static Retangulo create(Ponto p1, Ponto p3) {
		if (p1.getX() == p3.getX() || 
			p1.getY() == p3.getY())
			return null;
		
		Ponto p2 = new Ponto(p3.getX(), p1.getY());
		Ponto p4 = new Ponto(p1.getX(), p3.getY());
		
		if ((p1.getX() - p3.getX()) == (p1.getY() - p3.getY()))
			return new Quadrado(p1, p2, p3, p4);
		
		return new Retangulo(p1, p2, p3, p4);
	}
	
	Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
		vert = new Ponto[4];
		
		vert[0] = p1;
		vert[1] = p2;
		vert[2] = p3;
		vert[3] = p4;
	}
	
	public double perimetro() {
		double perimetro = 0.0;
		
		if (vert == null)
			return perimetro;
		
		perimetro += vert[0].dist(vert[1]);
		perimetro += vert[1].dist(vert[2]);
		perimetro += vert[2].dist(vert[3]);
		perimetro += vert[3].dist(vert[0]);
		
		return perimetro;
	}
	
	public String tipo() {
		return "Retângulo";
	}
}
