/**
 * Created by udaka on 8/2/16.
 */
public class Problem2 {



    public static void main(String[] args) {

        int number1 =1 , number2 =2 , x =0,y =0;
        int number3=2;
        int sumOfTwoNumbers = 2;
        final int NUMBER_LIMIT =4000000;

        while (number3 < NUMBER_LIMIT)
        {
            if (number3 % 2 ==0) {
                x = x+ number3;
            }
//            if (number2 % 2 == 0) {
//                y = y + number2;
//            }


            number3 = number1 + number2;
            if (number3 > NUMBER_LIMIT) {
                break;
            }

            System.out.println(" "+number3);
            number1=number2;
            number2=number3;

        }

        System.out.println("Sum is : " + x);

    }
}
