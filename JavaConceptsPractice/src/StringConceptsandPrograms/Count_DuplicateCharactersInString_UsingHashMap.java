package StringConceptsandPrograms;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Count_DuplicateCharactersInString_UsingHashMap {

	
	
	
	public static void FindDuplicatesUsingHashmap(String Input)	
	{
		
		
		
		char[] Charvalues = Input.toLowerCase().toCharArray();
		//char[] Charvalues = Input.toCharArray();
		if(Input.length()==1)
		{
			
			System.out.println("The String Consists of a Single value");
		}
		
		
		if(Input.isEmpty())
		{
			System.out.println("The String is Empty");
			
		}
		
		HashMap<Character,Integer> CoDu = new HashMap<Character,Integer>();
		
		for(int i=0;i<Charvalues.length;i++)
		{
			
			char word = Charvalues[i];
			if(Charvalues[i]!=' ')
			{
				
				if(CoDu.containsKey(word))
				{
					
					CoDu.put(word, CoDu.get(word)+1);
					
				}
				else
				{
					
					CoDu.put(word,1);
				}
				
			}	
		}
		
		
		  for (Map.Entry<Character, Integer> entry : CoDu.entrySet()) 
		  {
			  
			  if(entry.getValue()>=1)
			  {
			
				  System.out.println(entry.getKey()+" "+entry.getValue());
			  }
			 
			  
		  }
	       
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		FindDuplicatesUsingHashmap("Ss");

	}

}
