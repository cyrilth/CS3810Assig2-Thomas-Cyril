/*
 * Cyril Thomas CS3810 DS&A Assignment 2 03/10/14
 * MyDeque Class : - A linear collection that supports element insertion and removal at both ends.
 *
 * MyDeque Class APIs:
 * 	(01) Parameterized constructor 		 : - (a) @param int s to set the array (queArray) size.
 * 									  		 (b) Contains private instance Variables : int maxSize, front, rear, nItems and queArray.
 * 	(02) public void insertRear(Item j)  : - @param Item j to pass an Item object into the rear of the queue.
 * 	(03) public void insertFront(Item j) : - @param Item j to pass an Item object into the front of the queue.
 * 	(04) public Item removeRear() 		 : - to remove and return the Item currently held by queArray[rear].
 * 	(05) public Item removeFront() 		 : - to remove and return the Item currently held by queArray[front].
 *  (06) public Item peekRear() 		 : - to return the item currently held by queArray[rear].
 *  (07) public Item peekFront() 		 : - to return the item currently held by queArray[front].
 *  (08) public boolean isEmpty() 		 : - to return true if the current deque(array) is full.  
 *  (09) public boolean isFull() 		 : - to return true if the current deque(array) is empty.
 *  (10) public String toString() 		 : - to list data stored in the current deque(array) in the sequence from front to rear.
 *
 * Strategy:
 * 	(01) To create an Array Deque of Items. Allowing the main() to set the size of the array.
 *  (02) insertRear() pass an Item to the rear of Deque and increment rear and nItems. If rear has reached the maxSize of the array, then reset rear value to -1.
 *  (03) insertFront() pass an Item to the front of Deque and increment front and nItems. If front has reached the maxSize of the array, then reset front value to 0.
 *  (04) removeRear()  to remove an Item from the rear of the Deque by storing the current value of the array[rear] to the temp and decrementing rear and nItems.
 *  				   if rear has a value of -1(bottom). Then the rear is moved back to the top of the array by setting rear to maxSize-1. 
 *  (05) removeFront() same as removeRear() except if front reaches to the top maxSize of the array. Then front value is set to the bottom of the array as zero.
 *  (06) peekRear() returns whatever Item is currently held by the array[rear].
 *  (07) peekFront() returns whatever Item is currently held by the array[front].
 *  (08) isEmpty() returns a boolean value by checking nItems. If nItems is Zero, that means the array is empty. nItems is controlled by incrementing or decrementing
 *   			   by insert or remove function. 
 *	(09) isFull() same as isEmpty but my comparing nItems value to the maxSize. If they are equal then the function is true. 
 *	(10) toString() displays the entire values held in the array from front to rear. If nItems is Zero, then the deque is considered to be empty.
 *					If nItems have value other than zero then a tempItem is created and set to Zero and also a temp is created and set to front value. 
 *					Then a while is created with condition if tempItem is not equal to nItems. Then an If statement is used to check whether the temp is equal to maxSize. 
 *     				If temp is equal to maxSize then temp is set to zero. Then the String stri is concatenated with array[temp] inside the while loop. 
 *     				While array[temp] is refereed to the toString of Item.toString stored in the array. 	   
 */

public class MyDeque 
{
	private int maxSize;
	private Item[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public MyDeque(int s)
	{
		maxSize = s;
		queArray = new Item[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insertRear(Item j)
	{
		if(rear == maxSize-1)
			rear = -1;
		queArray[++rear] = j;
		nItems++;
	}
	
	public void insertFront(Item j)
	{
		if(front == 0)
			front = maxSize;
		queArray[--front] = j;
		nItems++;
	}
	
	public Item removeRear()
	{
		Item temp = queArray[rear--];
		if (rear == -1)
			rear=maxSize-1;
		nItems--;
		return temp;
	}
	
	public Item removeFront()
	{
		Item temp = queArray[front++];
		if(front == maxSize)
			front = 0;
		nItems--;
		return temp;
	}
	
	public Item peekRear()
	{
		return queArray[rear];
	}
	
	public Item peekFront()
	{
		return queArray[front];
	}
	
	public boolean isEmpty()
	{
		return (nItems==0);		
	}
	
	public boolean isFull()
	{
		return (nItems==maxSize);
	}
	
	public String toString()
	{
		String stri ="The DeQueue:\n";
		if(nItems == 0)
			return stri += "Empty";
		else
		{
			int temp = front;
			int tempItems = 0;
			while (!(tempItems == nItems))
			{
				if (temp == maxSize)
					temp = 0;
				stri += queArray[temp++].toString();
				tempItems++;
			}
			return stri;
		}
	}
}
