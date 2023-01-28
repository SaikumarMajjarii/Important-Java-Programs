import java.util.Arrays;

public class Array_ConditionBased_MDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int[][] MDA1 = {

				{ 1, 2, 1 }, 
				{ 9, 7, 2 }, 
				{ 7, 6, 4 }

		};

		int[][] MDA2 = {

				{ 1, 6, 1 },
			
				{ 0, 7, 3 }, 
				{ 1, 6, 4 }

		};
		
		int [][] NewMatrix =  new int[MDA1.length][MDA1[0].length];
		
		for(int i =0;i<MDA1.length;i++)
		{
			
			
			for(int j=0;j<MDA1[i].length;j++)
			{
				
				
				
				if(MDA1[i][j] == MDA2[i][j]) {
					
					NewMatrix[i][j] = 1;
				}
				
				else
				{
					
					NewMatrix[i][j] = 0;
				}
				
		
			}

			
	}
		
		for (int k =0;k<NewMatrix.length;k++)
		{
			System.out.println(Arrays.toString(NewMatrix[k]));
			
			
		}

	}
}
