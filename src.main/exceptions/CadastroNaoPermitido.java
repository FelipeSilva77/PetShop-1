package exceptions;

public class CadastroNaoPermitido extends Exception{
	
	public CadastroNaoPermitido() {
		super("O limite de cadastros foi atingido ou esse n�mero de cadastro j� existe.");
	}
}
