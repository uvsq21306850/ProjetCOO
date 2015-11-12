package fr.uvsq.coo.ex3_1;
/*
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite; 


  //Unit test for simple App.
 
public class AppTest 
    extends TestCase
{
    
     //Create the test case
     
     // @param testName name of the test case
     
    public AppTest( String testName )
    {
        super( testName );
    }

    
     // @return the suite of tests being tested
     
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    
     // Rigourous Test :-)
     
    public void testApp()
    {
        assertTrue( true );
    }
}

*/
import org.junit.Test;

import fr.uvsq.coo.ex3_1.MyUnit;

import static org.junit.Assert.*;

public class MyUnitTest {

    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}
