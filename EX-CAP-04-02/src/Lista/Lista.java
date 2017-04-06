package Lista;

public class Lista {
	private int tam = 0;  
	private No ini = null;  
	private No fin = null;  
	private No corr = null;
	
	public boolean vazio() {   
		return tam == 0;  
	}  
	
	public boolean insIni(Object x) {   
		No novoNo = new No(x, null);
		
		if (vazio())
			fin = novoNo;
		
		novoNo.setProx(ini);
		ini = novoNo;
		corr = novoNo;
		tam++;
		
		return novoNo != null;
	}  
	
	public boolean insFin(Object x) {   
		if (vazio())
			return insIni(x);
		
		No novoNo = new No(x, null);
		
		fin.setProx(novoNo);
		fin = novoNo;
		corr = novoNo;
		tam++;
		
		return novoNo != null;  
	}  
	
	public Object retIni()  {   
		if (vazio())
			return null;
		
		No noAux = ini.getProx();
		if (noAux == null)
			return null;
		
		if (ini.equals(corr))
			corr = noAux;
		
		ini = noAux;
		
		tam--;
		
		return noAux.getElem();
	}
	
	public Object retFin()  {   
		if (vazio())
			return null;
		
		No noAux = ini;
		if (noAux == null)
			return null;
				
		while (!noAux.equals(fin)) {
			noAux = noAux.getProx();
		}
		
		noAux.setProx(null);
		
		if (fin.equals(corr))
			corr = noAux;
		
		fin = noAux;
		
		tam--;
		
		return noAux.getElem();
	}  
	
	public void posIni() {   
		if (vazio()) {
			corr = null;
			return;
		}
		
		corr = ini;
	}
	
	public Object prox() {   
		if (corr == null)
			return null;
		
		No noRetorno = corr;
		
		corr = corr.getProx();
		
		return noRetorno.getElem();
	}
}
