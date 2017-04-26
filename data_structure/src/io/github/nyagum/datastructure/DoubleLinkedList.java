package io.github.nyagum.datastructure;

public class DoubleLinkedList
{
	private DoubleLinkedListNode headNode=null;
	private DoubleLinkedListNode tailNode=null;
	private int size=0;
	
	/**
	 * doubleLinkedList의 데이터 갯수를 리턴하는 함수
	 * @return doubleLinkedList의 데이터 갯수
	 */
	public int size()
	{
		return size;
	}
	
	/**
	 * 리스트가 비었는지 안비었는지 여부 리턴
	 * @return
	 */
	public boolean isEmpty()
	{
		return size==0;
	}

	/**
	 * 첫번째 노드에 데이터 추가
	 * @param data
	 */
	public boolean add(int data)
	{
		
		DoubleLinkedListNode newNode=new DoubleLinkedListNode(data);
		if(headNode==null && tailNode==null)
		{
			headNode=newNode;
			tailNode=newNode;
			size++;
			return true;
		}
		else
		{
			return add(0, data);
		}
	}
	
	/**
	 * 인덱스에 데이터를 추가
	 * @param index
	 * @param 제대로 추가가 되면 true 안되면 false
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
	 * @return 제대로 리턴되면 index의 해당되는 값을 리턴 아니면 -1를 리턴
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
			System.out.println("리스트는 비어 있습니다.");
			
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
			System.out.println("리스트는 비어 있습니다.");
			
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
