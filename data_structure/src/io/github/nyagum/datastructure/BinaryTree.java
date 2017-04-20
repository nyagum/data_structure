package io.github.nyagum.datastructure;
import java.lang.Integer;

class BinaryTreeNode
{
	private int data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	public BinaryTreeNode(){
		this.data=0;
		this.left=null;
		this.right=null;
	}
	public BinaryTreeNode(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
	public int compareTo(BinaryTreeNode newNode)
	{
	    return Integer.compare(this.data, newNode.data);
	}
	public void setLeftChild(BinaryTreeNode leftChild){
		this.left=leftChild;
	}
	public BinaryTreeNode getLeftChild(){
		return this.left;
	}
	public void setRightChild(BinaryTreeNode rightChild){
		this.right=rightChild;
	}
	public BinaryTreeNode getRightChild(){
		return this.right;
	}
	public int getData(){
		return this.data;
	}
	public boolean hasLeftNode()
	{
		if(this.left==null){
			return false;
		}else{
			return true;
		}
	}
	public boolean hasRightNode()
	{
		if(this.right==null){
			return false;
		}else{
			return true;
		}
	}
	public boolean isLeafNode(){
		if(hasLeftNode() && hasLeftNode())
			return true;
		else return false;
	}
	public int compareTo(int n){
		if(n==this.data){
			return 0;
		}else if(n<this.data){
			return -1;
		}else{
			return 1;
		}
		
	}
}

public class BinaryTree {
	private BinaryTreeNode root=null;
	
	public void InOrder(BinaryTreeNode root)
	{
		if(root.hasLeftNode())
		{
			System.out.print(" {");
			InOrder(root.getLeftChild());
			System.out.print("} ");
		}
		System.out.print(root.getData());
		if(root.hasRightNode())
		{
			System.out.print(" {");
			InOrder(root.getRightChild());
			System.out.print("} ");
		}
	}
	
	public void insertData(int data) {
		BinaryTreeNode node=new BinaryTreeNode(data);
	    if (isEmpty()) {
	        root = node;
	    } else {
	        insert(node, root);
	    }
	}

	private void insert(BinaryTreeNode node, BinaryTreeNode levelNode) {
	    if(node.compareTo(levelNode) < 0) {
	        if (levelNode.getLeftChild() == null) {
	            levelNode.setLeftChild(node);
	        } else {
	            insert(node, levelNode.getLeftChild());
	        }
	    } else {

	        if (levelNode.getRightChild() == null) {
	            levelNode.setRightChild(node);
	        } else {
	            insert(node, levelNode.getRightChild());
	        }
	    }
	}
	
	public BinaryTreeNode getRoot() {
		return root;
	}
	public boolean isEmpty()
	{
		if(root==null) return true;
		else return false;
	}
	public boolean Find(int n){
		BinaryTreeNode currentNode=getRoot();
		
		while(currentNode!=null)
		{	
			switch(currentNode.compareTo(n))
			{
				case 1: currentNode=currentNode.getRightChild(); break;
				case -1: currentNode=currentNode.getLeftChild(); break;
				case 0: return true; 
			}
		}
		return false;
	}
	public boolean Delete(int n)
	{
		BinaryTreeNode deleteNode=getRoot();
		BinaryTreeNode parentNode=null;
		
		while(deleteNode!=null)
		{	
			switch(deleteNode.compareTo(n))
			{
				case 1: 
						parentNode=deleteNode;
						deleteNode=deleteNode.getRightChild();
						break;
				case -1:
						parentNode=deleteNode;
						deleteNode=deleteNode.getLeftChild();
						break;
				case 0:
						break;
			}
		}
		
		
		BinaryTreeNode Successor=FindSuccessorNode(deleteNode.getRightChild());
		
		if(deleteNode!=null){
			Successor.setLeftChild(deleteNode.getLeftChild());
			Successor.setRightChild(deleteNode.getRightChild());
			//parentNode=Successor;
			return true;
		}
		return false;
	}

	private BinaryTreeNode FindSuccessorNode(BinaryTreeNode currentNode)
	{
		BinaryTreeNode preNode=null;
		if(currentNode!=null){
			while(currentNode.hasLeftNode()){
				preNode=currentNode;
				currentNode=currentNode.getLeftChild();
			}
			preNode.setLeftChild(null);
			return currentNode;
		}
		return null;
	}
	private BinaryTreeNode FindNode(int n){
		BinaryTreeNode currentNode=getRoot();
		
		while(currentNode!=null)
		{	
			switch(currentNode.compareTo(n))
			{
				case 1: currentNode=currentNode.getRightChild();
						break;
				case -1: currentNode=currentNode.getLeftChild();
						break;
				case 0:
						return currentNode; 
			}
		}
		return null;
	}
	
}
