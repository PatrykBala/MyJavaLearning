import java.util.Scanner;
public class ControlFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Your year target");
        int target = in.nextInt();
        System.out.println("Your current status of target");
        int current = in.nextInt();

        String success = "Great job.";
        String fail = "You must work harder!";

        if (current >= target) {
            System.out.println(success);
        }
        else{
            System.out.println(fail);
        }
    }
}