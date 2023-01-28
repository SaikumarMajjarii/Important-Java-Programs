package MapPractise;

import java.util.*;
import java.util.Map.Entry;

public class ConvertHashMaptoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> HM = new HashMap<String, Integer>();

		HM.put("TCS", 20000);
		HM.put("Infosys", 20000);
		HM.put("Global", 20000);
		HM.put("Amazon", 20000);
		HM.put("Flipcart", 20000);

		Iterator<Map.Entry<String, Integer>> entry = HM.entrySet().iterator();

		while (entry.hasNext()) {
			Map.Entry<String, Integer> E = entry.next();

			E.getKey();
			E.getValue();

		}

		ArrayList<String> Comp = new ArrayList<String>(HM.keySet());

		for (String Company : Comp) {

			// System.out.println(Company);

		}

		ArrayList<Integer> Employees = new ArrayList<Integer>(HM.values());
		
		
		for (Integer Emp : Employees) {

			// System.out.println(Emp);

		}

		Set<Entry<String, Integer>> entrySet = HM.entrySet();
		ArrayList<Map.Entry<String, Integer>> entryCustomerList = new ArrayList<Map.Entry<String, Integer>>(entrySet);

		for (Map.Entry<String, Integer> E : entryCustomerList) {

			System.out.println("The Key is " + E.getValue() + "  with Value : " + E.getKey());

		}

	}

}
