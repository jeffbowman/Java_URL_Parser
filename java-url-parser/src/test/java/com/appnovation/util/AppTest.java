package com.appnovation.util;

import java.net.URL;

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
     * @throws Exception 
     */
    public void testProtocol() throws Exception
    {
    	URL exampleURL = new URL("http://docs.oracle.com:80/javase/7/docs/api/java/net/URL.html?name=ClassURL");
		
    	if (exampleURL.getProtocol().equalsIgnoreCase("http")){ 
    		
    		assertTrue( true );
    	}
    	else{
    		assertTrue( false );
    	}
    	System.out.println("Protocol = " + exampleURL.getProtocol());
    }
    
    public void testHost() throws Exception
    {
    	URL exampleURL = new URL("http://docs.oracle.com:80/javase/7/docs/api/java/net/URL.html?name=ClassURL");
		
    	if (exampleURL.getHost().equalsIgnoreCase("docs.oracle.com")) {
    		
    		assertTrue( true );
    	}
    	else{
    		assertTrue( false );
    	}
    	System.out.println("Host = " + exampleURL.getHost());
    }
    
    public void testPort() throws Exception
    {
    	URL exampleURL = new URL("http://docs.oracle.com:80/javase/7/docs/api/java/net/URL.html?name=ClassURL");
		
    	if (exampleURL.getPort() == 80) {
    		
    		assertTrue( true );
    	}
    	else{
    		assertTrue( false );
    	}
		System.out.println("Port = " + exampleURL.getPort());
    }
    
    public void testPath() throws Exception
    {
    	URL exampleURL = new URL("http://docs.oracle.com:80/javase/7/docs/api/java/net/URL.html?name=ClassURL");
		
    	if (exampleURL.getPath().equalsIgnoreCase("/javase/7/docs/api/java/net/URL.html")) {
    		
    		assertTrue( true );
    	}
    	else{
    		assertTrue( false );
    	}
		System.out.println("Path = " + exampleURL.getPath());
    }
    
    public void testQuery() throws Exception
    {
    	URL exampleURL = new URL("http://docs.oracle.com:80/javase/7/docs/api/java/net/URL.html?name=ClassURL");
		
    	if (exampleURL.getQuery().equalsIgnoreCase("name=ClassURL")) {
    		
    		assertTrue( true );
    	}
    	else{
    		assertTrue( false );
    	}
		System.out.println("Query = " + exampleURL.getQuery());
    }
}
