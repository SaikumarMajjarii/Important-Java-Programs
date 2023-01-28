package StringConceptsandPrograms;

public class Max_Length_Of_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 MaxLenthofWord("Hello how are you Rajuu");

	}

	
	
	public static void MaxLenthofWord(String Input) {

		int count = 0;
		String[] SplitString = Input.split(" ");
		
		String MaxlenthWord = SplitString[0];
		
		
		
		for (int i = 0; i < SplitString.length; i++) {

			
			//or MaxlenthWord.length() < SplitString[i].length()
			  if (SplitString[i].length()>MaxlenthWord.length())
			  {
				  MaxlenthWord = SplitString[i];
				  
			  }

		}
	
		
		System.out.println(MaxlenthWord);
	}
	


	
}