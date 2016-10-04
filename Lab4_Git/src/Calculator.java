import java.util.*;

public class Calculator {

	//Leader
	public static void main(String[] args) {
		
		
	}
	
	//Programmer A
	public double add(double x, double y){
		double result = x+y;
		return result;
	}
	
	//Programmer B
	public double subtract(double x, double y){
		return 0;
	}
	
	//Programmer A
	public double multiply(double x, double y){
		double result = x*y;
		return result;
	}
	
	//Programmer B
	public double divide(double x, double y){
		return 0;
	}
	
	//Programmer B
	public double remainder(double x, double y){
		return 0;
	}
	
	//Programmer A
	public String toString(){
		
		String Leader = "Choi SeonHo, 201120978";
		String ProgrammerA = "Yoo Sungmin , 201120917";
		String ProgrammerB = "Ok Gyeonghwan, 201320884";
		String URI = "https://github.com/seon999/Lab4_OOP.git";
		String tostring = "Member name, IDs : " + Leader + "\n\t\t" + ProgrammerA + "\n\t\t" + ProgrammerB 
				+ "\nURI : " + URI;
		System.out.print(tostring);
		
		return tostring;
	}

}

