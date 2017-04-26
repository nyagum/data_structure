package io.github.nyagum.datastructure;

public class Queue
{
	private DoubleLinkedList doublelinkedQueue = new DoubleLinkedList();

	/**
	 * 
	 * @param data 큐에 데이터를 집어넣는다.
	 */
	public void EnQueue(int data)
	{
		doublelinkedQueue.add(doublelinkedQueue.size(), data);
	}

	/**
	 * 
	 * @return 집어넣은 데이터를 뺀다.
	 */
	public int DeQueue()
	{
		return doublelinkedQueue.get(0);
	}

	public void printQueue()
	{
		doublelinkedQueue.printAllNode();
	}
	
	public boolean isEmpty(){
		return (doublelinkedQueue==null);
	}
	public int size(){
		return doublelinkedQueue.size();
	} 
}
