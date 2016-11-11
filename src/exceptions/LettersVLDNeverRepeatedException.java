package exceptions;

@SuppressWarnings("serial")
public class LettersVLDNeverRepeatedException extends Exception {
	public LettersVLDNeverRepeatedException(){
		super("input non valido, le lettere V L e D non possono ripetersi");
	}
}
