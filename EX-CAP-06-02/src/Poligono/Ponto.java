package Poligono;

public class Ponto {
	private double x, y;
	
	public Ponto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double dist(Ponto p){
		return Math.sqrt( Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2) );
	}
}
