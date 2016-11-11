package exceptions;

@SuppressWarnings("serial")
public class LettersRepeatedMoreThen3TimesException extends Exception {
	public LettersRepeatedMoreThen3TimesException(){
		super("Input non valido. 'I', 'X', 'C' e'M' non possono essere ripetute per più di 3 volte");
	}
}
