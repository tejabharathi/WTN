package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class test2 {


	@Test
	public void testSortValues() {
		DailyTasks d = new DailyTasks();
	    int in[]= {3,2,1};
	    int out[]= {1,2,3};
	    assertArrayEquals( out, d.sortValues(in) );
	}

}
