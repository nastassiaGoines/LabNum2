import java.util.Scanner;

public class CircusClassroom {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		double x;
		double z;
		System.out.println("Enter legnth of the classroom: ");
        x = scnr.nextDouble();
        System.out.println("Enter width of the classroom: ");
        z = scnr.nextDouble();
        
		double perimeter = 2* + 2*z;
		double area = x*z;
		
	
			
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	
		
				
		scnr.close();
			
	}

}
