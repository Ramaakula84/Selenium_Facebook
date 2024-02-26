package testproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class testadd {

	@Test
	public void testadd(){
		Addition t=new Addition();
		int actual=t.sum(10,20);
		int expected=30;
		assertEquals(expected,actual);
	}

}
