package day7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Day7 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_7.xml");
		Resort resort = (Resort) context.getBean("resort");
		resort.printCustomer();
		Resort resort1 = (Resort) context.getBean("resort1");
		resort1.printCustomer();
		
	}
}
