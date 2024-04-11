import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CurrencyConverterTest {
    
    private CurrencyConverter converter;
    
    @BeforeEach
    public void setUp() {
        this.converter = new CurrencyConverter();
    }

    @Test
    public void testConvertSimple() {
        BigDecimal originalAmount = BigDecimal.valueOf(100.00);
        BigDecimal conversionRate = BigDecimal.valueOf(2.70);
        BigDecimal expectedResult = BigDecimal.valueOf(270.00).setScale(CurrencyConverter.DECIMAL_DIGITS);
        BigDecimal actualResult = converter.convert(originalAmount, conversionRate);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testConvertRounding() {
        BigDecimal originalAmount = BigDecimal.valueOf(99.99);
        BigDecimal conversionRate = BigDecimal.valueOf(0.055);
        BigDecimal actualResult = converter.convert(originalAmount, conversionRate);
        BigDecimal expectedResult = BigDecimal.valueOf(5.50).setScale(CurrencyConverter.DECIMAL_DIGITS);
        assertEquals(expectedResult, actualResult);        
    }
    
    @Test
    public void testIsValidRate() {
        assertTrue(converter.isValidRate(BigDecimal.valueOf(25.00)));
    }

}
