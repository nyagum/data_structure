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
		
		btree.Delete(20);
		btree.InOrder(btree.getRoot());System.out.println();
		/*	
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
		
		System.out.println(btree.Find(20).getData()+"sisisisisi");
		btree.Delete(20);
		btree.InOrder(btree.getRoot());System.out.println();
		if(btree.Find(15)){
			System.out.println(" 찾았습니다.");
		}else{
			System.out.println("못찾았습니다.");
		}*/
		//https://codereview.stackexchange.com/questions/65265/inserting-a-node-in-binary-search-tree
		
	}	
}
