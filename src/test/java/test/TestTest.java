package test;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class TestTest {
	final static Logger logger = Logger.getLogger(TestTest.class);
	
	@Test
	public void test1() {
		Assert.assertTrue("First result", true);
	}
	
	
	@Test
	public void test2() {
		Assert.assertTrue("Second result", true);
	}

}
