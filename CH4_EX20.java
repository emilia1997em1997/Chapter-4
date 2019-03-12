
import java.util.Scanner;

public class CH4_EX20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Employee1
        String FirstName1 = input.nextLine();
        System.out.println("First name employee is: " + FirstName1);

        String LastName1 = input.nextLine();
        System.out.println("Last name employee is: " + LastName1);
        //Hours for week
        float HoursWorked1 = input.nextFloat();
        System.out.println("Hours worked last week: " + HoursWorked1);
        //Overtime for week
        float HourlyRates1 = input.nextFloat();
        System.out.println("Hourly rates last week: " + HourlyRates1);
        //Pay for 1H
        float PaymentforHour = input.nextFloat();
        System.out.println("Payment for 1 hour is: " + PaymentforHour);

        float HoursPay = PaymentforHour * HoursWorked1;
        System.out.println("First, calculate regular pay: " + HoursPay);

        float OvertimePay = (float) (PaymentforHour * 1.5 * HourlyRates1);
        System.out.println("Overtime pay is: " + OvertimePay);

        float Gross = HoursPay + OvertimePay;
        System.out.println("The total gross pay for the weekly pay period is " + Gross);

        //Employee2

        String FirstName2 = input.nextLine();
        System.out.println("First name employee is: " + FirstName2);

        String LastName2 = input.nextLine();
        System.out.println("Last name employee is: " + LastName2);
        //Hours for week
        float HoursWorked2 = input.nextFloat();
        System.out.println("Hours worked last week: " + HoursWorked2);
        //Overtime for week
        float HourlyRates2 = input.nextFloat();
        System.out.println("Hourly rates last week: " + HourlyRates2);
        //Pay for 1H
        float PaymentforHour2 = input.nextFloat();
        System.out.println("Payment for 1 hour is: " + PaymentforHour2);

        float HoursPay2 = PaymentforHour2 * HoursWorked2;
        System.out.println("First, calculate regular pay: " + HoursPay2);

        float OvertimePay2 = (float) (PaymentforHour2 * 1.5 * HourlyRates2);
        System.out.println("Overtime pay is: " + OvertimePay2);

        float Gross2 = HoursPay2 + OvertimePay2;
        System.out.println("The total gross pay for the weekly pay period is " + Gross2);








    }
}