import exceptions.LettersRepeatedMoreThen3TimesException;
import exceptions.LettersVLDNeverRepeatedException;
import exceptions.SubstractionNotPermittedException;

public class RomanNumerals {
	
	public void convertToInteger(String romanNum) throws LettersRepeatedMoreThen3TimesException, LettersVLDNeverRepeatedException, SubstractionNotPermittedException {
		respected1stRule(romanNum);
		respected2ndRule(romanNum);
		respected3rdRule(romanNum);
		
	}
	
	public void respected1stRule(String romanNum) throws LettersRepeatedMoreThen3TimesException{
		//dichiarazione variabili
		char[] charVector = new char[romanNum.length()];
		int numI = 0, numX = 0, numC = 0, numM = 0;
		charVector = romanNum.toCharArray();
		
		//contatore delle lettere
		for(int i = 0;i<charVector.length;i++){
			switch(charVector[i]){
			case 'I':
				numI++;
				break;
			case 'X':
				numX++;
				break;
			case 'C':
				numC++;
				break;
			case 'M':
				numM++;
			}
		}
		if(numI > 3 || numX > 3 || numC > 3 || numM > 3){
			throw new LettersRepeatedMoreThen3TimesException();
		}
	}
	
	public void respected2ndRule(String romanNum) throws LettersVLDNeverRepeatedException{
		char[] charVector = new char[romanNum.length()];
		int numV = 0, numL = 0, numD = 0;
		charVector = romanNum.toCharArray();
		
		for(int i=0; i<charVector.length; i++){
			switch(charVector[i]){
			case 'V':
				numV++;
				break;
			case 'L':
				numL++;
				break;
			case 'D':
				numD++;
				break;
			}
		}
		if(numV>1 || numL>1 || numD>1){
			throw new LettersVLDNeverRepeatedException();
		}
	}
	
	public void respected3rdRule(String romanNum) throws SubstractionNotPermittedException{
		char[] charVector = new char[romanNum.length()];
		charVector = romanNum.toCharArray();
		
		for(int i=0; i<charVector.length-1; i++){
			switch(charVector[i]){
			case 'I':
				if(charVector[i+1] == 'L' || charVector[i+1] == 'C' || charVector[i+1] == 'D' || charVector[i+1] == 'M'){
					throw new SubstractionNotPermittedException();
				}
				break;
			case 'X':
				if(charVector[i+1] == 'D' || charVector[i+1] == 'M'){
					throw new SubstractionNotPermittedException();
				}
				break;
			}
		}
	}
	
	public void respected4rdRule(String romanNum) throws SubstractionNotPermittedException {
		char[] charVector = new char[romanNum.length()];
		charVector = romanNum.toCharArray();
		
		for(int i=0; i<charVector.length; i++){
			switch(charVector[i]){
			case 'I':
				break;
			case 'V':
				break;
			case 'X':
				break;
			case 'L':
				break;
			case 'C':
				break;
			case 'D':
				break;
			case 'M':
				break;
			}
		}
	}
}


