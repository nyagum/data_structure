package io.github.nyagum.datastructure;

class Node
{
	public int Data;
	public Node next;
	public Node prev;
	
	public Node(int data){
		this.Data=data;
		this.next=null;
		this.prev=null;
	}
}


public class doubleLinkedList
{
	private Node headNode=null;
	private Node tailNode=null;
	private int totalLangth=0;
	
	public int gettotalLangth()
	{
		return totalLangth;
	}
	public void insertData(int data)
	{
		Node newNode=new Node(data);
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
		Node current=headNode;
		Node prev=null;
		int i=1;
		Node newNode=new Node(data);
		
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
		Node current=headNode;
		int returnData=0;
		if(headNode==null && tailNode==null)
		{
			System.out.println("����Ʈ�� ��� �ֽ��ϴ�.");
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
		Node current=headNode;
		int i=1;
		int returnData=0;
		if(position==0)
		{
			returnData=deleteNode();
		}
		else if(position>totalLangth)
		{
			System.out.println("�����Ҽ� �����ϴ�");
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
		Node current=headNode;
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
		System.out.println("totalLangth="+totalLangth);
		System.out.println("=======================================");		
	}
	public void printReverse(){
		Node current=tailNode;
		int i=totalLangth;
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
		System.out.println("totalLangth="+totalLangth);
		System.out.println("=======================================");
	}
	
	/*
	public static void main(String[] args)
	{
		doubleLinkedList ddList=new doubleLinkedList();
	//	ddList.printAllNode();
	//	ddList.printReverse();
		
		ddList.insertData(1);
		ddList.insertData(2);
		ddList.insertData(3);
		ddList.insertData(4);
		ddList.insertData(5);
		ddList.insertData(6);
		ddList.insertData(7);
		ddList.insertData(8);
		ddList.insertData(9);
		ddList.printAllNode();
		ddList.printReverse();
		ddList.deleteNode(9);
		ddList.deleteNode(8);
		ddList.deleteNode(2);
	//	ddList.deleteNode(2);
		ddList.printAllNode();
		ddList.printReverse();
	}*/
}
