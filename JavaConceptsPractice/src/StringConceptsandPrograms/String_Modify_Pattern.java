package StringConceptsandPrograms;

public class String_Modify_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String BModify = "This is a test String";
			
			
			String AModify="";
			String[] SplitString = BModify.split(" ");
			
			int Count = 0;
			for(int i =0;i<SplitString.length;i++)
			{
				
				Count++;
				if(Count%2==0)
				{
					
					for (int j = SplitString[i].length() - 1; j >= 0; j--)

					{

						 AModify += SplitString[i].charAt(j);

					}
				
				}
				else
				{
					
					AModify+=SplitString[i].toUpperCase();
					
				}
				
				if(i!=SplitString.length-1)
				{
					AModify+=" ";
					
				}
				
				
			}
			
		
			
			
		System.out.println(AModify);
			
			
	}

}
