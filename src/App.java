import java.math.BigDecimal;
import java.math.BigInteger;

public class App {
    public static void main(String[] args) {

        BigInteger num = new BigInteger("667676855656567657097128889898098965412");
        BigInteger num2 = new BigInteger("56542211334679900098533224567892345678900988");
        BigInteger num3 = num.gcd(num2);
        System.out.println(num3);

        BigDecimal dec = new BigDecimal("7878787878.211122223356076867");
        BigDecimal dec2 = new BigDecimal("3423233434558.55634223124655676");
        BigDecimal dec3 = dec.pow(2);
        System.out.println(dec3);
        BigDecimal dec4 = dec2.pow(2);
        System.out.println(dec4);
    }
}
