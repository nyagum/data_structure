package io.github.nyagum.datastructure;

import java.util.LinkedList;
import java.util.List;


public class doubleLinkedList
{
	private DoubleLinkedListNode headNode=null;
	private DoubleLinkedListNode tailNode=null;
	private int size=0;
	
	/**
	 * doubleLinkedList�� ������ ������ �����ϴ� �Լ�
	 * @return doubleLinkedList�� ������ ����
	 */
	public int size()
	{
		return size;
	}
	
	/**
	 * ����Ʈ�� ������� �Ⱥ������ ���� ����
	 * @return
	 */
	public boolean isEmpth(){return size==0;}

	/**
	 * ù��° ��忡 ������ �߰�
	 * @param data
	 */
	public void add(int data)
	{
		
		DoubleLinkedListNode newNode=new DoubleLinkedListNode(data);
		if(headNode==null && tailNode==null)
		{
			headNode=newNode;
			tailNode=newNode;
			size++;
		}
		else
		{
			add(0, data);
		}
	}
	
	/**
	 * �ε����� �����͸� �߰�
	 * @param index
	 * @param ����� �߰��� �Ǹ� true �ȵǸ� false
	 */
	public boolean add(int index, int data){
		DoubleLinkedListNode current=headNode;
		DoubleLinkedListNode prev=null;
		int i=0;
		DoubleLinkedListNode newNode=new DoubleLinkedListNode(data);
		
		if(index==0)
		{
			if(headNode==null)
			{
				headNode=newNode;
				tailNode=newNode;
				size++;
			}
			else
			{
				newNode.next=headNode;
				headNode.prev=newNode;
				headNode=newNode;
				size++;
			}
			return true;
		}
		else if(index==size)
		{
			newNode.prev=tailNode;
			tailNode.next=newNode;
			tailNode=newNode;
			size++;
			return true;
		}
		else if(index<size)
		{
			while(i<index)
			{
				prev=current;
				current=current.next;
				i++;
			}
			newNode.prev=prev;
			prev.next=newNode;
			newNode.next=current;
			current.prev=newNode;
			
			size++;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * 
	 * @return ����� ���ϵǸ� index�� �ش�Ǵ� ���� ���� �ƴϸ� -1�� ����
	 */
	public int get(int index)
	{
		DoubleLinkedListNode current=headNode;
		int returnData=0;
		if(size()==0 || size()<index)
		{
			return -1;
		}
		
		if(index==0)
		{
			
			returnData=current.Data;
			headNode=current.next;
			current.next.prev=null;
			current.next=null;
			size--;
			return returnData;
			
		}
		else if(index==size())
		{
			
			current=tailNode;
			returnData=current.Data;
			tailNode=current.prev;
			current.prev.next=null;
			current.prev=null;
			size--;
			return returnData;
		}
		else 
		{
			for(int i=0; i<index; i++)
			{
				current=current.next;
			}
			current.prev.next=current.next;
			current.next.prev=current.prev;
			size--;
			
			return returnData;
		}
	}

	
	public void printAllNode()
	{
		DoubleLinkedListNode current=headNode;
		int i=1;
		if(headNode==null && tailNode==null)
		{
			System.out.println("����Ʈ�� ��� �ֽ��ϴ�.");
			
		}
		else
		{
			while(current!=null)
			{
				System.out.print("["+i+"]="+current.Data+", ");
				current=current.next;
				i++;
			}
		}
		System.out.println("totalLangth="+size);
		System.out.println("=======================================");		
	}
	public void printReverse()
	{
		DoubleLinkedListNode current=tailNode;
		int i=size;
		if(headNode==null && tailNode==null)
		{
			System.out.println("����Ʈ�� ��� �ֽ��ϴ�.");
			
		}
		else
		{
			while(current!=null)
			{
				System.out.print("["+i+"]="+current.Data+", ");
				current=current.prev;
				i--;
			}
		}
		System.out.println("totalLangth="+size);
		System.out.println("=======================================");
	}
}
