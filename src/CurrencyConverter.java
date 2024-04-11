import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter {

    protected static final int DECIMAL_DIGITS = 2;

    public static void main(String[] args) {
        System.out.println("Hello Currency Converter");
        System.out.println("Added code on dev branch");
    }

    public BigDecimal convert(BigDecimal originalAmount, BigDecimal conversionRate) {
        BigDecimal convertedAmount = originalAmount.multiply(conversionRate);
        return convertedAmount.setScale(DECIMAL_DIGITS, RoundingMode.HALF_UP);
    }

    public boolean isValidRate(BigDecimal valueOf) {
        // TODO Auto-generated method stub
        return false;
    }

}
