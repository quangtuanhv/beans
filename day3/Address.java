package day3;

public class Address {
	private String address;

	public void setAddress(String address) {
		this.address = address;
	}
	public void printCustomerAddress() {
		System.out.println("Customer Address : "+address);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return address;
	}
}
