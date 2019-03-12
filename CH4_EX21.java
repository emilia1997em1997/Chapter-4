import java.util.Scanner;

public class CH4_EX21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int number6;
        int number7;
        int number8;
        int number9;
        int number10;
        int largest = 0;
        int counter;

        int Number1 = input.nextInt();
        System.out.println("Number one is: ");

        int Number2 = input.nextInt();
        System.out.println("Number two is: ");

        int Number3 = input.nextInt();
        System.out.println("Number three is: ");

        int Number4 = input.nextInt();
        System.out.println("Number four is: ");

        int Number5 = input.nextInt();
        System.out.println("Number five is: ");

        int Number6 = input.nextInt();
        System.out.println("Number six is: ");

        int Number7 = input.nextInt();
        System.out.println("Number seven is: ");

        int Number8 = input.nextInt();
        System.out.println("Number eight is: ");

        int Number9 = input.nextInt();
        System.out.println("Number nine is: ");

        int Number10 = input.nextInt();
        System.out.println("Number ten is: ");


        for (int Counter = 0; Counter <= 10; Counter++) {
            System.out.println("Counter is: " + Counter);
        }


        if (Number1 > largest) {
            largest = Number1;
        }
        if (Number2 > largest) {
            largest = Number2;

        }
        if (Number3 > largest) {
            largest = Number3;

        }
        if (Number4 > largest) {
            largest = Number4;

        }
        if (Number5 > largest) {
            largest = Number5;

        }
        if (Number6 > largest) {
            largest = Number6;

        }
        if (Number7 > largest) {
            largest = Number7;

        }
        if (Number8 > largest) {
            largest = Number8;

        }
        if (Number9 > largest) {
            largest = Number9;
        }
        if (Number10 > largest) {
            largest = Number10;
        }
        System.out.println("The largest number is: " + largest);


    }
}