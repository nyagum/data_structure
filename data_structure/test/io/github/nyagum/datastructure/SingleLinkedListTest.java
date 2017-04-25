package io.github.nyagum.datastructure;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class SingleLinkedListTest
{
	private SingleLinkedList singleLinkedList;
	
	@Before
	public void setUpSinglelinkedlistTest()
	{
		singleLinkedList=new SingleLinkedList();
	}

	/**
	 * 출력되는지 확인
	 */
	@Test
	public void testAddInt()
	{
		boolean[] expectedValues=new boolean[1000];
		Arrays.fill(expectedValues, true);
		boolean[] returnValues=new boolean[1000];
		
		for(int i=0; i<1000; i++)
			returnValues[i]=singleLinkedList.add(i);
		assertArrayEquals(expectedValues, returnValues);
	}

	@Test
	public void testContains()
	{
		singleLinkedList.add(2);
		singleLinkedList.add(3);
		singleLinkedList.add(4);
		singleLinkedList.add(5);
		
		//when
		boolean returnValue= singleLinkedList.contains(10);
		
		assertTrue(returnValue);
	}

	@Test
	public void testGet()
	{
		//디버그는 어떻게?
		//given
		singleLinkedList.add(2);
		singleLinkedList.add(3);
		singleLinkedList.add(4);
		singleLinkedList.add(5);
		
		//when
		int returnValue= singleLinkedList.get(10);
		
		//then
		assertTrue(returnValue<0);
	}
	
	@Test
	public void testindexOf()
	{
		singleLinkedList.add(2);
		singleLinkedList.add(3);
		singleLinkedList.add(4);
		singleLinkedList.add(5);
		
		int returnValue= singleLinkedList.indexOf(10);
		
		assertTrue(returnValue<0);
	}
}
