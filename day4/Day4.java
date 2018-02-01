package day4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Day4 {
	public static void main(String args []) {
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans_4.xml");
	Customer cus = (Customer) context.getBean("cus1");
	cus.printInfomation();
	}
}
