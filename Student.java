package map;

public class Student {
	String name;
	int id;
	int age;
	String branch;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setBranch(String branch) {
		this.branch=branch;
	}
	public String getBranch() {
		return branch;
	}
	
	Student(String name,int id,int age,String branch){
		this.name=name;
		this.id=id;
		this.age=age;
		this.branch=branch;
	}
	public String toString() {
		return name+" "+id+" "+age+" "+branch;
	}

}
