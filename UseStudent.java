package map;

import java.util.HashMap;
import java.util.Iterator;

public class UseStudent {
	public static void main(String [] args) {
		Student s1=new Student("Arul",5,24,"Mech");
		Student s2=new Student("Sharp",6,23,"Civil");
		Student s3=new Student("Str",7,25,"ECE");
		Student s4=new Student("Simbu",9,26,"CSE");
		Student s5=new Student("Manmadhan",10,21,"EEE");
		
		HashMap<Integer,Student> hm=new HashMap<>();
		hm.put(s1.getid(),s1);
		hm.put(s2.getid(),s2);
		hm.put(s3.getid(),s3);
		hm.put(s4.getid(),s4);
		hm.put(s5.getid(),s5);
		System.out.println(hm);
		System.out.println("******************");
		
		for(Student s:hm.values()) {
			System.out.println(s);
		}
		System.out.println("***************");
		
		Iterator<Student> s=hm.values().iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
	}

}
