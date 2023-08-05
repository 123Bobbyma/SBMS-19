package in.ashokit.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.ashokit.Address;
import in.ashokit.Person;

public class Main {

	public static void main(String[] args) throws JAXBException {
		
		Address addr = new Address();
		addr.setCity("partur");
		addr.setHouseNo("21");
		addr.setStreet("shivaji nagar");
		addr.setPincode(431052);
		
		Person person = new Person();
		person.setName("Ram");
		person.setAge(26);
		person.setMobile(123456);
		person.setEmail("marwhabpbby@gmail.com");
		person.setAddress(addr);
		
		
		JAXBContext jc =	JAXBContext.newInstance(Person.class);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.marshal(person, new File("Person.xml"));
		System.out.println("marshalling completed");
	}
	
}
