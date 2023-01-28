
public class Min_And_Max_Value_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//for Min Value in Array
		int [] input = {8,13,102,11,23,2,12,444};

		int Min =input[4];

		for(int i=0;i<input.length-1;i++)
		{
			if(Min>input[i])
			{
				
				Min = input[i];
			}

		}
		
		System.out.println(Min);
		
		//Max Value 
		int [] input2 = {8,13,102,55555,11,23,2,12,444};
		
		int Max = input2[0];

		for(int i=0;i<input2.length-1;i++)
		{
			if(input2[i] > Max)
			{
				
				Max = input2[i];
			}

		}
		
		System.out.println(Max);
	}


}
