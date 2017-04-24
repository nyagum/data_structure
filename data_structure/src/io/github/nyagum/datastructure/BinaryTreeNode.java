package io.github.nyagum.datastructure;

public class BinaryTreeNode
{
	private int data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;

	public BinaryTreeNode()
	{
		this.data = 0;
		this.left = null;
		this.right = null;
	}

	public BinaryTreeNode(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public void setRight(BinaryTreeNode right)
	{
		this.right = right;
	}

	public void setLeft(BinaryTreeNode left)
	{
		this.left = left;
	}

	public void setLeftChild(BinaryTreeNode leftChild)
	{
		this.left = leftChild;
	}

	public BinaryTreeNode getLeftChild()
	{
		return this.left;
	}

	public void setRightChild(BinaryTreeNode rightChild)
	{
		this.right = rightChild;
	}

	public BinaryTreeNode getRightChild()
	{
		return this.right;
	}

	public int getData()
	{
		return this.data;
	}

	public boolean hasLeftNode()
	{
		if (this.left == null)
		{
			return false;
		} else
		{
			return true;
		}
	}

	public boolean hasRightNode()
	{
		if (this.right == null)
		{
			return false;
		} else
		{
			return true;
		}
	}

	public boolean isLeafNode()
	{
		if (hasLeftNode() && hasLeftNode())
			return true;
		else
			return false;
	}

	public int compareTo(int n)
	{
		return Integer.compare(this.data, n);
	}

	public int compareTo(BinaryTreeNode newNode)
	{
		return Integer.compare(this.data, newNode.data);
	}
}