import java.util.Scanner;
public class CH4_EX17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Tankful1;
        int miles1 = 0;
        int galons1 = 0;
        float sum1 = 0.0f;
        System.out.println("Enter MILES1: ");
        miles1 = input.nextInt();
        System.out.println("Enter Galons1: ");
        galons1 = input.nextInt();

       sum1 = miles1 + galons1;
        System.out.println("TANFUL1 MILES + GALONS: " + sum1);

        String Tankful2;
        int miles2 = 0;
        int galons2 = 0;
        float sum2 = 0.0f;
        System.out.println("Enter MILES2: ");
        miles2 = input.nextInt();
        System.out.println("Enter Galons2: ");
        galons2 = input.nextInt();

        sum2 = miles2 + galons2;
        System.out.println("TANFUL2 MILES + GALONS: " + sum2);

        String Tankful3;
        int miles3 = 0;
        int galons3 = 0;
        float sum3 = 0.0f;
        System.out.println("Enter MILES3: ");
        miles3 = input.nextInt();
        System.out.println("Enter Galons3: ");
        galons3 = input.nextInt();

        sum3 = miles3 + galons3;
        System.out.println("TANFUL3 MILES + GALONS: " + sum3);

        float sum_MILES = miles1 + miles2 + miles3;
        System.out.println("Total MILES: " + sum_MILES);

        float sum_GALONS = galons1 + galons2 + galons3;
        System.out.println("Total GALONS: " + sum_GALONS);

        float sum_MG = sum_MILES + sum_GALONS;
        System.out.println("Total MILES AND GALONS: " + sum_MG);
    }
}
