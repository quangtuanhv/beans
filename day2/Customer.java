package day2;

public class Customer {
	 private String name;
	 private int age;
	 private String gender;
	 private int cmnd;
	 
	 	 
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public void printInfomation() {
		System.out.println("Name : "+name+"\nAge : "+age+"\nGender : "+gender+"\nCMND : "+cmnd);
	}
}
