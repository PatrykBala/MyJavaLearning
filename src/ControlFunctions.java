import java.util.Scanner;
public class ControlFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choice is your: 1, 2, 3, 4, 5");
        int choice = in.nextInt();
        switch (choice){
            case 1:
                System.out.println("You choice is 1.");
                break;
            case 2:
                System.out.println("You choice is 2.");
                break;
            case 3:
                System.out.println("You choice is 3.");
                break;
            case 4:
                System.out.println("You choice is 4.");
                break;
            case 5:
                System.out.println("You choice is 5.");
                break;
        }
        System.out.println("End of program");
    }
}