package day3;

public class Customer {
	 private String name;
	 private int age;
	 private String gender;
	 private int cmnd;
	 private Address address;
	 
	
	 
	public Customer() {
	}
	public Customer(String name, int age, String gender, int cmnd, Address address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.cmnd = cmnd;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void printInfomation() {
		System.out.println("Name : "+name+"\nAge : "+age+"\nGender : "+gender+"\nCMND : "+cmnd+"\nAddress : "+address.toString());
	}
}
