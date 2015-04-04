/*
 * Cyril Thomas CS3810 DS&A Assignment 2 03/10/14
 * MyDequeApp class: - Main Class to test MyDeque and Item class.
 * 
 * Strategy :
 * 	(01) First a try and catch while loop is created so as to allow the user to enter the size of the array Deque. If the user entered anything below or equal to Zero
 * 		 then the entire application Quits because setting the size is crucial for the next phase of the program. If a non positive value is entered then the program
 * 		 is going to throw an exception and the user has to enter a positive integer to continue or Zero to quit. 
 * 	(02) Secondly a try and catch-> do while loop <- with switch case is created. Here users get to perform various operations on the deque array and if the user input 
 *       anything besides the required value then the try and catch is going to show an error. Also the user can quit while in the main menu by putting any values besides 1 to 7.
 *  (03) Also Add Items to Front/Rear has a if condition to check whether the Queue is full or not. If full the program prompts user to remove some items from the queue before
 *  	 adding more items. 
 *  (04) Remove front/rear function has a if condition to check whether the Queue is empty or not. If empty the program prompts user to add some items before removing.     
 */ 



import java.util.Scanner;
import java.io.*;

public class MyDequeApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int input;
		
		String prodNumber;
		int prodPrice;
		MyDeque stock;
		Item product;
				
		while(true)
		{
			try 
			{
				System.out.print("Enter the total number of items(Positive Integer)(size)(To Quit:0): ");
				input = scan.nextInt();
				stock = new MyDeque(input);
				if(input <= 0)
					System.exit(0);
				break;
			} 
			catch (Exception e) 
			{
				System.out.println("Invalid Input: Only Postive Integer!! Please Press Enter");
				scan.nextLine();
			}
		}
		
		do
		{	
			scan.nextLine();
			System.out.println("\nEnter: 1 to Add Items to Front of the Queue");
			System.out.println("Enter: 2 to Add Items to Rear of the Queue");
			System.out.println("Enter: 3 to Remove Items from Front of the Queue");
			System.out.println("Enter: 4 to Remove Items from Rear of the Queue");
			System.out.println("Enter: 5 to List the Front Item in the Queue");
			System.out.println("Enter: 6 to list the Rear Item in the Queue");
			System.out.println("Enter: 7 to Display the Entire Queue");
			System.out.println("Enter: 0 to Quit");
			System.out.print("\nEnter : ");
			
			try
			{
				input= scan.nextInt();
				
				switch (input)
				{
					case 1:
					{
						if(!(stock.isFull()))
						{
							scan.nextLine();
							System.out.print("\nEnter Item Number: ");
							prodNumber = scan.nextLine();
							System.out.print("\nEnter Item Price: ");
							prodPrice = scan.nextInt();
							stock.insertFront(product = new Item(prodNumber,prodPrice));
							break;
						}
						else
						{
							System.out.println("The Queue is Full. \nPlease Remove Old Items from the Current Queue to Add more!");
							break;
						}
					}
					case 2:
					{
						if(!(stock.isFull()))
						{
							scan.nextLine();
							System.out.print("\nEnter Item Number: ");
							prodNumber = scan.nextLine();
							System.out.print("\nEnter Item Price: ");
							prodPrice = scan.nextInt();
							stock.insertRear(product = new Item(prodNumber,prodPrice));
							break;
						}
						else
						{
							System.out.println("The Queue is Full. \nPlease Remove Old Items from the Current Queue to Add more!");
							break;
						}
					}
					case 3:
					{
						if(stock.isEmpty())
						{
							System.out.println("The Queue is empty please add some items before using remove function!");
							break;
						}
						else
						{
							System.out.println("Removed:\n" + stock.removeFront());
							break;
						}
					}
					case 4:
					{
						if(stock.isEmpty())
						{
							System.out.println("The Queue is empty please add some items before using remove function!");
							break;
						}
						else
						{
							System.out.println("Removed:\n" + stock.removeRear());
							break;
						}
					}
					case 5:
					{
						if(stock.isEmpty())
						{
							System.out.println("The Queue is empty. \nPlease add some items to list first Item!");
							break;
						}
						else
						{
							System.out.println(stock.peekFront());
							break;
						}
					}
					case 6:
					{
						if(stock.isEmpty())
						{
							System.out.println("The Queue is empty. \nPlease add some items to list Last Item!");
							break;
						}
						else
						{
							System.out.println(stock.peekRear());
							break;
						}
					}
					case 7:
					{
						System.out.println("\n" + stock.toString());
						break;
					}
					default:
						System.out.println(" Quiting!!!");
						System.exit(0);
						break;
					}
			}
			catch (Exception e)
			{
				System.out.println("Invalid Input: Only Postive Integer!! Please Press Enter");
				scan.nextLine();
			}
			
		}while(true);
	}

}
