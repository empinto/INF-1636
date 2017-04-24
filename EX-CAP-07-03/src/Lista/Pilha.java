package Lista;

public class Pilha extends Lista implements IPilha {
	
	public void push(Object x) {
		insIni(x);
	}
	
	public Object pop() {
		return retIni();
	}
}
