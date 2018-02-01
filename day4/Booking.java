package day4;

public class Booking {
	private String day;
	private int numPeople;
	private float price;
	private String codeBooking;
	public Booking(String day, int numPeople, float price, String codeBooking) {
		super();
		this.day = day;
		this.numPeople = numPeople;
		this.price = price;
		this.codeBooking = codeBooking;
	}
	public Booking() {
		super();
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getNumPeople() {
		return numPeople;
	}
	public void setNumPeople(int numPeople) {
		this.numPeople = numPeople;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCodeBooking() {
		return codeBooking;
	}
	public void setCodeBooking(String codeBooking) {
		this.codeBooking = codeBooking;
	}
	public void printCustomerBooking() {
		System.out.println("code Booking :  "+codeBooking);
	}
}
