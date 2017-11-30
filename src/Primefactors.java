import java.util.Scanner;

public class Primefactors {

    public static void main(String[] args)
    {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Input n:");
        n = Integer.parseInt(in.next());
        System.out.println("Output:");
        int k = (int) Math.sqrt(n);
        if(n==1)
            System.out.println("");
        else
        {
            if (n % 2 == 0)
                System.out.println("" + 2);
            while (n % 2 == 0) {
                n = n / 2;
            }

            for (int i = 3; i <= k; i=i+2) {
                if (n % i == 0)
                    System.out.println("" + i);
                while (n % i == 0) {
                    n = n / i;
                }
            }
            if (n > 2)
                System.out.println("" + n);

        }

    }
}
