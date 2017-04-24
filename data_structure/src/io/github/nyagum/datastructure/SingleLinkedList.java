package io.github.nyagum.datastructure;

import java.util.LinkedList;
import java.util.List;

public class SingleLinkedList {
	private SingleLinkedListNode headNode;
	private int totalLangth;

	public void LikedList(){
		this.headNode=null;
		this.totalLangth=0;
	}

	/**
	 * SingleLinkedList 의 데이터 개수를 리턴하는 메소드
	 * @return SingleLinkedList 의 데이터 개수를 리턴
	 */
	public int size(){
		return totalLangth;
	}
	
	/**
	 * SingleLinkedList의 마지막 노드에 int데이터를 추가
	 * @param data
	 * @return 추가 되었으면 true, 추가 되지 않았으면 false  
	 */
	public boolean add(int data)
	{
		SingleLinkedListNode current=headNode;
		if(headNode==null)
		{
			headNode=new SingleLinkedListNode(data);
			totalLangth++;
			return true;
		}
		else
		{	
			for(;current.next!=null;current=current.next){}
			SingleLinkedListNode newNode=new SingleLinkedListNode(data);
			current.next=newNode;
			totalLangth++;
			return true;
		}
	}
	
	/**
	 * 
	 * @param position 지정한 인덱스에
	 * @param data Integer형 데이터를 넣는다.
	 */
	public void add(int position, int data)
	{
		SingleLinkedListNode current=headNode;

		if(position==0){
			if(headNode==null)
			{
				headNode=new SingleLinkedListNode(data);
				totalLangth++;
			}
			else{
				headNode=new SingleLinkedListNode(data);
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
			SingleLinkedListNode newNode=new SingleLinkedListNode(data);
			newNode.next=current.next;
			current.next=newNode;
			totalLangth++;
			
		}
		else if(totalLangth==position)
		{
			add(data); 
		}
	}	
	
	/**
	 * linkedlist를 처음부터 돌면서 데이터를 찾는다.
	 * @param data
	 * @return data가 있으면  true 없으면 false
	 */
	public boolean contains(int data){
		
		SingleLinkedListNode current=headNode;
		
		while(current!=null){
			if(current.Data==data)
			{
				return true;
			}
			current=current.next;
		}
		return false;
	}
	
	/**
	 * SingleLinkedList 에서 삭제할 index를 주면 그 해당하는 인덱스에 데이터를 리턴하고 삭제해주는 메소드
	 * @param index - 삭제할 index
	 * @return 삭제 성공 시 삭제할 인덱스에 있던 데이터, 삭제 실패시 -1
	 */
	public int get(int index){
		SingleLinkedListNode current=this.headNode;
		SingleLinkedListNode prev = null;
		int returnValue = 0;
		int i=0;
		
		if(size()==0){
			return -1;
		}
	
		if (index == 0) // 처음노드
		{
			returnValue = current.Data;
			current = current.next;
			headNode = null;
			headNode = current;
			totalLangth--;
			return returnValue;
		}
		else if (index == totalLangth) // 마지막노드
		{
			while (index > i)
			{
				prev = current;
				current = current.next;
				i++;
			}
			returnValue = current.Data;
			prev.next = null;
			totalLangth--;
			return returnValue;
		}
		else
		{
			while (index > i)
			{
				prev = current;
				current = current.next;
				i++;
			}
			returnValue = current.Data;
			prev.next = current.next;
			current = null;
			totalLangth--;
			return returnValue;
		}
	}

	/**
	 * Linkedlist를 출력하는 메소드
	 */
	public void printAll()
	{
		SingleLinkedListNode current=headNode;
		int i;
		for(i=0; current!=null; current=current.next, i++)
		{
			System.out.print("["+i+"]="+current.Data+", ");
		}
		System.out.println("현재 LL의 길이는"+totalLangth);
	}
	
	public static void main(String[] args) 
	{	
//		List<Integer> list=new LinkedList<Integer>();
//		list.add(0, 100);
//		System.out.println(list.indexOf(100));
//		
		
		SingleLinkedList singleLinkedList=new SingleLinkedList();
		singleLinkedList.add(2);
		singleLinkedList.add(3);
		singleLinkedList.add(4);
		singleLinkedList.add(5);
		singleLinkedList.printAll();
		
		singleLinkedList.add(0, 1);
		singleLinkedList.printAll();
		
		singleLinkedList.add(6);
		singleLinkedList.add(7);
		singleLinkedList.add(5,600);
		singleLinkedList.add(10);
		singleLinkedList.printAll();
		System.out.println(singleLinkedList.get(4));
		singleLinkedList.printAll();
		System.out.println(singleLinkedList.get(0));
		singleLinkedList.printAll();
		System.out.println(singleLinkedList.get(6));
		singleLinkedList.printAll();
	}
}
