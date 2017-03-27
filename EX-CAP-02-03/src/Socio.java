
public class Socio {
	private String nome;
	private String endereco;
	private String dataNascimento;
	private int matricula;
	
	public Socio(int x) {
		matricula = x;
	}
	
	public String getMatric() {
		int digitoValidador, codigoMatricula;
		
		digitoValidador = matricula % 10;
		codigoMatricula = matricula / 10;
		
		return Integer.toString(codigoMatricula) + "-" + Integer.toString(digitoValidador);
		
	}
}
