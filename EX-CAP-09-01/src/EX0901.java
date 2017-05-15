import erro.SalarioZerado;
import erro.SalarioZeradoPF;
import erro.SalarioZeradoPJ;

public class EX0901
{
	public static void main(String[] args)
	{
		Contribuinte []lst;
		
		lst=Contribuinte.listaContr();
		
		System.out.printf("NOME                       IMPOSTO\n");
		System.out.printf("====================       =======\n\n");
		
		for(Contribuinte c:lst)
		{
			try {
				System.out.printf("%-20s     %9.2f\n",c.getNome(),c.calcImposto());
			}
			catch(SalarioZerado ex)
			{
				if (ex.getClass().equals(SalarioZeradoPF.class))
					System.out.println("Salario de Pessoa Fisica zerado. CPF: " + ex.getMessage());
				else if (ex.getClass().equals(SalarioZeradoPJ.class))
					System.out.println("Salario de Pessoa Juridica zerado. CNPJ: " + ex.getMessage());
				else
					System.out.println(ex.getMessage());
			}
		}
	}
}
