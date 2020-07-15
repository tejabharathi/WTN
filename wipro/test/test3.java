package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class test3 {

	@Test
	public void testCheckPresence() {
		DailyTasks d = new DailyTasks();
		 assertEquals(true, d.checkPresence("hello", "ell"));
	}

}
