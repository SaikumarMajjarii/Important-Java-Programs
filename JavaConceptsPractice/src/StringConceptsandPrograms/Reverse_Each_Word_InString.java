package StringConceptsandPrograms;

public class Reverse_Each_Word_InString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//One Way
		String Test = "we are in Development";
		
		String[] SplitWords = Test.split(" ");
		
		String FinalString ="";
		
		
		for(int i =0;i<SplitWords.length;i++)
		{
			
			
			String ReverseWord= ReverseEachWord(SplitWords[i]);
//			String ReverseWord="";
//			for(int j = SplitWords[i].length()-1;j>=0 ;j--)
//			{
//				
//				ReverseWord += SplitWords[i].charAt(j);
//
//			}
			
			
			if(i!=SplitWords.length-1)
			{
				FinalString+=ReverseWord +" ";
			}
			else
			{
				FinalString+=ReverseWord;
			}
		
			
		}
		
		
		System.out.println(" The Reverse Sentence is : " + FinalString );

		
		//2nd Way
		
		String SecondWay ="";
		
		for(String Reverse : SplitWords)
		{
			StringBuilder SB = new StringBuilder(Reverse);
			
			SecondWay+=SB.reverse()+" ";
		}
		
		//System.out.println(SecondWay);
		
		
		
	}
	
	public static String ReverseEachWord(String EachWord)
	{
		
		String ReverseWord="";
		for(int j = EachWord.length()-1;j>=0 ;j--)
		{
			
			ReverseWord +=EachWord.charAt(j);

		}
		
		return ReverseWord;
	}
	
	

}
