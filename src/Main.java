import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello World");

        System.out.println("Welcome back to Java");

        int favNum = SafeInput.getRangedInt(in, "Enter your fav num", 1, 10);

        System.out.println("Fav num is " + favNum);

    }
}
