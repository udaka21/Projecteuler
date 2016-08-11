/**
 * Created by udaka on 8/3/16.
 */
public class Problem5 {

    public static void main(String[] args) {
        long i , j, k=2520;
        int count = 0;


            while (count!=20) {
                count= 0;
                for (i=1;i<=20;i++ ) {
                    if (k % i == 0) {
                    ++count;
                    }
                }
                ++k;
            }
        System.out.println(--k);
    }
}
