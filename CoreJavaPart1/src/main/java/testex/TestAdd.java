package testex;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;



public class TestAdd {
	public int add (int a,int b) {
		System.out.println("Addtion :"+(a+b));
	return a +b;	
	}
@Test 
public void addtest() { 
	TestAdd t= new TestAdd();
	assertSame(4, t.add(2,2));
}
}