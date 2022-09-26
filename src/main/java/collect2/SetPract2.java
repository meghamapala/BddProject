package collect2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;

public class SetPract2 {
	
	public void justMethod(int[] a) {
	
	HashSet <Integer> hs=new HashSet<Integer> ();
	for(int x:a) {
		if(hs.add(x)==false) {
			System.out.println(x+" Duplicate Value");
		}
	}
	Iterator<Integer> i=hs.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	
		
	}
	}
	@Test
	public void test1() {
		int [] a= {5,5,7,7,8,9,5,7,8};
		justMethod(a);
		
	}

}
