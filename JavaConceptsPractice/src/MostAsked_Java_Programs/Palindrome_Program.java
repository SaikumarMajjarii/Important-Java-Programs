package MostAsked_Java_Programs;

public class Palindrome_Program {

	
	
	public static void FindPalindrome(int Number)	
	{
		
		int VerifyPalin = Number;
		int Reverse =0;
		while(Number !=0)
		{	
			Reverse = Reverse*10 + Number%10;		
			Number = Number/10;	
		}
		
		
		if(Reverse== VerifyPalin)
		{
			
			System.out.print(" The Given Number : " + Reverse +" is Palindrome ");
		
		}
		
			else
				System.out.print(" The Given Number : " + Reverse +" is  not Palindrome ");
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPalindrome(124);
		
	}

}
