/**
 * Created by udaka on 8/4/16.
 */
 public class Problem6 {

    public static void main(String[] args) {
        long sumOfSquare = 0;
        long total = 0;
        long squareOfSum = 0;

        for (int i=1; i<=100 ; i++) {
            sumOfSquare = (i*i) + sumOfSquare;
            total+=i;

        }
        squareOfSum = total*total;

        System.out.println("Total : " +total);
        System.out.println("Sum of Square: " + sumOfSquare);
        System.out.println("Square of Sum: " + squareOfSum);

        System.out.println("Difference between the sum of the squares and square of the sum: " + (squareOfSum - sumOfSquare));

    }


}
