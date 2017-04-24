package io.github.nyagum.datastructure;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
	private BinaryTree btree;
	
	@Before
	public void setUp() {
		btree = new BinaryTree();
	}
	
	@Test
	public void testInOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertData() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRoot() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

	@Test
	public void testFind() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		boolean isDelete=false;
		BinaryTree btree=new BinaryTree();
		btree.InOrder(btree.getRoot());System.out.println();
		isDelete =btree.Delete(20);
		assertFalse(isDelete);
		
		btree.InOrder(btree.getRoot());System.out.println();
		btree.insertData(20);
		btree.InOrder(btree.getRoot());System.out.println();
	
		isDelete =btree.Delete(20);
		assertTrue(isDelete);
		btree.InOrder(btree.getRoot());System.out.println();
		
		/*
		boolean isDelete = btree.Delete(20);
		assertTrue(isDelete);
		*/
		btree.InOrder(btree.getRoot());System.out.println();
	}
	
	/**
	 * �������� ��带 �����Ϸ��� �� ���, false�� Ƽ���ϴ��� Ȯ����.
	 */
	@Test
	public void testDeleteOutOfRange() {
		// given
//		BinaryTree btree=new BinaryTree();
		btree.InOrder(btree.getRoot());
		System.out.println();
		
		// when
		boolean isDelete = btree.Delete(20);
		
		// then
		assertFalse(isDelete);
	}
}
