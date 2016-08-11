/**
 * Created by udaka on 8/9/16.
 */
public class Problem9 {
    public static void main(String[] args) {
        long a, b, c;

        for (a = 1; a <= 500; a++)
        {
            for (b = (a+1); b  <= 500; b++)
            {
                for (c = (b+1); c <= 500; c++)
                {
                    if (((a * a) + (b * b) == (c * c)) && (a+b+c) == 1000)
                    {
                        System.out.println(a + "  " + b + "  " + c);
                        System.out.println("Product of a,b,c is : " + (a*b*c));
                        break;
                    }


                }
            }
        }
    }
}
