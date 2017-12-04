import java.util.Scanner;

public class Mainmenu {

public static void main(String[] Args)
{
    int choice;
    Triangle t = new Triangle();
    Diamond d = new Diamond();
    FizzBuzz f = new FizzBuzz();
    Primefactors p = new Primefactors();
    choice = 1;

    while(choice!=5) {


        System.out.println("1.Triangle Exercises");
        System.out.println("2.Diamond Exercises");
        System.out.println("3.FizzBuzz Exercise");
        System.out.println("4.Primefactors Exercise");
        System.out.println("5.Exit");
        System.out.println("Enter your choice(1-5):");
        Scanner in = new Scanner(System.in);
        choice = Integer.parseInt(in.next());

        if(choice == 1)
            t.run();
        else if(choice == 2)
            d.run();
        else if (choice == 3)
            f.run();
        else if (choice == 4)
            p.run();
    }
}

}

