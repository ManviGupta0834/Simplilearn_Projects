package com.simpli;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionAssisted {
	public static void main(String[] args) {
		System.out.println("Array List");
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Gwalior");
		arr.add("bangalore");
		for(String a:arr) {
			System.out.println(a);
		}
		//Creating Vector
		Vector vc =new Vector();
		vc.addElement("dd");
		vc.addElement(10);
		System.out.println(vc);
		
		//creating LinkedList
		LinkedList<String> names= new LinkedList<String>();
		names.addAll(vc);
		System.out.println(names);
		
		//Iterator-- It is a cursor which is used to point to an object, as java does not supports pointers
		Iterator itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		// Creating Hashset
		//Hash will not maintain oder of insertion, it arrange data in random order.
		HashSet<String> hs= new HashSet<String>();
		hs.add("maaa ki");
		hs.add("kya btau");
		hs.add("zindagi birbad ho gaya");
		Iterator it =hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//LinkedHashSet-- extends HashSet and maintain the order of insertion of data.
		
	}

}
