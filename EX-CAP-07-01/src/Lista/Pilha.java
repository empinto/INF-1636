package Lista;

public class Pilha {
	Lista ls = new Lista();
	
	public boolean push(Object x) {
		return ls.insIni(x);
	}
	
	public Object pop() {
		return ls.retIni();
	}
	
	public boolean vazio() {
		return ls.vazio();
	}
}
