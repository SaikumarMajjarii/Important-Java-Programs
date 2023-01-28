package MostAsked_Java_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueELementsHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// create Integer type arraylist
		

	
		
		int[] ArrayInput = {4,5,5,5,4,6,6,9,4};
		
		
		 Set<Integer> UniqueValue  = new HashSet<Integer>();
		 HashMap<Integer,Integer> CountValues  = new HashMap<Integer,Integer>();
		
		for(int EachValue : ArrayInput)
		{		
			if(CountValues.containsKey(EachValue))
			{			
				CountValues.put(EachValue,CountValues.get(EachValue)+1);				
			}
			
			else
			{
				
				CountValues.put(EachValue,1);
			}		
		}
		
		for(Entry<Integer, Integer> entry: CountValues.entrySet()) {
			
			
			if( entry.getValue() ==1)
			{
					System.out.println(entry.getKey() + " with Value "+ entry.getValue());
			}
            
           
        }
		
	
	}

}
