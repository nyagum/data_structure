package io.github.nyagum.datastructure;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class QueueTest
{
	private Queue queue;
	@Before
	public void setUp()
	{
		queue=new Queue();
	}
	
	@Test
	public void testEnQueue()
	{
		for(int i=0; i<1000; i++)
		{
			queue.EnQueue(i);
		}

		assertTrue(queue.DeQueue()==0);	
	}
}
