package io.github.nyagum.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest
{

	@Test
	public void testPush()
	{
		fail("Not yet implemented");
		
	}

	@Test
	public void testPop()
	{
		Stack myStack=new Stack();
		
		for(int i=0; i<1000; i++)
		{
			myStack.push(i);
		}
		
		
		myStack.pop();
		
		
		
	}

	@Test
	public void testPrintStack()
	{
		fail("Not yet implemented");
	}

}
