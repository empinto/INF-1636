import java.util.*;

public class EX0705 {

	public static void main(String[] args) {
		Sala[] ls = new Sala[1];
		
		Scanner e = new Scanner(System.in);
		
		int s;
		String lugar;
		boolean resp;
		
		ls[0] = new Sala(1);
		
		System.out.println("Informe a sala: ");
		s = e.nextInt();
		
		if (s != ls[0].getNum())
		{
			System.out.println("Sala Inexistente");
			
			e.close();
			return;
		}
		
		System.out.println("Informe o lugar: ");
		lugar = e.next();
		
		resp = ls[0].reserva(lugar);
		
		if (resp)
			System.out.println("Reserva Efetuada");
		else
			System.out.println("Reserva Não Efetuada");
		
		e.close();
	}
}
