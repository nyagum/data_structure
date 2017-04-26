package io.github.nyagum.datastructure;

public class Stack
{
	private SingleLinkedList linkedlist = new SingleLinkedList();

	/**
	 * 스택에 데이터를 집어넣는다.
	 * @param data
	 */
	public void push(int data)
	{
		linkedlist.add(data);
	}
	
	/**
	 * 먼저 집어넣은 데이터가 제일 나중에 나온다.
	 * @return 가장 늦게 넣은 데이터가 먼저 나온다.
	 */
	public int pop()
	{
		int popValue = linkedlist.get(0);
		return popValue;
	}
	/**
	 * 스택의 내용들을 출력
	 */
	public void printStack()
	{
		linkedlist.printAll();
	}
	
	/**
	 *  
	 * @return Stack이 비었는지 알려준다.
	 */
	public boolean isEmpty(){
		return (linkedlist==null);
	}
	
	/**
	 * 
	 * @return Stack의 사이즈를 알려준다.
	 */
	public int size(){
		return linkedlist.size();
	} 	
}