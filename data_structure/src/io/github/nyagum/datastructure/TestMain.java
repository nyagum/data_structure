package io.github.nyagum.datastructure;

public class TestMain
{
	public static void main(String[] args)
	{
		Queue myQueue=new Queue();
		myQueue.EnQueue(1);
		myQueue.EnQueue(11);
		myQueue.EnQueue(12);
		myQueue.EnQueue(13);
		myQueue.EnQueue(14);
		myQueue.EnQueue(15);
		myQueue.EnQueue(16);
		myQueue.EnQueue(17);
		myQueue.EnQueue(18);
		myQueue.printQueue();
		//
		myQueue.DeQueue();
		myQueue.DeQueue();
		myQueue.printQueue();
	}	
}
