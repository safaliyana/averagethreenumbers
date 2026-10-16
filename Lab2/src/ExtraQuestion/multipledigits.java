package ExtraQuestion;

import java.util.Scanner;
public class multipledigits 
{
	    public static void main(String[] args) 
	    {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a number between 0 and 1000: ");
	        int number = input.nextInt();

	        int lastDigit = number % 10;
	        int remaining1 = number / 10;

	        int middleDigit = remaining1 % 10;
	        int firstDigit = remaining1 / 10;

	        int multiplication = firstDigit * middleDigit * lastDigit;

	        System.out.println("The multiplication of all digits in " + number + " is " + multiplication);
	    }
}
