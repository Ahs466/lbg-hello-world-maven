package com.qa;

import org.junit.jupiter.api.Test;
import static com.qa.App.sayHello;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test_shouldAnswerWithTen()
    {
        int answer = 10;
        assertEquals(10, answer );
    }

    @Test
    public void test_shouldAnswerWithFalse()
    {
        assertFalse( false );
    }

    @Test
    public void test_sayHello_should_return_Hello_World()
    {
        // Arrange
        String actualResponse = "";
        String expectedResponse = "Hello World!";

        // Act
        actualResponse = sayHello();
        // Assert
        assertEquals( expectedResponse, actualResponse);
    }

    this is what ive already got in my App. java: package com.qa; /** * Hello world! * */ public class App { public static void main( String[] args ) { System.out.println(sayHello()); System.out.println(sayHelloToSomeone("Alice")); System.out.println(sayHelloToSomeone("Bob")); System.out.println(sayHelloToSomeone("Charlie")); System.out.println(sayHelloToSomeone("Zena")); System.out.println(sayHelloToSomeone("Anika")); System.out.println(sayGoodbye()); } public static String sayHello(){ return "Hello World!"; } public static String sayGoodbye(){ return "Goodbye World!"; } public static String sayHelloToSomeone(String name){ return "Hello " + name ; } }
Got it! Let's add another test to your AppTest.java to cover the sayGoodbye and sayHelloToSomeone methods. This will ensure those methods are working correctly as well.

Here's how your updated AppTest.java could look:

java
package com.qa;

import org.junit.jupiter.api.Test;
import static com.qa.App.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test_shouldAnswerWithTen()
    {
        int answer = 10;
        assertEquals(10, answer );
    }

    @Test
    public void test_shouldAnswerWithFalse()
    {
        assertFalse( false );
    }

    @Test
    public void test_sayHello_should_return_Hello_World()
    {
        // Arrange
        String actualResponse = "";
        String expectedResponse = "Hello World!";

        // Act
        actualResponse = sayHello();
        // Assert
        assertEquals( expectedResponse, actualResponse);
    }

    @Test
    public void test_sayGoodbye_should_return_Goodbye_World()
    {
        // Arrange
        String actualResponse = "";
        String expectedResponse = "Goodbye World!";

        // Act
        actualResponse = sayGoodbye();
        // Assert
        assertEquals(expectedResponse, actualResponse);
}
