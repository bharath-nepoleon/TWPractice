import java.util.Scanner;

public class Diamond {

    public static void main(String[] args)
    {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Input n:");
        n = Integer.parseInt(in.next());
        System.out.println("Printing Isosceles Triangle:");
        for(int i=0,j=1;i<n;i++,j=j+2) {
            for (int k = 0; k < j; k++)
                System.out.print("*");
            System.out.println("");

        }

        System.out.println("Printing Diamond:");
        for(int i=0,j=1;i<n;i++,j=j+2) {
            for (int k = 0; k < j; k++)
                System.out.print("*");
            System.out.println("");
            if (i == n - 1) {
                while (j >= 1) {
                    j = j - 2;
                    for (int k = 0; k < j; k++)
                        System.out.print("*");

                    System.out.println("");
                }

            }
        }
            System.out.println("Printing name Diamond:");
            for(int i=0,j=1;i<n;i++,j=j+2) {
                if(i==n-1)
                    System.out.print("bharath");
                else
                {
                for (int k = 0; k < j; k++)
                    System.out.print("*");
                }
                System.out.println("");
                if(i==n-1)
                {
                    while(j>=1) {
                        j=j-2;
                        for (int k = 0; k < j; k++)
                            System.out.print("*");

                        System.out.println("");
                    }

                }


            }

    }



}
