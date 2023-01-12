import java.util.Scanner;
import java.util.Date;
public class BlockWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Give me your name :)");
        String name = in.nextLine();

        System.out.println("Give me your age :)");
        int age = in.nextInt();

        System.out.println("How money do you need to end your working?");
        double moneyGoal = in.nextDouble();

        System.out.println("How money will you put in a month?");
        double monthAdd = in.nextDouble();

        System.out.println("How percent have your bank?");
        double percent = in.nextDouble();

        double balance = 0;
        int years = 0;

        while(balance < moneyGoal){
            balance = balance + monthAdd;
            double interest = monthAdd * percent / 100;
            balance = balance + interest;
            years++;
        }
        System.out.printf("Today is %te So you are %s and you have %d years old. ", new Date(), name, age);
        System.out.println("You can stop work at " + years + " years.");
    }
}