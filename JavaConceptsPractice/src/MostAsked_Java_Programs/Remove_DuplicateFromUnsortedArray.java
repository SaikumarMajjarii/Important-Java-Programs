package MostAsked_Java_Programs;

import java.util.ArrayList;

public class Remove_DuplicateFromUnsortedArray {

	
	
	
	public static  void RemoveDuplicateInteger(int[] UnsortedArray)
	{
		
		
		ArrayList<Integer> List = new ArrayList<Integer>();
		
		for(int i =0;i<UnsortedArray.length;i++)
		{
			
			
			for(int j=i+1;j<UnsortedArray.length;j++)
			{
				
				
				if(UnsortedArray[i]== UnsortedArray[j])
				{
					
					UnsortedArray[i] = -1;
				}
				
			}
			
			
			if(UnsortedArray[i]!= -1)
			{
				
				List.add(UnsortedArray[i]);
				
				
			}
			
		}
		
		System.out.println(List);
		
	}
	
	public static  void RemoveDuplicateStrings(String[] UnsortedArray)
	{
		
		
		ArrayList<String> List = new ArrayList<String>();
		
		for(int i =0;i<UnsortedArray.length;i++)
		{
			
			
			for(int j=i+1;j<UnsortedArray.length;j++)
			{
				
				
				if(UnsortedArray[i].equals(UnsortedArray[j]))
				{
					
					UnsortedArray[i] = "0";
				}
				
			}
			
			
			if(UnsortedArray[i]!= "0")
			{
				
				List.add(UnsortedArray[i]);
				
				
			}
			
		}
		
		System.out.println(List);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] UnsortedArray = {1,2,2,3,3,3,4,4};
		
		RemoveDuplicateInteger(UnsortedArray);
		
//		String[] UnsortedArrayString = {"Sai","Kumar","Kumar","Priya","Ganesh"};
//		RemoveDuplicateStrings(UnsortedArrayString);

	}

}
