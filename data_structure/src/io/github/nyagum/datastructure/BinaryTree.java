package io.github.nyagum.datastructure;

public class BinaryTree {
	private BinaryTreeNode root=null;
	
	public void InOrder(BinaryTreeNode root)
	{
		if(isEmpty()){
			return;
		}
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
		return this.root;
	}
	public boolean isEmpty()
	{
		if(root==null) return true;
		else return false;
	}
	public BinaryTreeNode Find(int n){
		BinaryTreeNode currentNode=getRoot();
		
		while(currentNode!=null)
		{	
			if(currentNode.getData()==n){
				return currentNode;
			}else if(currentNode.getData()>n){
				currentNode=currentNode.getLeftChild();
			}else{
				currentNode=currentNode.getRightChild();
			}
		}
		return currentNode;
	}
	
	
	/**
	 * 
	 * @param n - 노드에서 삭제할 데이터
	 * @return 삭제 성공 시 true, 삭제 실패시 false
	 */
	public boolean Delete(int n)
	{
		
		BinaryTreeNode deleteNode=Find(n);
		BinaryTreeNode parentNode=null;
		boolean isLeftChild=false;
		
		if(root==null)
		{
			return false;
		}
		
		if(deleteNode==null)
		{
			return false;
		}
		else
		{
			while(deleteNode!=null)
			{	
				if(deleteNode.getData()==n)
				{
					break;
				}
				else if(deleteNode.getData()>n)
				{
					isLeftChild = true;
					parentNode=deleteNode;
					deleteNode=deleteNode.getLeftChild();
				}
				else
				{
					isLeftChild=false;
					parentNode=deleteNode;
					deleteNode=deleteNode.getRightChild();
				}
			}
			
			// 양쪽다 널인 leaf노드
			if(deleteNode.isLeafNode()){
				if(deleteNode==root)
				{
					
					root=null;
				}
				if(isLeftChild){
					parentNode.setLeftChild(null);
				}else{
					parentNode.setRightChild(null);
				}
			}
			
			
			
			
			
			
			return true;
		}
		
		
		/*
		BinaryTreeNode deleteNode=Find(n);
		BinaryTreeNode parentNode=null;
		boolean isLeftChild=false;
		
		
		
		
		
		if(deleteNode!=null)
		{
			while(deleteNode!=null)
			{	
				if(deleteNode.getData()==n){
					break;
				}else if(deleteNode.getData()>n){
					isLeftChild = true;
					parentNode=deleteNode;
					deleteNode=deleteNode.getLeftChild();
				}else{
					isLeftChild=false;
					parentNode=deleteNode;
					deleteNode=deleteNode.getRightChild();
				}
			}
			
			
			if(deleteNode.isLeafNode()){
				if(deleteNode==getRoot()){
					root=null;
				}
				if(isLeftChild){
					parentNode.setLeftChild(null);
				}else{
					parentNode.setRightChild(null);
				}
			}
			else if(deleteNode.hasLeftNode() && deleteNode.hasRightNode()==false)
			{
				if(deleteNode==null){
					root=deleteNode.getLeftChild();
				}else if(isLeftChild){
					parentNode.setLeftChild(deleteNode.getRightChild());
				}else{
					parentNode.setRightChild(deleteNode.getRightChild());
				}
				
			}
			else if(deleteNode.hasLeftNode()==false && deleteNode.hasRightNode())
			{
				if(deleteNode==null){
					root=deleteNode.getLeftChild();
				}else if(isLeftChild){
					parentNode.setRightChild(deleteNode.getRightChild());
				}else{
					parentNode.setLeftChild(deleteNode.getRightChild());
				}				
			}
			else if(deleteNode.getLeftChild()!=null && deleteNode.getRightChild()!=null)
			{
				
			}

			return true;
		}
		else
		{
			return false;
		}*/
	}

	private BinaryTreeNode FindSuccessorNode(BinaryTreeNode currentNode)
	{
		return null;
	}
	
}
