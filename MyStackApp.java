/*
 * Cyril Thomas CS3810 DS&A Assignment 2 03/10/14
 * MyStackApp class: - Main Class to test MyStack and Item class.
 * 
 * Strategy : Similar to MyDequeApp Strategy. Just with fewer operations similar to Stack functions.  
 */

import java.util.Scanner;
import java.io.*;

public class MyStackApp 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int input;
		
		String prodNumber;
		int prodPrice;
		MyStack stock;
		Item product;
		
		while(true)
		{
			try 
			{
				System.out.print("Enter the total number of items(size)(To Quit:0): "); //size
				input = scan.nextInt();
				stock = new MyStack(input);
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
			System.out.println("\nEnter: 1 to Add Items to Top of the Stack");
			System.out.println("Enter: 2 to Remove Items from Top of the Stack");
			System.out.println("Enter: 3 to List the Top Item in the Stack");
			System.out.println("Enter: 4 to Display the Entire Stack");
			System.out.println("Enter: 0 to Quit");
			System.out.print("\nEnter : ");
			
			try
			{
				input= scan.nextInt();
				
				switch(input)
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
							stock.push(product = new Item(prodNumber,prodPrice));
							break;
						}
						else
						{
							System.out.println("The Stack is Full. \nPlease Remove Old Items from the Current Stack to Add more!");
							break;
						}
					}
					case 2:
					{
						if(stock.isEmpty())
						{
							System.out.println("The Stack is empty please add some items before using remove function!");
							break;
						}
						else
						{
							System.out.println("Removed:\n" + stock.pop());
							break;
						}
					}
					case 3:
					{
						{
							if(stock.isEmpty())
							{
								System.out.println("The Stack is empty. \nPlease add some items to show the Top Item!");
								break;
							}
							else
							{
								System.out.println(stock.peek());
								break;
							}
						}
					}
					case 4:
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
