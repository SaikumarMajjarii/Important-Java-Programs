package MostAsked_Java_Programs;

public class Missing_No_InArray {
	
	
	//Array should not be in sorted Order
	//Array Should be in Range
	//Array Should  not be Duplicate
	
	
	
	public static  int FindMissingNum(int[] ArrayInput ,int LastNum) {
		
		
	
		int ActualSum = 0;
		
		int totalCount = LastNum * (LastNum+1)/2;
		
		
		for(int i=0;i<ArrayInput.length;i++)
		{
			
			ActualSum+=ArrayInput[i];
			
		}
		
		
		return totalCount-ActualSum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] ArrayInput = {1,2,3,4,5,6,7,8,9};
		
		int LastNum = 10;
		
		int MissedNum = FindMissingNum(ArrayInput,LastNum);
		
		System.out.println(MissedNum);
		
	}

}
