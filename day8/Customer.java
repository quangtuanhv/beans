package day8;

public class Customer {
	private String name;
	private boolean isVip;
	private String address;
	private float money;
	private boolean isDiscout;
	private boolean isValidPhoneNumber;
	
	public Customer() {
		super();
	}
	public Customer(String name, boolean isVip, String address, float money, boolean isDiscout,
			boolean isValidPhoneNumber) {
		super();
		this.name = name;
		this.isVip = isVip;
		this.address = address;
		this.money = money;
		this.isDiscout = isDiscout;
		this.isValidPhoneNumber = isValidPhoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVip() {
		return isVip;
	}
	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public boolean isDiscout() {
		return isDiscout;
	}
	public void setDiscout(boolean isDiscout) {
		this.isDiscout = isDiscout;
	}
	public boolean isValidPhoneNumber() {
		return isValidPhoneNumber;
	}
	public void setValidPhoneNumber(boolean isValidPhoneNumber) {
		this.isValidPhoneNumber = isValidPhoneNumber;
	}
	
}
