import java.util.Scanner;

/**
 * Created by udaka on 8/6/16.
 */
public class Problem7 {

    public static void main(String[] args) {

//        //define limit
//        int limit = 100;
//
//        System.out.println("Prime numbers between 1 and " + limit);
//
//        //loop through the numbers one by one
//        for(int i=1; i < 100; i++){
//
//            boolean isPrime = true;
//
//            //check to see if the number is prime
//            for(int j=2; j < i ; j++){
//
//                if(i % j == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            // print the number
//            if(isPrime)
//                System.out.print(i + " ");
//        }




        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n to compute the nth prime number: ");

        int nth = sc.nextInt();

        int num, count, i;
        num=1;
        count=0;

        while (count < nth){
            num=num+1;
            for (i = 2; i <= num; i++){
                if (num % i == 0) {
                    break;
                }
            }
            if ( i == num){
                count = count+1;
            }
        }
        System.out.println("Value of nth prime: " + num);




    }

}
