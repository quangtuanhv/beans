package day7;

public class Customer {
	private int cmnd;
	private String name;
	private int age;
	public Customer(int cmnd, String name, int age) {
		super();
		this.cmnd = cmnd;
		this.name = name;
		this.age = age;
	}
	public Customer() {
		super();
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CMND : "+cmnd+" Name : "+name+" Age : "+age;
	}
}
