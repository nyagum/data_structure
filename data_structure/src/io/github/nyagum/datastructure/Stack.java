package io.github.nyagum.datastructure;

public class Stack
{
	private SingleLinkedList linkedlist = new SingleLinkedList();

	/**
	 * ���ÿ� �����͸� ����ִ´�.
	 * @param data
	 */
	public void push(int data)
	{
		linkedlist.add(data);
	}
	
	/**
	 * ���� ������� �����Ͱ� ���� ���߿� ���´�.
	 * @return ���� �ʰ� ���� �����Ͱ� ���� ���´�.
	 */
	public int pop()
	{
		int popValue = linkedlist.get(0);
		return popValue;
	}
	/**
	 * ������ ������� ���
	 */
	public void printStack()
	{
		linkedlist.printAll();
	}
	
	/**
	 *  
	 * @return Stack�� ������� �˷��ش�.
	 */
	public boolean isEmpty(){
		return (linkedlist==null);
	}
	
	/**
	 * 
	 * @return Stack�� ����� �˷��ش�.
	 */
	public int size(){
		return linkedlist.size();
	} 	
}