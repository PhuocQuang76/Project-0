/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.revature;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        JavalinDriver classUnderTest = new JavalinDriver();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
