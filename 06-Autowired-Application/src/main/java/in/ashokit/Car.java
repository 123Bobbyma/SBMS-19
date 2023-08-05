package in.ashokit;

public class Car {

	
	private DesealEngine desealEng;
	
	public void setDesealEng(DesealEngine desealEngine) {
	 this.desealEng=desealEngine;	
	}
	public Car() {
		System.out.println("Car::Constructor");
	}
	
	public void drive() {
		int start = desealEng.start();
		if(start>=1) {
			System.out.println("journey started...");
		}else {
			System.out.println("engine faild to start") ;
		}
	}
}

