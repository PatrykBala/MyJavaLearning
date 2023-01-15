import java.util.Scanner;
public class ControlFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your cash target ?");
        int goal= in.nextInt();
        System.out.println("How many cash put you at year?");
        int payment = in.nextInt();

        int current = 0;
        int years = 0;

        while (current < goal) {
            current = current + payment;
            years++;
        }
        System.out.println("You need " + years + " years to to get your " + goal + " cash goal.");
    }
}