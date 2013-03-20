package learn1;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo1 {
	static Person person;
	@BeforeClass
public static void beforeClass(){
		person=new Person();
		System.out.println("beforeClass");
	}
	@Test
public void testRun(){
	
	person.run();
	
}
@Test
public void testEat(){
	person.eat();
}
@AfterClass
public static void afterClass(){
	person=null;
	System.out.println("afterClass");
}
}
