package io.github.nyagum.datastructure;

public class Stack
{
	private SingleLinkedList linkedlist = new SingleLinkedList();

	public void push(int data)
	{
		linkedlist.add(data);
	}

	public int pop()
	{
		int popValue = linkedlist.deleteNode(1);
		return popValue;
	}

	public void printStack()
	{
		linkedlist.printAll();
	}
}