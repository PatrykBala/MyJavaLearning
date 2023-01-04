import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Give me your name");
        String name = in.nextLine();
        System.out.println("How old are you?");
        int age = in.nextInt();
        System.out.println("Your name is " + name + " and you are " + age + " years old.");
    }
}