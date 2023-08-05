package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       System.out.println("Application started...."); 
	   
       Car car1 = context.getBean("car", Car.class);
       System.out.println(car1.hashCode());
       
       Car car2 = context.getBean("car", Car.class);
       System.out.println(car2.hashCode());
	
	}

}
