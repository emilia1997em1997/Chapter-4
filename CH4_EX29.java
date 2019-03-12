import java.util.Scanner;

public class CH4_EX29 {
    public static void main(String[] args) {
        System.out.print("Enter the size of the side of a square: ");
        Scanner input = new Scanner(System.in);
        int NUMBER = input.nextInt();
        String R1 = repeat1("*", NUMBER);
        String R2 = repeat2("*", NUMBER);
        System.out.println(R1);
        System.out.print(R2);
        System.out.print(R1);
    }
    public static String spaces(int i)
    {
        String Space = "";
        for (int j = 1; j <= (2 * i - 3); j++)
        {
            Space = Space + " ";
        }
        return Space;
    }

    public static String repeat1(String s, int i)
    {
        String tst = "";
        for (int j = 1; j <= i; j++)
        {
            tst = s + " " + tst;
        }
        return tst;
    }

    public static String repeat2(String s, int i)
    {
        spaces(i);
        String tst1 = "";

        for (int j = 1; j <= i - 2; j++)
        {
            tst1 = s + spaces(i) + s + "\n" + tst1;
        }

        return tst1;
    }
}
