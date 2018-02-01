package day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Resort {
	public static void main(String [] args) {
		System.out.println("*****DAY 2******");
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Customer cus1 = (Customer) context.getBean("cus1");
    Customer cus2 = (Customer) context.getBean("cus2");
    Customer cus3 = (Customer) context.getBean("cus3");
    Customer cus4 = (Customer) context.getBean("cus4");
    cus1.printInfomation();
	cus2.printInfomation();
	cus3.printInfomation();
	cus4.printInfomation();
  
	System.out.println("*****END DAY 2******");
	System.out.println("*****  DAY 3  ******");

	
	
	}
}
