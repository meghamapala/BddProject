package collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class SetPract {
	
	public void findUniqueValue(int [] a) {
		HashSet<Integer> hp=new HashSet<Integer>();
		for(int x:a) {
			if(hp.add(x)==false) {
				System.out.println(x+" is duplicate");
			}
		}
		Iterator<Integer> i=hp.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	@Test
	public void test1() {
		
		//The underlying data structure for HashSet is HashTable.
		//As it implements the Set Interface, duplicate values are not allowed. 
		//Objects that you insert in HashSet are not guaranteed to be inserted in the same order. 
		//Objects are inserted based on their hash code
		
		int [] a= {5,5,7,7,8,9,5,7,8};
		findUniqueValue(a);
		
		HashSet<String> hp=new HashSet<String>();
		hp.add("hijkj");
		boolean b=hp.add("hihgffdn");
		System.out.println(b);
		hp.add("hello");
		Iterator<String> i=hp.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	@Test
	public void test12() {
		//int [] a= {5,5,7,7,8,9,5,7,8};
		//findUniqueValue(a);
		
		LinkedHashSet<String> hp=new LinkedHashSet<String>();
		hp.add("hijkj");
		boolean b=hp.add("hihgffdn");
		System.out.println(b);
		hp.add("hello");
		Iterator<String> i=hp.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	@Test
	public void test142() {
		//int [] a= {5,5,7,7,8,9,5,7,8};
		//findUniqueValue(a);
		
		//TreeSet<String> hp=new TreeSet();
		ArrayList<String> hp=new ArrayList<String>();
		hp.add("tiger");
		boolean b=hp.add("cow");
		System.out.println(b);
		hp.add("chicken");
		Collections.sort(hp, new A());
		Iterator<String> i=hp.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
}

class A implements Comparator<String>{

	public int compare(String arg0, String arg1) {
		if(arg0.length()>arg1.length()) {
			return -1;
		}else if(arg0.length()<arg1.length()) {
			return 1;
		}else
		return 0;
	}
	
}


