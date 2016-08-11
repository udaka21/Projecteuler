import java.util.ArrayList;
import java.util.List;


public class Problem3 {
    public static void main(String[] args) {

        System.out.println("Prime factors of 600851475143");
        for (Long number1 : primeFactors(6008514) ){
            System.out.println(number1);
        }

    }

    public static List<Long> primeFactors(long number) {
            long n = number;
            ArrayList<Long> factors = new ArrayList<Long>();
            for (long i = 2; i <= n; i++) {
                while (n % i == 0) {
                    factors.add(i);
                    n /= i;
                    //i--;
                }
            }
            return factors;
        }
}





