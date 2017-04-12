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
}

public class Linkedlist {
	private Node headNode=null;
	private int totalLangth=0;
	
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
			System.out.println("LinkedList의 길이보다 긴곳에 입력할수 없습니다.");
		}
	}
	public void printAll()
	{
		Node current=headNode;
		int i;
		for(i=1; current!=null; current=current.next, i++)
		{
			System.out.println("["+i+"]="+current.Data);
		}
		System.out.println("현재 LL의 길이는"+totalLangth);
	}
	public void deleteNode(int position)
	{
		int i=1;
		Node current=headNode;
		Node prev=null;
		
		if(position==1)				// 처음노드
		{
			current=current.next;
			headNode=null;
			headNode=current;
			totalLangth--;
		}
		else if(position==totalLangth) //마지막노드
		{
			while(position>i)
			{
				prev=current;
				current=current.next;
				i++;
			}
			prev.next=null;
			totalLangth--;
		}
		else{
			while(position>i)
			{
				prev=current;
				current=current.next;
				i++;
			}
			prev.next=current.next;
			current=null;
			totalLangth--;
		}
	}
	public static void main(String[] args) 
	{	
		Linkedlist singleLinkedList=new Linkedlist();
		singleLinkedList.insertData(1);
		singleLinkedList.insertData(2);
		singleLinkedList.insertData(3);
		singleLinkedList.insertData(4);
		singleLinkedList.insertData(5);
		singleLinkedList.insertData(1, 0);
		singleLinkedList.insertData(6);
		singleLinkedList.insertData(7);
		singleLinkedList.insertData(5,600);
		singleLinkedList.insertData(10);
		singleLinkedList.printAll();
		singleLinkedList.deleteNode(10); //마지막 노드 삭제
	
		singleLinkedList.printAll();
		singleLinkedList.deleteNode(5);
		singleLinkedList.printAll();
	//	singleLinkedList.insertData(9, 10);
	//	singleLinkedList.printAll();
	}
}
*/