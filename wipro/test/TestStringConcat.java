package wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {
	@Test
	public void test() {
		DailyTasks d = new DailyTasks();
	String m =	d.doStringConcat("Pavan","Kalyan");
	 assertEquals("Pavan Kalyan",m);  
	}

}
