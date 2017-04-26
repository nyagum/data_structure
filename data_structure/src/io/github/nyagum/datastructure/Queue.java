package io.github.nyagum.datastructure;

public class Queue
{
	private DoubleLinkedList doublelinkedQueue = new DoubleLinkedList();

	/**
	 * 
	 * @param data ť�� �����͸� ����ִ´�.
	 */
	public void EnQueue(int data)
	{
		doublelinkedQueue.add(doublelinkedQueue.size(), data);
	}

	/**
	 * 
	 * @return ������� �����͸� ����.
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
