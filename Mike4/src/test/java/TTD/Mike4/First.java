package TTD.Mike4;

import static org.junit.Assert.*;

import org.junit.Test;

public class First {
	
	FirstClass fc = new FirstClass();

	@Test
	public void test1() {
		int result;
		result = fc.addition(2,4);
		if(result!=6) {
			fail("Error adding 2 and 4");	
		}
	}
	
	@Test
	public void test2() {
		int result;
		result = fc.addition(6,9);
		if(result!=15) {
			fail("Error adding 6 and 9");	
		}
	}
	

}
