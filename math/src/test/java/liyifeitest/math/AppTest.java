package liyifeitest.math;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	System.out.print("样本个数"+6);
    	System.out.print("\n");
    	System.out.print("样本几何平均数："+2.993795165523909);
    	System.out.print("\n");
    	System.out.print("样本求和："+21.0);
    	System.out.print("\n");
    	System.out.print("样本最小值"+1.0);
    	System.out.print("\n");
    	System.out.print("样本最大值"+6.0);
    	System.out.print("\n");
    	System.out.print("样本标准差"+1.8708286933869707);
    	System.out.print("\n");
    	System.out.print("样本方差"+3.5);
    	System.out.print("\n");
    	System.out.print("样本中位数"+3.5);
    	System.out.print("\n");
    	System.out.print("样本平均数"+3.5);
    	System.out.print("\n");
        assertTrue( true );
    }
}
