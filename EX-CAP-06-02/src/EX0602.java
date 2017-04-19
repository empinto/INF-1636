import java.util.Scanner;
import Poligono.*;

public class EX0602 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		
		System.out.println("Informe as coordenadas (x, y) do 1� ponto da diagonal: ");
		x1 = s.nextDouble();
		y1 = s.nextDouble();
		
		System.out.println("Informe as coordenadas (x, y) do 2� ponto da diagonal: ");
		x2 = s.nextDouble();
		y2 = s.nextDouble();
		
		Retangulo ret = Retangulo.create(new Ponto(x1, y1), new Ponto(x2, y2));
		if (ret == null)
			System.out.println("Pontos inv�lidos");
		else
			System.out.println("Tipo: " + ret.tipo());
		
		s.close();
	}

}
