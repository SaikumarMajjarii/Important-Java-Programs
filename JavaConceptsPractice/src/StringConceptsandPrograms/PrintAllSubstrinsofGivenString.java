package StringConceptsandPrograms;

public class PrintAllSubstrinsofGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String InputString = "CAT";
		
		
		
		for(int i=0;i<InputString.length();i++)
		{
			
			String Combinations="";
			
			for(int j=i;j<InputString.length();j++)
			{
				
				Combinations+=InputString.charAt(j);
				
				System.out.println(Combinations);
				//System.out.println(InputString.substring(i, j));
				
				
				
			}
			
			System.out.println("-------------------");
			
		}

	}

}
