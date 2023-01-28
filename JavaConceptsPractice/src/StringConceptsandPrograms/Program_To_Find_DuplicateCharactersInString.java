package StringConceptsandPrograms;

public class Program_To_Find_DuplicateCharactersInString {

	public static void FindDuplicates(String Input)
	{
		
			char[] InputChar = Input.toLowerCase().toCharArray();
				
			for(int i=0;i<InputChar.length;i++)
			{
				int RepeatedWord=1;
				for(int j =i+1;j<InputChar.length;j++)
				{
					
					if(InputChar[i]!= ' '&& InputChar[j]!=' ') 
					{
						
				
						if(InputChar[i]== InputChar[j])
						{
								RepeatedWord++;
								
								InputChar[j]='0';
						}
						
				   }
					
					
				}
			
				
				if(RepeatedWord >1 && InputChar[i]!='0' &&InputChar[i]!=' ') 
				{
					
				
					System.out.println("The Character " +InputChar[i] + " Repeated " + RepeatedWord);
				}
				
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FindDuplicates("Saikumar Majjari is a goodboy");
		FindDuplicates("SSSS");

	}

}
