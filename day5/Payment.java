package day5;

public class Payment {
	private Order oder;

	public Payment(Order oder) {
		this.oder = oder;
	}

	public Payment() {
	}

	public Order getOder() {
		return oder;
	}

	public void setOder(Order oder) {
		this.oder = oder;
	}
	
	public void printCustomerPayment() {
		System.out.println(oder.toString());
	}
	
}
