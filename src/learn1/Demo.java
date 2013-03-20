package learn1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo {
	Person person;
	@Before
public void before(){
		person=new Person();
		System.out.println("before");
	}
	@Test
public void testRun(){
	
	person.run();
	
}
@Test
public void testEat(){
	person.eat();
}
@After
public void after(){
	person=null;
	System.out.println("after");
}
}
