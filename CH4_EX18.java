import java.util.Scanner;

//Department-store customer
public class CH4_EX18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Account = input.nextInt();
        System.out.println("Account number is: " + Account);

        int Balance = input.nextInt();
        System.out.println("Balance at the beginning of the month is: " + Balance);

        int Items = input.nextInt();
        System.out.println("Total of all items charged by the customer this month is: " + Items);

        int Credits = input.nextInt();
        System.out.println("Total of all credits applied to the customer’s account this month is: " + Credits);

        int Credit_Limit = input.nextInt();
        System.out.println("Allowed credit limit is: " + Credit_Limit);

        int NEWBALANCE = Balance + Items - Credits;
        System.out.println("New balance is: " + NEWBALANCE);

        //For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".
        if (NEWBALANCE > Credit_Limit) {
            System.out.println("CREDIT LIMIT EXCEDED");
        }
    }
}
