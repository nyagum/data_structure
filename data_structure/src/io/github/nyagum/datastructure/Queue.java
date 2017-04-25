package io.github.nyagum.datastructure;

public class Queue
{
	private doubleLinkedList doublelinkedQueue = new doubleLinkedList();

	public void EnQueue(int data)
	{
		doublelinkedQueue.add(doublelinkedQueue.size(), data);
	}

	public int DeQueue()
	{
		return doublelinkedQueue.get(0);
	}

	public void printQueue()
	{
		doublelinkedQueue.printAllNode();
	}
}
