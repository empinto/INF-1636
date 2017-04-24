import java.util.*;
import Security.*;
import Validation.*;

public class EX0704 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		DBAuthorization.carregaBD();
		
		int cod;
		String psw;
		
		Checker c = new Checker();
		
		System.out.println("Digite um codigo ou -1 para encerrar: ");
		cod = s.nextInt();
		
		while(cod > 0)
		{
			System.out.println("Digite a senha: ");
			s.nextLine();
			psw = s.nextLine();
			
			if(c.check(cod, psw))
				System.out.println("Porta Aberta");
			else
				System.out.println("************");
			
			System.out.println("Digite um codigo ou -1 para encerrar: ");
			cod = s.nextInt();
		}
		
		s.close();
	}
}
