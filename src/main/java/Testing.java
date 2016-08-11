/**
 * Created by udaka on 8/2/16.
 */
public class Testing {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long i=0;
        long msgCount = 0;
        while ( i < 1000000000 )

        {
            i++;
            float current = ((System.currentTimeMillis() - start)/1000);
            if (current >= 1) {
                System.out.println("Message Count : " + i);
                msgCount = i - msgCount;
                System.out.println("Messages between last " + current + " Seconds : "+ msgCount);
               // System.out.println("Time is :" + current);
                start = System.currentTimeMillis();
            }

        }
    }
}
