package Validation;

import Security.DBAuthorization;

public class Checker {
	int maxTentativa = 3;
	
	public boolean check(int cod, String psw) {
		IAuthorization autorizacao = DBAuthorization.getAuthorization(cod);
		if (autorizacao == null)
			return false;
		
		if (!autorizacao.getPsw().equals(psw)) {
			autorizacao.incorrectAttempts();
			return false;
		}
		
		if (autorizacao.getNumberIncorrectAttempts() >= maxTentativa)
			return false;
		
		return true;
	}
}
