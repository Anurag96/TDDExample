package test.java;

import main.java.StringHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper helperTest =  new StringHelper();
    @Test
    public void testStringHavingAInFirstCharacter(){

        assertEquals("BCD",helperTest.removeAInFirst2Chars("ABCD"));

    }

    @Test
    public void testStringHavingNoAInFirst2Character(){

        assertEquals("BAA",helperTest.removeAInFirst2Chars("BAAA"));

    }

    @Test
    public void testStringWith2Chars(){

        assertEquals("B",helperTest.removeAInFirst2Chars("AB"));

    }
    @Test
    public void testStringWith1Chars(){

        assertEquals("B",helperTest.removeAInFirst2Chars("B"));

    }
    @Test
    public void testStringWith1CharsA(){

        assertEquals("",helperTest.removeAInFirst2Chars("A"));

    }

    @Test
    public void testEmptyString(){

        assertEquals("",helperTest.removeAInFirst2Chars(""));

    }

    @Test
    public void testAdd(){

                  assertEquals(2,helperTest.AdditionofNumber(1,1));
    }

    @Test
    public  void testSquare(){
        assertEquals(4, helperTest.SquareOfNumber(2));
    }
}