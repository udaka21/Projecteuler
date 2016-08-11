/**
 * Created by udaka on 8/2/16.
 */
public class Problem1 {

    public static void main(String[] args) {

        int i= 0, x= 0;
        int j= 0, y= 0;
        final int NUMBER_LIMIT =1000;

        for (int k= 1; k < NUMBER_LIMIT ; k++){
            i++;
            j++;

            if (i % 3 == 0) {
                x = x+ i;
                //System.out.println(k + ":" + i);
            }
            if ((j % 5 == 0) && (i % 3 != 0)) {
                y = y+ j;
               // System.out.println(k + ":" + j);
            }

        }

        System.out.println("The natural numbers below " + NUMBER_LIMIT + " that are multiples of 3 or 5 : " +
                ( x + y));

    }


}
