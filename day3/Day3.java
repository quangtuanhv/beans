package day3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_3.xml");
		Customer cus1 = (Customer)context.getBean("cus1");
		cus1.printInfomation();
		Customer cus2 = (Customer)context.getBean("cus2");
		cus2.printInfomation();
		Customer cus3 = (Customer)context.getBean("cus3");
		cus3.printInfomation();
	}

}
