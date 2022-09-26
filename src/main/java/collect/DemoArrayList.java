package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoArrayList {
	
	
		ChromeDriver dr;
		public HashMap<String, String> test2(List<WebElement> keysEle,List<WebElement> valueEle) {
			HashMap<String, String> mp=new HashMap<String, String>();
			for(int i=0;i<keysEle.size();i++) {
				String key=keysEle.get(i).getAttribute("id");
				String value=valueEle.get(i).getText();
				mp.put(key, value);
			}
			return mp;
			
		}
		
		public HashMap<String, String> exva() {
			HashMap<String, String> mp=new HashMap<String, String>();
			mp.put("4354", "silk");
			return mp;
			
		}
		public void compare( HashMap<String, String> ex, HashMap<String, String> ac) {
			Iterator<Entry<String, String>>  e=ex.entrySet().iterator();
		
		Iterator<Entry<String, String>>  e1=ac.entrySet().iterator();
		while(e.hasNext()&&e1.hasNext()) {
			Entry<String, String>  i=e.next();
			Entry<String, String>  i1=e1.next();
			if(i.getKey().equals(i1.getKey())&&i.getValue().equals(i1.getValue())){
				System.out.println("matched");
			}else
					System.out.println("not matched");
			
	}
	}
		
		
		public ArrayList<Object>addValue()
		{
			//open browser
			//Navigate to Url
			List<WebElement> elements=dr.findElements(By.xpath("xpath of all menu"));
			ArrayList<Object> a2=new ArrayList<Object>();
			for(WebElement el:elements)
			{
				String s=el.getText();
				a2.add(s);
			}
			//int a=9;
//			ArrayList a=new ArrayList();
//			a.add(6);
//			a.add(67);
//			a.add("hi");
			return a2;
		}
		
		
		public void getValue(ArrayList<Object> ar,ArrayList <Object>ar1)
		{
			Iterator<Object> i=ar.iterator();
			Iterator<Object> i1=ar1.iterator();
			while(i.hasNext()&&i1.hasNext())
			{
				
				Assert.assertEquals(i.next(), i1.next());
				//System.out.println(i.next()+"     "+i1.next());
			}
			
			
//			for(Object o:ar)
//			{
//				System.out.println(o);
//			}
		}
		@Test
		public void test1()
		{
			ArrayList <Object>a=new ArrayList<Object>();
			a.add(6);
			a.add(67);
			a.add("hi");
			//a.get(1);
			//a.remove(2);
			System.out.println(a.contains("hi"));
			ArrayList<Object> a1=addValue();
			getValue(a,a1);
		}

	}


