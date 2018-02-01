package day6;

public class Employee {
	private String name;
	private int ID;
	public Employee(String name, int iD) {
		super();
		this.name = name;
		ID = iD;
	}
	public Employee() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID : " + ID + "\nnhân viên : " + name;
	}
}
