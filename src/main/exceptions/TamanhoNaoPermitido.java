package exceptions;

public class TamanhoNaoPermitido extends Exception {
	public TamanhoNaoPermitido() {
		super("N�o trabalhamos com animais desse porte.");
	}
}
