package day6;

public class SwimmingPool {
	private String khuVuc;
	private String gioMoCua;
	private Employee employee;
	public SwimmingPool(String khuVuc, String gioMoCua, Employee employee) {
		super();
		this.khuVuc = khuVuc;
		this.gioMoCua = gioMoCua;
		this.employee = employee;
	}
	public SwimmingPool() {
		super();
	}
	public String getKhuVuc() {
		return khuVuc;
	}
	public void setKhuVuc(String khuVuc) {
		this.khuVuc = khuVuc;
	}
	public String getGioMoCua() {
		return gioMoCua;
	}
	public void setGioMoCua(String gioMoCua) {
		this.gioMoCua = gioMoCua;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void printSwimmingPoolt() {
		System.out.println(khuVuc +"\nGiờ mở cửa "+gioMoCua+"\n"+employee.toString() );
	}
}
