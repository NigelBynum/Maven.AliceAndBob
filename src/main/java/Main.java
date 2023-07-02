/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Objects;
import java.util.Scanner;
public class Main {


    public static void main(String[] args ) {
        // his or her name to equal alice and bob
        // I need it to greet alice and bob
        String user;

        System.out.println("Insert Name: ");
        Scanner nigel = new Scanner(System.in);
        user = nigel.nextLine();


        if (Objects.equals(user, "Alice") || Objects.equals(user, "Bob")) {
            System.out.println("Greetings " + user);

        }
    }}
