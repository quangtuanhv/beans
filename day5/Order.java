package day5;

public class Order {
	private int numDayStay;
	private float totalPrice;
	private String dateFounded;
	public Order() {	
	}
	public Order(int numDayStay, float totalPrice, String dateFounded) {
		this.numDayStay = numDayStay;
		this.totalPrice = totalPrice;
		this.dateFounded = dateFounded;
	}
	public int getNumDayStay() {
		return numDayStay;
	}
	public void setNumDayStay(int numDayStay) {
		this.numDayStay = numDayStay;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getDateFounded() {
		return dateFounded;
	}
	public void setDateFounded(String dateFounded) {
		this.dateFounded = dateFounded;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "so ngay o : " + numDayStay + "\nso tien phai tra : "+totalPrice+"\nngay lap hoa don : "+dateFounded;
	}
	
}
