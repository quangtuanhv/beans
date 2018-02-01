package day5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Day5 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_5.xml");
		Payment pay1 = (Payment) context.getBean("payment");
		pay1.printCustomerPayment();
	}

}
