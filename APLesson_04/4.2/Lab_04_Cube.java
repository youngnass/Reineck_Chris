import java.util.Scanner;

public class Lab_04_Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input the length of a side on your cube: ");
		side = keyboard.nextDouble();
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		 sa = (6*(side*side));
	}
	public static void print()
	{
		System.out.println("The surface area of a cube whose sides are "+side+" in length is "+sa);
	}
}