import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimePrinterTest {
    
    @Test
    public void testIsPrimeWithTwo() {
        assertTrue(PrimePrinter.isPrime(2));
    }
    
    @Test
    public void testIsPrimeWithThree() {
        assertTrue(PrimePrinter.isPrime(3));
    }
    
    @Test
    public void testIsPrimeWithFive() {
        assertTrue(PrimePrinter.isPrime(5));
    }
    
    @Test
    public void testNotPrimeWithFour() {
        assertFalse(PrimePrinter.isPrime(4));
    }
    
    @Test
    public void testNotPrimeWithSix() {
        assertFalse(PrimePrinter.isPrime(6));
    }
    
    @Test
    public void testNotPrimeWithOne() {
        assertFalse(PrimePrinter.isPrime(1));
    }
    
    @Test
    public void testNotPrimeWithZero() {
        assertFalse(PrimePrinter.isPrime(0));
    }
    
    @Test
    public void testIsPrimeWithTen() {
        assertTrue(PrimePrinter.isPrime(7));
    }
    
    @Test
    public void testIsPrimeWithLargePrime() {
        assertTrue(PrimePrinter.isPrime(97));
    }
    
    @Test
    public void testNotPrimeWithLargeNumber() {
        assertFalse(PrimePrinter.isPrime(100));
    }
}