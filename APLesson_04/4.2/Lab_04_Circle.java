import java.util.Scanner;

public class Lab_04_Circle
{
	static double r;
	static double area;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the radius of your circle:");
		r = keyboard.nextDouble();
		calcArea();
		print();
	}
	public static void calcArea()
	{
		area =(r*r*3.14);
		
	}
	public static void print()
	{
		System.out.println("The area of a circle with a radius of "+r+" is "+area+".");
	}
}