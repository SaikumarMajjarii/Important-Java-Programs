package StringConceptsandPrograms;

public class Print_PalindromesFrom_a_Sentence {

	
	
	public static void FindPalindromes(String Palindrome)
	
	{
		
		String[] FindPalindromes  = Palindrome.toLowerCase().split(" ");
		
		
		for(int i=0;i<FindPalindromes.length;i++)
		{
			
			
			String Reverse ="";
			for(int j=FindPalindromes[i].length()-1;j>=0;j--)
			{
				
				Reverse += FindPalindromes[i].charAt(j);
				
			}
			
			
			
			if(Reverse.equals(FindPalindromes[i]))
			{
				System.out.println("The Palindrome Words are " +Reverse );
				
			}
	
			
			
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String FP = "My name is Nitin and i can Speak Malayalam";
		FindPalindromes(FP);

	}

}
