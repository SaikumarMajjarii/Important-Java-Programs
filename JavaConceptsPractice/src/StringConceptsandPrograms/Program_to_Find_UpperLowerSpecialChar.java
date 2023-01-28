package StringConceptsandPrograms;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Program_to_Find_UpperLowerSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetCharacterCount("Saikumar1837*&%##");
	}

	
	
	public static void GetCharacterCount(String Input)
	{
		int Digits=0;
		int UppperCaseLetters =0;
		int SpecialChars =0;
		int LowerCaseLetters =0;
		
		
		char[] AllChar = Input.toCharArray();
		
		
		for(char ch : AllChar)
		{
			if(Character.isUpperCase(ch))
			{
				UppperCaseLetters++;
				
			}
			else if(Character.isLowerCase(ch))
			{
				LowerCaseLetters++;
				
			}
			else if(Character.isDigit(ch))
			{
				Digits++;
				
			}
			
			else
			{
				SpecialChars++;
				
			}
		}
		
		
		double UpperCasePercentage = (UppperCaseLetters *100.0)/Input.length();
		double LowerCasePercentage = (LowerCaseLetters *100.0)/Input.length();
		double DigitsCasePercentage = (Digits *100.0)/Input.length();
		double SpecialCharPercentage = (SpecialChars *100.0)/Input.length();
		
		
	    DecimalFormat decformatter = new DecimalFormat("0.00");
	    
		System.out.println(" The Percentage of Upper Case : "+decformatter.format(UpperCasePercentage));
		System.out.println(" The Percentage of Lower Case : "+decformatter.format(LowerCasePercentage));
		System.out.println(" The Percentage of Digits Case : "+decformatter.format(DigitsCasePercentage));
		System.out.println(" The Percentage of Special Characters Case :"+decformatter.format(SpecialCharPercentage));
		
		int  Percent =  (int) (UpperCasePercentage+LowerCasePercentage+DigitsCasePercentage+SpecialCharPercentage);
		if(Percent == 100)
		{
			System.out.println(" The Total percentage is equal to "+ Percent);
		}
		
		
	}
}
