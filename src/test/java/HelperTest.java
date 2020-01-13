package test.java;

import main.java.Helper;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelperTest {

    Helper helper = new Helper();
    @Test
    public void testStrWith2Char(){

        assertEquals("AB",helper.reverseLast("BA"));
    }
    @Test
    public void testStrWith4Char(){
        Helper helper = new Helper();
        assertEquals("ABDC",helper.reverseLast("ABCD"));
    }

    @Test
    public void testStrWith10Char(){
        Helper helper = new Helper();
        assertEquals("ABCDEFGHJI",helper.reverseLast("ABCDEFGHIJ"));
    }
    @Test
    public void testStrWith1Char(){
        Helper helper = new Helper();
        assertEquals("A",helper.reverseLast("A"));
    }

    @Test
    public void testStrWith0Char(){
        Helper helper = new Helper();
        assertEquals("",helper.reverseLast(""));
    }
}