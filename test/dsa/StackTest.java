package dsa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    @DisplayName("Stack should be empty")
    public void testStack() {
        Stack strings = new Stack();
        assertTrue(strings.isEmpty());
    }

    @Test
    public void testPush() {
        Stack strings = new Stack();
        assertTrue(strings.isEmpty());

        strings.push("G-string");
        assertFalse(strings.isEmpty());

    }

    @Test
    public void testPop() {
        Stack strings = new Stack();
        assertTrue(strings.isEmpty());

        strings.push("G-string");
        assertFalse(strings.isEmpty());

        assertEquals("G-string", strings.pop());
    }

    @Test
    public void pushTwoElements_popOneElement_stackNotEmpty() {

        Stack strings = new Stack();
        assertTrue(strings.isEmpty());

        strings.push("G-string");
        strings.push("D-string");

         strings.pop();
        assertFalse(strings.isEmpty());

    }

    @Test
    public void pushXYZ_popXYZTest(){

        Stack strings = new Stack();
        assertTrue(strings.isEmpty());

        strings.push("G-string");
        strings.push("H-string");
        strings.push("X-string");


        assertEquals("X-string", strings.pop());
        assertEquals("H-string", strings.pop());
        assertEquals("G-string", strings.pop());


    }


}
