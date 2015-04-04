/*
 * Cyril Thomas CS3810 DS&A Assignment 2 03/10/14
 * Item Class: - Defining Item Number and Price
 * 
 * Item Class APIs:
 * 	(1) Parameterized constructor Item :- (a) @param String newItemNumber:- to set item number.
 * 										  (b) @param double newItemPrice: - to set item price.
 * 	(2) public String getItemNumber()  :- to retrieve item number.
 * 	(3) public double getItemPrice()   :- to retrieve item price.
 * 	(4) public void setItemNumber(String newNumberItem) :- @param String newNumberItem to set item number. 
 * 	(5) public void setItemPrice(double newNumberPrice) :- @param double newNumberPrice to set item price.
 * 	(6) public String toString() : - to display item number and price in an item object. 
 * 
 * Strategy: - To Create an Item Object containing Item Number and price. 
 */
public class Item 
{
	private String itemNumber;
	private double itemPrice;
	
	public Item ()
	{
		itemNumber = "000000";
		itemPrice = 0.00;
	}
	
	public Item (String newItemNumber, double newItemPrice)
	{
		itemNumber = newItemNumber;
		itemPrice = newItemPrice;
	}
	
	public String getItemNumber()
	{
		return itemNumber;
	}
	
	public double getItemPrice()
	{
		return itemPrice;
	}
	
	public void setItemNumber(String newNumberItem)
	{
		itemNumber =newNumberItem;
	}
	
	public void getItemPrice(double newPriceItem)
	{
		itemPrice = newPriceItem;
	}
	
	public String toString()
	{
		return "Item Number \t\tItem Price\n\t" + itemNumber + " \t\t" + itemPrice + "\n";
	}
}
