package MapPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortHashMap {

	
	
	
	public static void SortHashMap(Map<String,Integer> map )
	{
	
		ArrayList<String> Count = new ArrayList<String>(map.keySet());
		
		
		Collections.sort(Count);
		System.out.println(Count);
		
		Collections.sort(Count,Collections.reverseOrder());
		
		System.out.println(Count);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> HM = new HashMap<String, Integer>();

		HM.put("TCS", 12000);
		HM.put("Infosys", 5000);
		HM.put("Global", 15000);
		HM.put("Amazon", 1000);
		HM.put("Flipcart", 2500);
		
		SortHashMap(HM);
		

	}

}
