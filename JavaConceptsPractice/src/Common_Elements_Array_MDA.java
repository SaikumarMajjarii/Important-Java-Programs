import java.util.ArrayList;
import java.util.HashSet;

public class Common_Elements_Array_MDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   HashSet<Integer> Values = new HashSet<Integer>();

		int[][] MDA1 = {

				{ 1, 2, 1 }, 
				{ 9, 7, 2 }, 
				{ 7, 6, 4 }

		};

		int[][] MDA2 = {

				{ 2, 6, 8,6},

				{ 0, 1, 3,9,7}, 
				{ 7, 2, 0}

		};
		
		
		
		boolean isFound  = false ;
		for(int i =0;i<MDA1.length;i++)
		{
				
			for(int j=0;j<MDA1[i].length-1;j++)
			{
						
				int Value = MDA1[i][j];
				
					if( MDA1[i][j]!= MDA1[i][j+1])
					{
						for(int k =0; k<MDA2.length;k++)
						{				
							isFound = false;
							for(int l=0;l<MDA2[k].length;l++)
							{
								
							if(Value == MDA2[k][l])
								
							 {						
									Values.add(Value);
//									System.out.print(Value);
								  	isFound = true;
								  	break;
								  	
								  	
							 }	

								if (isFound)
								{
									
									break;
								}
								
							}
						}
				
					}
			}
			
			
			
			
		} 
		
		
		
		
		for(int Value : Values)
		{
			
			System.out.println(Value);
		}
		

		
//		System.out.println(CE);
		
//		String C1 = "Saikumar Majjari";
//		for(int s =0;s<CE.length();s++)
//		{
//			 Char CE.toCharArray()
//				
//			
//				
//			
//		}
//	
		
		
		
		
		
	}

}

//if(MDA1[i][j] == MDA2[i][j])
//{
//	
//	
//
//	
//	
//		
//		System.out.println(MDA1[i][j]);
//	}
