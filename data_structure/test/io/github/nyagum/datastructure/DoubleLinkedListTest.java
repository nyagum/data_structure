package io.github.nyagum.datastructure;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class DoubleLinkedListTest
{
	private DoubleLinkedList linkedList;
	
	@Before
	public void setUp(){
		linkedList = new DoubleLinkedList();
	}
	
	@Test
	public void testAddInt()
	{
		boolean[] expectedValues=new boolean[1000];
		Arrays.fill(expectedValues, true);
		boolean[] returnValues=new boolean[1000];
		
		for(int i=0; i<1000; i++)
			returnValues[i]=(boolean)linkedList.add(i);
		assertArrayEquals(expectedValues, returnValues);
	}

	@Test
	public void testAddIntInt1()
	{
		boolean[] expectedValues=new boolean[1000];
		Arrays.fill(expectedValues, true);
		boolean[] returnValues=new boolean[1000];
		
		for(int i=0; i<1000; i++)
			returnValues[i]=(boolean)linkedList.add(i, 1000-i);
		assertArrayEquals(expectedValues, returnValues);
	}
	@Test
	public void testAddIntInt2()
	{
		for(int i=0; i<1000; i++){
			linkedList.add(i, i);
		}
		boolean returnValue=linkedList.add(275, 300);
		assertTrue(returnValue);
	}
	
	@Test
	public void testOutOfRange()
	{
		for(int i=0; i<1000; i++){
			linkedList.add(i, i);
		}
		boolean returnValue=linkedList.add(111000, 3);
		assertFalse(returnValue);
	}
	
	@Test
	public void testGetOutofRange1()
	{
		int returnValue=linkedList.get(0);
		assertTrue(returnValue<0);
	}
	
	public void testGetOutofRange2()
	{
		for(int i=0; i<1000; i++){
			linkedList.add(i, i);
		}
		int returnValue=linkedList.get(123434);
		assertTrue(returnValue<0);
	}
	

}
