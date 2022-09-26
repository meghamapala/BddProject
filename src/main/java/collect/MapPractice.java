package collect;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Vector;

import org.testng.annotations.Test;

public class MapPractice {
	
	HashMap<Character, Integer> mp=new HashMap<Character, Integer>();
	
	@Test
	public void countEachCharacter() {
		String sentence="United states of america";
		char[] c=sentence.toCharArray();
		for(char x:c) {
			if(mp.containsKey(x)) {
				mp.put(x, mp.get(x)+1);
			}else
				mp.put(x, 1);
			}
		Iterator<Entry<Character, Integer>>en=mp.entrySet().iterator();
		while(en.hasNext()) {
			Entry<Character, Integer> i=en.next();
			System.out.println("key is"+i.getKey()+"value is"+i.getValue());
		}
	}
	
	public void coursers() {
		Vector<Integer> v=new Vector<Integer>();
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements()) {
			e.nextElement();
		}
		//Limitation: 
		//1. cannot remove any element
		//2. only apply in legacy class
		//   to overcome this Iterator took place
		
		Iterator<Integer> i=v.iterator();//universal courser
		i.hasNext();
		i.next();
		i.remove();//can remover
//	
//		Limitation: 
//		1. no backyard direction
//		2. no indexing concept
//		3. no replace
//		4. no adding while iterating
//		to overcome those ListIterator took place
		ListIterator<Integer> li=v.listIterator();
		li.hasNext();
		li.next();
		li.nextIndex();
		li.previous();
		li.hasPrevious();
		li.previousIndex();
		
		li.add(4);
		li.remove();
		li.set(3);
	}
}


