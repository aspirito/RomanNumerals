package exceptions;

@SuppressWarnings("serial")
public class SubstractionNotPermittedException extends Exception {
	public SubstractionNotPermittedException(){
		super("input non valido. Le uniche sottrazioni valide sono : 'IV' , 'IX' --- 'XL' , 'XC' --- 'CD' and 'CM'.");
	}
}
