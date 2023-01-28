package StringConceptsandPrograms;

public class First_Repeated_And_NonRepeated_Char {	
	public static void GetFstandNonRepeated(String Input)
	{
		
		char  FstRepeated =' ';
		char NonRepeated = ' ';
		
		char[] CharInputs = Input.toCharArray();
		for(int i = 0;i<CharInputs.length;i++)
		{
			
				if(CharInputs[i]!= ' ')
				{
					
					if(Input.indexOf(CharInputs[i]) == Input.lastIndexOf(CharInputs[i])) 
					{					
						NonRepeated=CharInputs[i];
						
					}
					else
					{
						FstRepeated=CharInputs[i];
						
					}
					
					if(NonRepeated!=' ' && FstRepeated!=' ')
					
					{
						
						break;
					}
				}
			
			
			
		}
		
		System.out.println("The Fst Repeated Character is " + FstRepeated);
		System.out.println("The First Non Repeated Character is " + NonRepeated);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GetFstandNonRepeated("Saikumar");
		
		
	}

}
