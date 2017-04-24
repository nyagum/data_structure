package io.github.nyagum.datastructure;

class DoubleLinkedListNode
{
	public int Data;
	public DoubleLinkedListNode next;
	public DoubleLinkedListNode prev;
	
	public DoubleLinkedListNode(int data){
		this.Data=data;
		this.next=null;
		this.prev=null;
	}
}

public class doubleLinkedList
{
	private DoubleLinkedListNode headNode=null;
	private DoubleLinkedListNode tailNode=null;
	private int totalLangth=0;
	
	public int gettotalLangth()
	{
		return totalLangth;
	}
	public void insertData(int data)
	{
		DoubleLinkedListNode newNode=new DoubleLinkedListNode(data);
		if(headNode==null && tailNode==null)
		{
			headNode=newNode;
			tailNode=newNode;
			totalLangth++;
		}
		else
		{
			insertData(0, data);
		}
	}
	public void insertData(int position, int data){
		DoubleLinkedListNode current=headNode;
		DoubleLinkedListNode prev=null;
		int i=1;
		DoubleLinkedListNode newNode=new DoubleLinkedListNode(data);
		
		if(position==0)
		{
			if(headNode==null)
			{
				headNode=newNode;
				tailNode=newNode;
				totalLangth++;
			}
			else
			{
				newNode.next=headNode;
				headNode.prev=newNode;
				headNode=newNode;
				totalLangth++;
			}
		}
		else if(position==totalLangth)
		{
			newNode.prev=tailNode;
			tailNode.next=newNode;
			tailNode=newNode;
			totalLangth++;
		}else if(position<totalLangth)
		{
			while(i<=position)
			{
				prev=current;
				current=current.next;
				i++;
			}
			newNode.prev=prev;
			prev.next=newNode;
			newNode.next=current;
			current.prev=newNode;
			
			totalLangth++;
			
		}else{}
	}
	
	public int deleteNode()
	{
		DoubleLinkedListNode current=headNode;
		int returnData=0;
		if(headNode==null && tailNode==null)
		{
			System.out.println("리스트는 비어 있습니다.");
		}
		else
		{
			returnData=current.Data;
			headNode=current.next;
			current.next.prev=null;
			current.next=null;
			totalLangth--;
		}
		return returnData;
	}
	public int deleteNode(int position)
	{
		DoubleLinkedListNode current=headNode;
		int i=1;
		int returnData=0;
		if(position==0)
		{
			returnData=deleteNode();
		}
		else if(position>totalLangth)
		{
			System.out.println("삭제할수 없습니다");
		}
		else if(position==totalLangth)
		{
			current=tailNode;
			tailNode=current.prev;
			current.prev.next=null;
			current.prev=null;
			totalLangth--;
		}
		else
		{
			while(i<position)
			{
				current=current.next;
				i++;
			}
			current.prev.next=current.next;
			current.next.prev=current.prev;
			totalLangth--;
		}
		return returnData;
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
		System.out.println("totalLangth="+totalLangth);
		System.out.println("=======================================");		
	}
	public void printReverse()
	{
		DoubleLinkedListNode current=tailNode;
		int i=totalLangth;
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
		System.out.println("totalLangth="+totalLangth);
		System.out.println("=======================================");
	}
}
