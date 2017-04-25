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