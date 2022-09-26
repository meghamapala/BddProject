package newcollect;

import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;


public class NewSetPract {
	
	@Test
	public void test1() {
		HashSet<String> hp=new HashSet<String>();
		boolean b=hp.add("hi");
		System.out.println(b);
		hp.add("hello");
		hp.add("GoodMorning");
		hp.add("were");
		Iterator<String> i=hp.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		
		
	}
		hp.remove("were");
		Iterator<String> ii=hp.iterator();
		while(ii.hasNext()) {
		System.out.println(ii.next());
		
	}
	
}}
