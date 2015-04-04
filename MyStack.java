/*
 * Cyril Thomas CS3810 DS&A Assignment 2 03/10/14
 * MyStack Class : - The Stack class represents a last-in-first-out (LIFO) stack of objects. 
 * 
 * MyStack Class APIs:
 * 	(01) Parameterized constructor	: - @param int s to set the MyDeque(size).
 * 	(02) public void push(Item j) 	: - @param Item j to pass an Item object into the rear of the stack. 
 * 	(03) public Item pop() 			: - to remove and return the current Item in arrayDequeStack[rear].
 * 	(04) public Item pop() 			: - to return the current Item in arrayDequeStack[rear].
 * 	(05) public boolean isEmpty()	: - to return a boolean value true if the arrayDequeStack is empty. 
 * 	(06) public boolean isFull()	: - to return a true if the arrayDequeStack is full.
 * 	(07) public String toString()	: - to display the All current Items in Stack. 
 * 
 * Strategy:
 * 	(01) Using delegation technique by creating a MyDeque object and then reusing the methods already created in the MyDeque class.
 * 	(02) For push(), pop() and peek() : - Reusing MyDeque insertRear(), removeRear() and peekRear() functions because in stack the top reference
 * 										  is similar to the rear in MyDeque.
 *  (03) For isEmpty, isFull and toString : - Reusing MyDequeObject.isEmpty/isFull/toString 
 */
public class MyStack 
{
	
	private MyDeque stackX;
	
	public MyStack(int s) 
	{
		stackX = new MyDeque(s);	
	}
	
	public void push (Item j)
	{
		stackX.insertRear(j);
	}
	
	public Item pop()
	{
		return stackX.removeRear();
	}
	
	public Item peek()
	{
		return stackX.peekRear();
	}
	
	public boolean isEmpty()
	{
		return stackX.isEmpty();
	}
	
	public boolean isFull()
	{
		return stackX.isFull();
	}
	
	public String toString()
	{
		return stackX.toString();
	}

}
