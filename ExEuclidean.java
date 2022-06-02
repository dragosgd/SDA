package euclid;

import java.util.Scanner;

public class ExEuclidean {
	/** Function to ExEuFormula **/

	public  int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public  void ExEuFormula(int a, int b)

	{

		int x = 0, y = 1, lastx = 1, lasty = 0, temp;
		while (b != 0)
		{
			int q = a / b;
			int r = a % b;

			a = b;
			b = r;

			temp = x;
			x = lastx - q * x;
			lastx = temp;
			temp = y;
			y = lasty - q * y;
			lasty = temp;
		}
		System.out.println("Roots  x : " + lastx + " y :" + lasty);

	}

	/** Main function **/

	public static void main(String[] args)

	{
		int gcd;
		Scanner scan = new Scanner(System.in);

		System.out.println("Extended Euclidean Alogorithm\n");
		
		
		/** Object instantiation ExEuclidean class **/

		ExEuclidean ee = new ExEuclidean();

		/** Input two integers **/

		System.out.println("Enter a b of ax + by = gcd(a, b)\n");

		int a = scan.nextInt();

		int b = scan.nextInt();

		/** Call function ExEuFormula of class ExEuclidean **/
		gcd = ee.gcd(a, b);
		System.out.println("Using Euclid's algorithm we determine that gcd of a=" + a + " and b=" + b +" is: " + gcd + "\n" );
  
		
		ee.ExEuFormula(a, b);
		scan.close();
	}
}
