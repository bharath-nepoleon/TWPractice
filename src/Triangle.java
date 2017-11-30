import java.util.Scanner;

public class Triangle {

   public static void main(String[] args)
    {
        Scanner in;
        System.out.println("Printing one asterisk");
        System.out.println("*");
        in = new Scanner(System.in);

        System.out.println("Input n:");
        int n=Integer.parseInt(in.next());
        System.out.println("Printing horizontal line");
        for(int i=0;i<n;i++)
           System.out.print("*");
        System.out.println("");
        System.out.println("Printing vertical line");
        for(int i=0;i<n;i++)
            System.out.println("*");
        System.out.println("Printing right triangle");

    }
}
