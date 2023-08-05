package in.ashok.it;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	 
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Application started....");
		BillCollector bc = context.getBean("billcollector", BillCollector.class);
	    bc.collectPayment(1500.00);
	
	}

}
