package bmicalaculation;

import java.util.Scanner;

public class BMIcalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double w;
       double h;
       double b;
       System.out.println("Enter weight in kg: ");
       System.out.println("Enter height in m: ");
       Scanner input=new Scanner(System.in);
       w=input.nextDouble();
       h=input.nextDouble();
       b=w/(h*h);
       System.out.println("Your BMI is: "+b);
       
	}

}
