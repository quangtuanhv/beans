package day6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Day6 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_6.xml");
		SwimmingPool sp = (SwimmingPool) context.getBean("swim");
		sp.printSwimmingPoolt();

	}

}
