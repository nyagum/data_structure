package io.github.nyagum.datastructure;
/*
class Node
{
	public int Data;
	public Node next;
	
	public Node(int data){
		this.Data=data;
		this.next=null;
	}
}*/
class Linkedlist {
	private Node headNode=null;
	private int totalLangth=0;
	
	public Linkedlist()
	{
		headNode=null;
		totalLangth=0;
	}
	public void insertData(int data)
	{
		Node current=headNode;
		if(headNode==null)
		{
			headNode=new Node(data);
			totalLangth++;
		}
		else
		{	
			for(;current.next!=null;current=current.next){}
			Node newNode=new Node(data);
			current.next=newNode;
			totalLangth++;
		}
	}
	public void insertData(int position, int data)
	{
		Node current=headNode;

		if(position==1){
			if(headNode==null)
			{
				headNode=new Node(data);
				totalLangth++;
			}
			else{
				headNode=new Node(data);
				headNode.next=current;
				totalLangth++;
			}
		}
		else if(totalLangth>position)
		{
			int i=1;
			
			while(position>i){
				current=current.next;
				i++;
			}
			Node newNode=new Node(data);
			newNode.next=current.next;
			current.next=newNode;
			totalLangth++;
		}
		else if(totalLangth==position)
		{
			insertData(data);
		}
		else
		{
			System.out.println("LinkedList�� ���̺��� ����� �Է��Ҽ� �����ϴ�.");
		}
	}
	public void printAll()
	{
		Node current=headNode;
		int i;
		for(i=1; current!=null; current=current.next, i++)
		{
			System.out.print("["+i+"]="+current.Data+" ");
		}
		System.out.println("���� LL�� ���̴�"+totalLangth);
	}
	public int deleteNode(int position)
	{
		int i=1;
		Node current=headNode;
		Node prev=null;
		int returnValue=0;
		if(position==1)				// ó�����
		{
			returnValue=current.Data;
			current=current.next;
			headNode=null;
			headNode=current;
			totalLangth--;
			return returnValue;
		}
		else if(position==totalLangth) //���������
		{
			while(position>i)
			{
				prev=current;
				current=current.next;
				i++;
			}
			returnValue=current.Data;
			prev.next=null;
			totalLangth--;
			return returnValue;
		}
		else{
			while(position>i)
			{
				prev=current;
				current=current.next;
				i++;
			}
			returnValue=current.Data;
			prev.next=current.next;
			current=null;
			totalLangth--;
			return returnValue;
		}
	}
}
public class Stack {
	private Linkedlist linkedlist=new Linkedlist();
	
	public void push(int data)
	{
		linkedlist.insertData(data);
	}
	public void pop()
	{
		int popValue=linkedlist.deleteNode(1);
		System.out.println("["+popValue+"]");
	}
	public void printStack(){
		linkedlist.printAll();
	}
}