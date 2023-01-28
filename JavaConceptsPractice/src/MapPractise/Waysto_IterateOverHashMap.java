package MapPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Waysto_IterateOverHashMap {
	
	

	public static void iterateUsingEntrySet(Map<String, Integer> UsingEntry) {

		for (Map.Entry<String, Integer> entry : UsingEntry.entrySet()) {

			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.out.println("----------------------------------");

		Set<Entry<String, Integer>> E = UsingEntry.entrySet();

		for (Map.Entry<String, Integer> entry : E) {

			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

	
	
	public static  void iterateUsingKeySetAndForeach(Map<String, Integer> map) {
		
	    for (String key : map.keySet()) {
	    	
	    	
	        System.out.println(key + ":" + map.get(key));
	    }
	}
	
	public static void iterateUsingIteratorAndEntry(Map<String, Integer> map) {
		
		
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
	    
	    
	    while (iterator.hasNext()) {
	        Map.Entry<String, Integer> entry = iterator.next();
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
	}

	
	public static  void iterateUsingIteratorAndKeySet(Map<String, Integer> map) {
	    Iterator<String> iterator = map.keySet().iterator();
	    while (iterator.hasNext()) {
	        String key = iterator.next();
	        System.out.println(key + ":" + map.get(key));
	    }
	}
	
	
	public static void iterateUsingIteratorAndValues(Map<String, Integer> map) {
	    Iterator<Integer> iterator = map.values().iterator();
	    while (iterator.hasNext()) {
	        Integer value = iterator.next();
	        System.out.println("value :" + value);
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> HM = new HashMap<String, Integer>();

		HM.put("TCS", 20000);
		HM.put("Infosys", 20000);
		HM.put("Global", 20000);
		HM.put("Amazon", 20000);
		HM.put("Flipcart", 20000);

		//iterateUsingEntrySet(HM);
		//iterateUsingKeySetAndForeach(HM);
		//iterateUsingIteratorAndEntry(HM);
		//iterateUsingIteratorAndKeySet(HM);
		iterateUsingIteratorAndValues(HM);

	}

}
