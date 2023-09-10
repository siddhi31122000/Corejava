package testex;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LifeCycleDemoTest {
	@BeforeClass
	public static void beforeAll() {
		System.out.println("connect to the data base");
		}
	@Before
	public void beforeEach( ) {
		System.out.println("Load the schema ");
		}
	@After
	public  void afterEach() {
		System.out.println("Drop the Schema");
	}
    @AfterClass
    public static void afterAll() {
	System.out.println("Disconnect from the database ");
    }
    @Test
    public  void testOne() {
	System.out.println("Test One");
    }
    @Test
    public  void testTwo() {
	System.out.println("test Two");
}



}
