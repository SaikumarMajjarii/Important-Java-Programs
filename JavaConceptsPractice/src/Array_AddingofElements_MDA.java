
public class Array_AddingofElements_MDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Sum = 0;
		
		int[][] MDA1 = {

				{ 1, 2, 1 }, 
				{ 9, 7, 2 }, 
				{ 7, 6, 4 }

		};

		int[][] MDA2 = {

				{ 2, 6, 8 },
			
				{ 0, 1, 3 }, 
				{ 1, 2, 4 }

		};
		
		int [][] NewMatrix =  new int[MDA1.length][MDA1[0].length];
		
		
		
		
		
		for(int i =0;i<MDA1.length;i++)
		{
			
			
			for(int j=0;j<MDA1[i].length;j++)
			{
				
				NewMatrix[i][j] = MDA1[i][j]+MDA2[i][j];
				
						//MDA2[i][j];
						
				System.out.print(NewMatrix[i][j] + " ");
				
			}
			
			
			System.out.println(" ");
			
		}
	}

}
