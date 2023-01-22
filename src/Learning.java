import java.util.Scanner;
public class Learning{
    public static final int ageAuthor = 33;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello. This is simple console program.");
        System.out.println("What is your first name?");
        String firstName = in.next();

        System.out.println("Great :) So your first name is " + firstName);
        System.out.println("What is your surname?");
        String surname = in.next();

        System.out.println("Nice to meet you " + firstName + " " + surname);
        System.out.println("Author of this console program is " + ageAuthor + " years old. How old are you?");
        int age = in.nextInt();
        int ageDifference = ageAuthor - age;
        if (ageDifference > 0) {
            System.out.println("You are younger than the author. " + "You have " + ageDifference + " years less.");
        }
        else if (ageDifference < 0) {
            System.out.println("You are older than the author.");
        }
        else {
            System.out.println("You are the same age as the author.");
        }
    }
}