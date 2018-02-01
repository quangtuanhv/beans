package day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Day8 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_7.xml");
		VipCustomer resort = (VipCustomer) context.getBean("resort");
		resort.printCustomer();
		VipCustomer resort1 = (VipCustomer) context.getBean("resort1");
		resort1.printCustomer();
		
	}
}
