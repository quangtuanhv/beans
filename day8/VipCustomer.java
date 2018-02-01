package day8;

import java.util.Iterator;
import java.util.List;

public class VipCustomer {
	private int id ;
	private List<Customer> customer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	public VipCustomer() {
		super();
	}
	public VipCustomer(int id, List<Customer> customer) {
		super();
		this.id = id;
		this.customer = customer;
	}

	public void printCustomer() {
		System.out.println("Resort ID : "+id);
		Iterator<Customer> listCus = customer.iterator();
		while (listCus.hasNext()) {
			System.out.println(listCus.next().toString());
		}
	}
}
