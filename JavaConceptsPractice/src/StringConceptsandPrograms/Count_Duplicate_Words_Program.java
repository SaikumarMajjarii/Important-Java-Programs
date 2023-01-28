package StringConceptsandPrograms;

public class Count_Duplicate_Words_Program {

	
	
	public static void FindDuplicates(String Input)
	{
		
			String[] InputChar = Input.toLowerCase().split(" ");
				
			for(int i=0;i<InputChar.length;i++)
			{
				int RepeatedWord=1;
				for(int j =i+1;j<InputChar.length;j++)
				{
					
					if(InputChar[i]!=" "&& InputChar[j]!=" ") 
					{
						
				
						if(InputChar[i].equalsIgnoreCase(InputChar[j]))
						{
								RepeatedWord++;
								
								InputChar[j]="0";						
						}	
						
						}
	
				}
				if(RepeatedWord >=1 && InputChar[i]!="0" &&InputChar[i]!=" ") 
				{
					
				
					System.out.println("The Character " +InputChar[i] + " Repeated " + RepeatedWord);
				}
				
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindDuplicates("Sai is a good boy a Sai when it it");
		
	}

}
