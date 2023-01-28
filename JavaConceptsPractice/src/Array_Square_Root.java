import java.util.Arrays;

public class Array_Square_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] MDA = {
				
				{2,3,5},
				{0,1,3},
				{1,2,4}
				
		};
		
		int [][] Trans = new int[MDA.length][MDA[0].length];
		
		
		for(int i=0;i<MDA.length;i++)
		{
			
			for(int j=0;j<MDA[i].length;j++)
			{
				
			   //int Value = MDA[i][j]*MDA[i][j]
				
     			Trans[i][j] = (int) Math.pow(MDA[i][j], 2);
     			
 			   //System.out.print(Value +" ");
				
			}
			
			System.out.println( " ");
		}
		
		for (int k =0;k<Trans.length;k++)
		{
			System.out.println(Arrays.toString(Trans[k]));
			
			
		}
		
		
		
		
		

		
		
		

	}

}
