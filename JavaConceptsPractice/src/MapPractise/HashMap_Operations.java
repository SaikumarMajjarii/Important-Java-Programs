package MapPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_Operations {

	// HashMap
	// Doesnot Follow Insertion Order
	// Allow Onlys one Null Value
	// using Hashing Principle
	// Duplicate Keys are not Allowed and it will get OverRide
	// Multiple Values are Allowed

	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Integer[] a = { 10, 20, 20, 30, 40 };
//
//		// Getting the list view of Array
//		List<Integer> list = Arrays.asList(a);
//
//		LinkedHashSet<Integer> HS = new LinkedHashSet<>(list);
//
//		
//		
//		System.out.println(HS);
//
//		String S = "Saikumar";
//
//		System.out.println(S.substring(2, 4));
		
		TreeMap<Integer,String> HS = new TreeMap<Integer, String>();
		
		HS.put(1, null);
		
		System.out.println(HS);

	}

}
