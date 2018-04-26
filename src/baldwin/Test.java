package baldwin;

import java.util.Scanner;

/***************************************************
 *
 * Project: NSALoginController 
 *
 * Created by: davidbaldwin.toUpperCase() on 4/25/18 at 7:39 PM.
 *
 ***************************************************/
public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String input = scanner.nextLine();

        User newUser = new User(input);
        System.out.printf("Password: %s%n", newUser.getPassword());
        System.out.printf("Salt: %s%n", newUser.getSalt());
        System.out.printf("Hashed Password: %s%n", newUser.getHashedPassword());
        try {
            NSALoginController.hashUserPassword(newUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.printf("Password: %s%n", newUser.getPassword());
        System.out.printf("Salt: %s%n", newUser.getSalt());
        System.out.printf("Hashed Password: %s%n", newUser.getHashedPassword());
    }

}
