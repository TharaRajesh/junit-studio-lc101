package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void withoutBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets( "[]"));
    }
    @Test
    public void stringInBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets( "[LaunchCode]"));
    }
    @Test
    public void bracketsInMiddleOfStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets( "Launch[Code]"));
    }
    @Test
    public void bracketsBeforeStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets( "[]LaunchCode"));
    }
    @Test
    public void bracketsStartingStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets( "[Launch]Code"));
    }
    @Test
    public void unclosedBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets( "[LaunchCode"));
    }
   @Test
    public void notBracketsClosedReturnsFalse(){
       assertFalse(BalancedBrackets.hasBalancedBrackets( "LaunchCode["));
   }
    @Test
    public void misplacedBracketsMiddleStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets( "Launch]Code["));
    }
    @Test
    public void misplacedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets( "]["));
    }
    @Test
    public void singleBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets( "["));
    }


}
