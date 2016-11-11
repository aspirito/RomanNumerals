import org.junit.Before;
import org.junit.Test;

import exceptions.LettersRepeatedMoreThen3TimesException;
import exceptions.LettersVLDNeverRepeatedException;
import exceptions.SubstractionNotPermittedException;

public class TestRomanNumerals {
	RomanNumerals romanNum;
	
	@Before
	public void setUp(){
		romanNum = new RomanNumerals();
	}
	@Test (expected = LettersRepeatedMoreThen3TimesException.class)
	public void throwsCorrectExceptionWithMoreThan3LettersIXCM() throws LettersRepeatedMoreThen3TimesException, LettersVLDNeverRepeatedException, SubstractionNotPermittedException {
		romanNum.convertToInteger("IIIIXM");
	}
	@Test (expected = LettersVLDNeverRepeatedException.class)
	public void throwsCorrectExceptionWhenVLDAreRepeated() throws LettersVLDNeverRepeatedException, LettersRepeatedMoreThen3TimesException, SubstractionNotPermittedException{
		romanNum.convertToInteger("IVVLDL");
	}
	@Test (expected = SubstractionNotPermittedException.class)
	public void throwsCorrectExceptionIfSubtractionNotPermitted() throws LettersVLDNeverRepeatedException, LettersRepeatedMoreThen3TimesException, SubstractionNotPermittedException{
		romanNum.convertToInteger("MMCIL");
	}

}
