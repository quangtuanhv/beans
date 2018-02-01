package day9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Day9 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_9.xml");
		Customer cus1 = (Customer) context.getBean("cus1");		
		System.out.println(cus1.toString());
//		((AbstractApplicationContext) context).registerShutdownHook();  
		Customer cus2 = (Customer) context.getBean("cus1");
		System.out.println(cus2.toString());
	}
}
