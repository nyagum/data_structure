package io.github.nyagum.datastructure;

public class Queue {
	private doubleLinkedList doublelinkedQueue=new doubleLinkedList();
	
	public void EnQueue(int data)
	{
		doublelinkedQueue.insertData(doublelinkedQueue.gettotalLangth(), data);
	}
	public int DeQueue(){
		return doublelinkedQueue.deleteNode();
	}
	public void printQueue(){
		doublelinkedQueue.printAllNode();
	}
}
