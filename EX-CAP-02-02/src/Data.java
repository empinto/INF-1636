
public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int d, int m, int a){
		dia = d;
		mes = m;
		ano = a;
	}
	
	public int get (int e){
		switch(e){
		case 1:
			return dia;
		case 2:
			return mes;
		case 3:
			return ano;
		default:
			return -1;
		}
	}
	
	public String getString(){
		return Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(ano);
	}
}
