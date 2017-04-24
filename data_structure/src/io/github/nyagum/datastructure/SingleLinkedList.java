package io.github.nyagum.datastructure;

public class SingleLinkedList {
	private SingleLinkedListNode headNode;
	private int totalLangth;

	public void LikedList(){
		this.headNode=null;
		this.totalLangth=0;
	}

	/**
	 * SingleLinkedList �� ������ ������ �����ϴ� �޼ҵ�
	 * @return SingleLinkedList �� ������ ������ ����
	 */
	public int size(){
		return totalLangth;
	}
	
	/**
	 * SingleLinkedList�� ������ ��忡 int�����͸� �߰�
	 * @param data
	 * @return �߰� �Ǿ����� true, �߰� ���� �ʾ����� false  
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
	 * @param position ������ �ε�����
	 * @param data Integer�� �����͸� �ִ´�.
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
	 * linkedlist�� ó������ ���鼭 �����͸� ã�´�.
	 * @param data
	 * @return data�� ������  true ������ false
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
	 * SingleLinkedList ���� ������ index�� �ָ� �� �ش��ϴ� �ε����� �����͸� �����ϰ� �������ִ� �޼ҵ�
	 * @param index - ������ index
	 * @return ���� ���� �� ������ �ε����� �ִ� ������, ���� ���н� -1
	 */
	public int get(int index){
		SingleLinkedListNode current=this.headNode;
		SingleLinkedListNode prev = null;
		int returnValue = 0;
		int i=0;
		
		if(size()==0 || size()<index){
			return -1;
		}
		
		if (index == 0) // ó�����
		{
			returnValue = current.Data;
			current = current.next;
			headNode = null;
			headNode = current;
			totalLangth--;
			return returnValue;
		}
		else if (index == totalLangth) // ���������
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
	 * data�� �ָ� �׿� �´� ���ϰ��� ��
	 * @param data
	 * @return index����
	 */
	public int indexOf(int data)
	{
		SingleLinkedListNode current=headNode;
		
		if(size()==0)
		{
			return -1;
		}
		
		for(int index=0; index<size(); index++)
		{
			if(current.Data==data)
			{
				return index;
			}
			else
			{
				current = current.next;
			}
		}
		return -1;
	} 
	
	/**
	 * Linkedlist�� ����ϴ� �޼ҵ�
	 */
	public void printAll()
	{
		SingleLinkedListNode current=headNode;
		int i;
		for(i=0; current!=null; current=current.next, i++)
		{
			System.out.print("["+i+"]="+current.Data+", ");
		}
		System.out.println("���� LL�� ���̴�"+totalLangth);
	}	
}
