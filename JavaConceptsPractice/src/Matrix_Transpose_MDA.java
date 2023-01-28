import java.util.Arrays;

public class Matrix_Transpose_MDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] MDA = {

				{ 1, 8, 4 },
				{ 9, 7, 2 }, 
				{ 7, 6, 4 }

		};
		
		
		
		int [][] NewMatrix =  new int[MDA.length][MDA[0].length];
		
		
		for(int i=0;i<MDA.length;i++)
		{
			
			for(int j=0;j<MDA[i].length;j++)
			{
				
				 NewMatrix[i][j] = MDA[j][i];
				
			}
		}
		
		
		for (int k =0;k<NewMatrix.length;k++)
		{
			System.out.println(Arrays.toString(NewMatrix[k]));
			
			
		}

		
		

	}

}
