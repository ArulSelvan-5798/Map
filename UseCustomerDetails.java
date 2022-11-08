package map;

import java.util.HashMap;
import java.util.Iterator;

public class UseCustomerDetails {
	public static void main(String[] args) {
		CustomerDetails cd1=new CustomerDetails("Arul",24,"arul5798",5000,8383292345l);
		CustomerDetails cd2=new CustomerDetails("Simbu",38,"str798",500000,7383292345l);
		CustomerDetails cd3=new CustomerDetails("Sharp",27,"sharp98",3000,638322345l);
		CustomerDetails cd4=new CustomerDetails("Manmadhan",26,"manmadhan5678",8000,9083292345l);
		
		HashMap<Integer,CustomerDetails> hm=new HashMap<>();
		hm.put(1,cd1);
		hm.put(2,cd2);
		hm.put(3,cd3);
		hm.put(4,cd4);
		System.out.println("SilambarasanTR");
		
		for(Integer s:hm.keySet()) {
			System.out.println(s);
			
		}
		System.out.println("***********");
		
		for(CustomerDetails s:hm.values()) {
			System.out.println(s);
		}
		System.out.println("*************");
		
		Iterator<CustomerDetails> i=hm.values().iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
