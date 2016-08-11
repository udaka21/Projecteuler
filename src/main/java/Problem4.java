/**
 * Created by Udaka on 8/3/16.
 */
public class Problem4 {

    public static void main(String[] args) {
        long i, j, k ;
        long[] anArray = new long[6];
        long maxNumber=0;

        for (i=99; i<=999; i++) {
            System.out.println("");
            for (j=99; j<=999; j++) {
                k = i * j ;

                anArray[0] = k%10;
                anArray[1] = (k/10)% 10;
                anArray[2] = (k/100)%10;
                anArray[3] = (k/1000)%10;
                anArray[4] = (k/10000)%10;
                anArray[5] = (k/100000)%10;


                if ((anArray[0]== anArray[5]) && (anArray[1]== anArray[4]) && (anArray[2]==anArray[3])
                        ) {
                    if ( maxNumber < k) {
                        maxNumber = k;
                    }
                    System.out.println("Number is: " + maxNumber + " , ");
//                    System.out.println(i +"x" + j +" :" + anArray[0] + anArray [1] +
//                            anArray[2] + anArray [3] + anArray[4] + anArray[5]);
                }
               // System.out.print(k + " , ");
            }
        }

    }

}
