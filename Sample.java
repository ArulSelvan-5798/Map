package map;

import java.util.HashMap;  
import java.util.Iterator;

public class Sample {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(23,"Arul");
		hm.put(11,"SilambarasanTR");
		hm.put(28,"Sharp");
		System.out.println(hm);
		System.out.println( "*****************");
		
		int max=0;
		for(Integer i:hm.keySet()) {
			if(i>max) {
				max=i;
		}
		}
		System.out.println(max);
		
		System.out.println("**************");
		
		for(Integer i:hm.keySet()) {
			String str=hm.get(i);
			System.out.println(i+" "+str);
		}
		System.out.println( "********");
		
	
		
		for(String str:hm.values()) {
			if(str.length()>5) {
			System.out.println(str);
		}
		}
		System.out.println("**********");
		
		hm.forEach((k,v)-> {
			System.out.println(k+" "+v);
		});
		System.out.println("**********");
		
		
		hm.keySet().forEach(s-> {
			System.out.println(s);
		});
		System.out.println("**********");
		
		// while
		int a=5;
		while(a<6) {
			System.out.println(a);
			a++;
		}
		System.out.println( "***********");
		
		// iterator
		Iterator<Integer> itr=hm.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("**********");
		Iterator<String> i=hm.values().iterator();
		while(i.hasNext()) {
			if(i.next().startsWith("A")) {
				i.remove();
			}
		}
		hm.values().forEach(s-> {
			System.out.println(s);
		});
	}

}
