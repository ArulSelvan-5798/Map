package map;

public class CustomerDetails {
	private String name;
	private int age;
	private String email;
	private int accBalance;
	private long aadharNo;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public String getemail() {
		return email;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance=accBalance;
	}
	public int getaccBalance() {
		return accBalance;
	}
	public void setaadharNo(long aadharNo) {
		this.aadharNo=aadharNo;
	}
	public long getaadharNo() {
		return aadharNo;
	}
	
	public CustomerDetails(String name,int age,String email,int accBalance,long aadharNo) {
		this.name=name;
		this.age=age;
		this.email=email;
		this.accBalance=accBalance;
		this.aadharNo=aadharNo;
	}
	public String toString() {
		return name+" "+age+" "+email+" "+accBalance+" "+aadharNo;
	}
	

}
