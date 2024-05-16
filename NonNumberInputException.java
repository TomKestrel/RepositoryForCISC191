/**
 * Lead Author: 
 * Wootark Kim (github username will say Tom Kestrel)
 * 
 * References:
 * For a total list of references, refer to the top notes in the "FinalProjectMainPage.java" file
 * 
 * Responsibilities of class:
 * The custom NonNumberInoutException class
 */

public class NonNumberInputException extends Exception // NonNumberInputException IS-A Exception
{
	public NonNumberInputException(String message)
	{
		super(message);
	}
}
