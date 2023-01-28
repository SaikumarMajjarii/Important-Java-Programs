
public class Array_Sum_Of_Elements_MDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int Sum=0;
		
		int[][] MDA = {
				
				{1,8,4},
				{9,7,2},
				{7,6,4}

		};
		
		
		
		for(int i=0;i<MDA.length;i++)
		{
			
			for(int j=0;j<MDA[i].length;j++)
			{
				
				Sum = Sum +MDA[i][j];
				
			}
		}
		


		System.out.println("The Total Sum of Array " + Sum );
		
		
	}

}
