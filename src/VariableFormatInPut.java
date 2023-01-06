import java.util.Scanner;
public class VariableFormatInPut {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Hello");
        System.out.println("What is your full name?");
        String name = in.nextLine();
        System.out.println(name + ". This is nice full name :)");

        System.out.println("How old you are?");
        int age = in.nextInt();
        System.out.println("It is good age :)");

        System.out.printf("So, your full name is %s and you have %d old", name, age);
    }
}