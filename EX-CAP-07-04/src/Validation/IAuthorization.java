package Validation;

public interface IAuthorization {
	int getCode();
	String getPsw();
	void incorrectAttempts();
	int getNumberIncorrectAttempts();
}
