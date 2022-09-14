/*
 * Class: CMSC203 
 * Instructor: Pingwei - Tsai
 * Description: Project 1: An application that steps through some possible problems to restore Internet connectivity
 * Due: 09/13/2022
 * Platform/compiler: Eclipse/Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: KIM NGAN MAI
*/

import java.util.Scanner;

public class Wifi_Diagnosis
{
	public static void main (String[] args)
	{
		String input;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		System.out.println("Reboot your computer and try to connect");
		System.out.print("Did that fix the problem? (Yes or No)");
		input = keyboard.nextLine();
		
			if(input.equalsIgnoreCase("yes"))
			{
				System.out.println("Done.\nProgrammer: Kim Ngan Mai");
				return;
				
			}
			if  (input.equalsIgnoreCase("no"))
			{
		System.out.println("Reboot the router and try to connect");
		System.out.print("Did that fix the problem? (Yes or No)");
		input = keyboard.nextLine();
		
			if(input.equalsIgnoreCase("yes"))
			{
				System.out.println("Done.\nProgrammer: Kim Ngan Mai");
				return;
			}
			if (input.equalsIgnoreCase("no"))
			{
		System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
		System.out.print("Did that fix the problem? (Yes or No)");
		input = keyboard.nextLine();
		
			if(input.equalsIgnoreCase("yes"))
			{
				System.out.println("Done.\nProgrammer: Kim Ngan Mai");
				return;
			}
			if (input.equalsIgnoreCase("no"))
			{
		System.out.println("Move the computer closer to the router and try to connect");
		System.out.print("Did that fix the problem? (Yes or No)");
		input = keyboard.nextLine();
		
			if(input.equalsIgnoreCase("yes"))
			{
				System.out.println("Done.\nProgrammer: Kim Ngan Mai");
				return;
			}
			if (input.equalsIgnoreCase("no"))
			{
		System.out.println("Contact your ISP");
		System.out.println("Done.\nProgrammer: Kim Ngan Mai");

			}
			}
			}
			}
			else
			{
				System.out.println("Invalid answer; try again.\nProgrammer: Kim Ngan Mai");
				return;
			}
	}
}

