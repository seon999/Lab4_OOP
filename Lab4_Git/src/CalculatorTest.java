import java.util.*;

//Leader
public class CalculatorTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Calculator test = new Calculator();
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double result1 = test.add(x, y);
		System.out.println("Add : " + result1);
		double result2 = test.subtract(x, y);
		System.out.println("Sub : " + result2);
		double result3 = test.multiply(x, y);
		System.out.println("Mul : " + result3);
		double result4 = test.divide(x, y);
		System.out.println("Div : " + result4);
		double result5 = test.remainder(x, y);
		System.out.println("Rem : " + result5);
		String result6 = test.toString();
		System.out.println(result6);
		
	}

}
