import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of saving money: ");
        double money =input.nextDouble();
        System.out.print("Enter interest rate per year: ");
        double interestRate=input.nextDouble();
        System.out.println("Enter number of months: ");
        int month = input.nextInt();
        System.out.println("Amount of interest customer get:  "+ interestCaculater(money,interestRate,month));
    }
    public static double interestCaculater(double money, double interesRate, int month){
        double interest = money*(interesRate/100)/12*month;
        return  interest;
    }

}
