package com.org;

import com.org.business.Person;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.Assert;

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
        assertTrue( true );

    }


    public void testConvertToJson() {
        // Test avec un objet simple
        Person testObject = new Person("John", "Vale");
        String expectedJson = "{\"firstName\":\"John\",\"lastName\":\"Vale\"}";
        String actualJson = App.convertToJson(testObject);
        Assert.assertEquals(actualJson, expectedJson);
    }

    public void testCapitalizeString() {
        // Test avec une chaîne en minuscule
        String input = "hello";
        String expected = "Hello";
        String actual = App.capitalizeString(input);
        Assert.assertEquals(actual, expected);

        // Test avec une chaîne déjà en majuscule
        input = "Hello";
        expected = "Hello";
        actual = App.capitalizeString(input);
        Assert.assertEquals(actual, expected);

        // Test avec une chaîne vide
        input = "";
        expected = "";
        actual = App.capitalizeString(input);
        Assert.assertEquals(actual, expected);

        // Test avec une chaîne null
        input = null;
        expected = null;
        actual = App.capitalizeString(input);
        Assert.assertEquals(actual, expected);
    }






}
