package io.github.nyagum.datastructure;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class StackTest
{
	private Stack myStack;
	@Before
	public void setUp(){
		myStack=new Stack();
	}
	@Test
	public void testPop()
	{

		for(int i=0; i<1000; i++)
		{
			myStack.push(i);
		}
		
		int[] expectedValues=new int[1000];
		Arrays.fill(expectedValues, 0, 0, 1000);
		
		int[] returnValues=new int[1000];
		for(int i=0; i<1000; i++)
			returnValues[i]=myStack.pop();
		assertArrayEquals(expectedValues, returnValues);
		
	}
	
	@Test
	public void testPop2(){
		for(int i=0; i<1000; i++)
		{
			myStack.push(i);
		}
		assertTrue(myStack.pop()==999);
	}
}
