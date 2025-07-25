package oop;


	class Vehicle 
	{
		void drive()
		{
			System.out.println("is driving");
		}
	}
	
	class Car extends Vehicle
	{
		void drive()
		{
			System.out.println("Car is driving");
		}
		
		void speedUp()
		{
			System.out.println("Speeding up Cars");
		}
		
	}
	
public class UpCastingAndDownCasting {

	public static void main(String[] args) {
		
		//UpCasting
		Vehicle vehicle1 = new Car(); //(child → parent).storing it in a Vehicle reference
		vehicle1.drive();//overridden by car.drive();
		
		//DownCasting
		Vehicle vehicle = new Car(); 
		Car car = (Car) vehicle; // ⬅ DownCasting
		car.drive();
		car.speedUp(); // Is allowed now 

	}

}
