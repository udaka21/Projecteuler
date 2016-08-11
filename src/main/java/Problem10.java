/**
 * Created by udaka on 8/9/16.
 */
public class Problem10 {

    public static void main(String[] args) {
        long count=0, num =1;
        long limit = 2000000;
        long i , total=0;

        while (count < limit) {
            count = count +1;
            System.out.println("Count is : " + count);
            for ( i = 2; i <= count; i++){
                if (count % i == 0) {
                    break;
                }
            }
            if (count == i) {
                total=total+count;
                System.out.println("Total : " + total);
            }


        }
        System.out.println("The sum of the primes below "+ limit + " is: " + total);
    }
}
