import java.util.Scanner;

public class CH4_EX19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double SHORTS = input.nextDouble();
        System.out.println("Sum for shorts is: " + SHORTS);

        double JEANS = input.nextDouble();
        System.out.println("Sum for jeans is: " + JEANS);

        double SWEATERS = input.nextDouble();
        System.out.println("Sum for sweaters is: " + SWEATERS);

        double NECKWEAR = input.nextDouble();
        System.out.println("Sum for neckwear is: " + NECKWEAR);

        double SOLD_TOTAL = SHORTS + JEANS + SWEATERS + NECKWEAR;
        System.out.println("Sold total is: " + SOLD_TOTAL);

        double PERCENTAGE = (9 * 100 / SOLD_TOTAL);
        System.out.println("Percentage obtained is: " + PERCENTAGE);

        double WEEK_SOLD = 200 + PERCENTAGE;
        System.out.println("Salesperson’s items sold for last week is: " + WEEK_SOLD);

    }
}
