import java.math.BigInteger;

public class Euler16 {
    public static void main(String[] args) {
        BigInteger bi1, bi2;
        bi1 = new BigInteger("2");
        int exponent = 1000;
        bi2 = bi1.pow(exponent);
        String s = bi2.toString();
        System.out.println(bi2);
        String y[] = (s.split(""));
        System.out.println(y.length);
        int result = 0;
        int x[] = new int[302];
        for(int i=0; i <= y.length-1; i++){
            x[i] = Integer.parseInt(y[i]);
            result += x[i];
        }
        System.out.println(result);
    }
}
