package io.github.nyagum.datastructure;

public class TestMain
{
	public static void main(String[] args)
	{
		BinaryTree btree=new BinaryTree();
		btree.insertData(20);
		btree.InOrder(btree.getRoot());System.out.println();
		btree.insertData(25);
		btree.InOrder(btree.getRoot());System.out.println();
		btree.insertData(15);
		btree.InOrder(btree.getRoot());System.out.println();
		btree.insertData(18);
		btree.InOrder(btree.getRoot());System.out.println();
		btree.insertData(10);
		btree.InOrder(btree.getRoot());System.out.println();
		btree.insertData(16);
		btree.InOrder(btree.getRoot());System.out.println();
		btree.insertData(19);
		btree.InOrder(btree.getRoot());System.out.println();
		if(btree.Find(15)){
			System.out.println(" ã�ҽ��ϴ�.");
		}else{
			System.out.println("��ã�ҽ��ϴ�.");
		}
		btree.Delete(15);
		btree.InOrder(btree.getRoot());System.out.println();
		//https://codereview.stackexchange.com/questions/65265/inserting-a-node-in-binary-search-tree
		
	}	
}
