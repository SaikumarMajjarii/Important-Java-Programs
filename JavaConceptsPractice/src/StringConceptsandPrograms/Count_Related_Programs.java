package StringConceptsandPrograms;

import java.util.HashMap;
import java.util.Map;

public class Count_Related_Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Count of Words
		String Input = "Java is Good Boy";
		
		String[] Splitinput = Input.split(" ");
		
		//System.out.println(Splitinput.length);
		//Total No of occurences of given Character based on Character input
		
		String Sentence = "Hello World";
		
		char Charcter = 'l';
		int Lbefore = Sentence.length();
		//System.out.println(Lbefore);
		int LAfter = Sentence.replace("l", "").length();
		
		//System.out.println("The Repeated  Character  came " + (Lbefore - LAfter));
		
		
		
		
		//another Way for  occurences of given Character based on Character input
		
		String Word  = "Hello World";
		
		char SearchWord = 'l';
		int RepeatedWord =0;
		
		for(int i =0;i<Word.length();i++)
		{
			
		
				if(Word.charAt(i)==SearchWord)
				{
						RepeatedWord++;
		
				}
	
		}
		
		
		System.out.println(RepeatedWord);
		
		
		
		//Using HashMap
		
		String input = "aaaabbAAAAcccddd";
		  char search = 'a';             // Character to search is 'a'.
		  
		  HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
		  
		  for(int i=0;i<input.length();i++)
		  {
		      if(hash.containsKey(input.charAt(i)))
		      {
		      hash.put(input.charAt(i), hash.get(input.charAt(i))+1);
		      }
		      
		      else
		      {
		    	  hash.put(input.charAt(i), 1);
		      }
		  }
		  
		  int result = hash.get(search);
		  
		  System.out.println("The Character '"+search+"' appears "+result+" times.");
		
	
	}

}
