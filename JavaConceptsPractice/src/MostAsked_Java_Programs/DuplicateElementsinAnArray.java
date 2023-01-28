package MostAsked_Java_Programs;

public class DuplicateElementsinAnArray {
	
	
	
	//BruteForce
	//hashSet
	//HashMap
	public static void AnotherWayDuplicate(String[] DuplicateArray) {
		
		
		
		for(int i=0;i<DuplicateArray.length;i++)		
		{	
			
			
			for(int j=i+1;j<DuplicateArray.length;j++)
			{
				
				if(DuplicateArray[i].equals(DuplicateArray[j]))
				{
					System.out.println(" The Duplicate Element is " +DuplicateArray[i] );
					
				}
			
		 }
		
	
		
	}
		
	}
	
	
	public static void FindDuplicate(String[] DuplicateArray) {
		
	
		for(int i=0;i<DuplicateArray.length;i++)		
		{	
			String RepeatedWord = null;
			
			for(int j=i+1;j<DuplicateArray.length;j++)
			{
				
				if(DuplicateArray[i]==DuplicateArray[j])
				{
					
					RepeatedWord= DuplicateArray[i];			
					DuplicateArray[j] = "0";
				}
	
			}
			
			if(RepeatedWord!=null && DuplicateArray[i] != "0")
			{
			System.out.println(RepeatedWord);
			}
			
		}
		
		
	
		
		
	}
	
	
	
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] DuplicateArray = {"Sai","Kumar","Priya","Sai"};
		
		//FindDuplicate(DuplicateArray);
		AnotherWayDuplicate(DuplicateArray);

	}

}
