
/*
NAME : Pratham Yadav
PRN : 2020BTEIT00006
Java Assignment 4
*/
import java.lang.*;


// Parent Intreface Vehicle
interface Vehicle{
	int maxPassenger = 10;
	double maxSpeed = 100;
}



// Land Vehicle interface 
interface LandVehicle extends Vehicle{
	int numWheels=0;
        void drive();
}


// Sea Vehicle interface
interface SeaVehicle extends Vehicle{
	double displacemen=0.0;
	void launch();
}

// Car class

class Car implements LandVehicle{
	int maxPassenger=4;
	double maxSpeed = 80;
	int numWheels = 4;


	String modelName;
	public void setModelName(String name){
		modelName=name;
	}
	
	public String getModelName(){
		return modelName;
	}
	@Override
	public void drive(){
		System.out.println("Drive method is called");
	}

	public void showDetails(){
		System.out.println("\n*********Displaying Car Details**********");
		System.out.println(" Maximum Passengers : " + maxPassenger);
		System.out.println(" Maximum Speed : " + maxSpeed+" km/hr");
		System.out.println(" Number of Wheels : " + numWheels);
		
		System.out.println(" Model Name : " +getModelName());
	}
}

// Hovercraft class

class Hovercraft implements LandVehicle,SeaVehicle{
	int maxPassenger = 2;
	double maxSpeed = 100;
	int numWheels = 4;
	double displacement = 200.7;


	String modelName;
	public void setHoverName(String name){
		modelName=name;
	}
	
	public String getHoverName(){
		return modelName;
	}
	@Override
	public void drive(){
		System.out.println("Drive method is called, Hovercraft has entered on Land");
	}
	@Override
	public void launch(){
		System.out.println("Launch method is called, Hovercraft has entered on Water");
	}

	public void showDetails(){
		System.out.println("\n*********Displaying Hovercraft Details**********");
		System.out.println(" Maximum Passengers : " + maxPassenger);
		System.out.println(" Maximum Speed : " + maxSpeed + " km/hr");
		System.out.println(" Number of Wheels : " + numWheels);
		System.out.println(" Displacement : " + displacement+" km");
		System.out.println(" Hover Name : " + getHoverName());
	}
}

// Ship class

class Ship implements SeaVehicle{
	int maxPassenger = 400;
	double maxSpeed = 50;
	double displacement = 304.5;


	String modelName;
	public void setShipName(String name){
		modelName=name;
	}
	
	public String getShipName(){
		return modelName;
	}
	@Override
	public void launch(){
		System.out.println("Launch method is called");
	}
	public void showDetails(){
		System.out.println("\n*********Displaying Ship Details**********");
		System.out.println(" Maximum Passengers : " + maxPassenger);
		System.out.println(" Maximum Speed : " + maxSpeed+" km/hr");
		System.out.println(" Displacement : " + displacement+" km");
		
		System.out.println(" Ship Name : " + getShipName());
	}
}

// main Class

public class Interface{
	public static void main(String arg[]){
		Car c=new Car() ;
		c.setModelName("Jaguar");
		System.out.println("Model Name : "+c.getModelName());
		c.drive();
		c.showDetails();

		Ship s=new Ship() ;
		s.setShipName("Titanic");
		System.out.println("\nModel Name : " + s.getShipName());
		s.launch();
		s.showDetails();

		Hovercraft h = new Hovercraft();
		h.setHoverName("RTX 220 Craft");	
	        System.out.println("\nHover Name : " + h.getHoverName());
		h.drive();
		h.launch();
		h.showDetails();
		

		
	}
}